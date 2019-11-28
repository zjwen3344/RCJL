package com.buoyantec.UserController;

import com.buoyantec.BaseController;
import com.buoyantec.Utils.EmRegistType;
import com.buoyantec.Utils.MD5Utils;
import com.buoyantec.Utils.MyBeanUtils;
import com.buoyantec.Utils.RegexUtils;
import com.buoyantec.dataobject.UserDO;
import com.buoyantec.dataobject.enterpriseDO;
import com.buoyantec.dataobject.tokenDO;
import com.buoyantec.error.BusinessException;
import com.buoyantec.error.EmBusinessError;
import com.buoyantec.response.CommonReturnType;
import com.buoyantec.service.ShiroService;
import com.buoyantec.service.TokenService;
import com.buoyantec.service.UserService;
import com.buoyantec.service.model.UserModel;
import com.buoyantec.viewobject.RegisterUSerVO;
import com.buoyantec.viewobject.UserLoginVO;
import com.buoyantec.viewobject.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

//将UserController.class  设置成控制器对象，并且控制器名称是User
@RestController("User")
//设置控制器的URL
@RequestMapping("/User")
public class UserController extends BaseController {
    //使用Service层的Userservice 进行业务处理   实现业务分离

    @Autowired
    private UserService userService;

    @Autowired
    private ShiroService shiroService;

//    @Autowired
//    private  TokenService tokenService;



    @RequestMapping(value="/Login",method = RequestMethod.POST)
    public  CommonReturnType Login(@RequestBody UserLoginVO loginVO) throws BusinessException {
        if(com.alibaba.druid.util.StringUtils.isEmpty(loginVO.getUserName())||com.alibaba.druid.util.StringUtils.isEmpty(loginVO.getPassword()))
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"用户名或密码不能为空");
        //登录
        UserDO userDO= userService.Login(loginVO.getUserName(),loginVO.getPassword());
        if(userDO==null){
            throw  new BusinessException(EmBusinessError.USER_PASSORD_AND_USER_ERROR);

        }

    return CommonReturnType.create( shiroService.createToken(userDO.getLoginName(),userDO.getPassword(),userDO.getTuId()));
    }


    /**
     * 注册接口
     * @param registerUSerVO
     * @return
     * @throws BusinessException
     */
    @RequestMapping(value = "/Register",method = RequestMethod.POST)
    public  CommonReturnType  register(@RequestBody RegisterUSerVO registerUSerVO) throws BusinessException {
        //任何角色注册都需要检查这五个个属性的合规性
        if(RegexUtils.checkBlankSpace(registerUSerVO.getLoginName())){
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"请输入用户名");
        }else{
            if(!userService.UserRepeat(registerUSerVO.getLoginName())){
                throw  new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"此用户已存在");
            }
        }
        if(!RegexUtils.checkEmail(registerUSerVO.getEmail()))
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"邮箱校验失败，请检查邮箱的合法性");

        if(!RegexUtils.isUsername(registerUSerVO.getLoginName()))
            throw  new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"至少包含数字跟字母，可以有字符长度需大于6位，小于20位");

        if(!RegexUtils.checkChinese(registerUSerVO.getVsername()))
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"姓名校验失败，请正确输入姓名");

        if(!RegexUtils.checkMobile(registerUSerVO.getMobile()))
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"手机号校验失败，请正确输入手机号");
       if(com.alibaba.druid.util.StringUtils.isEmpty(registerUSerVO.getPassword()))
           throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"密码不能为空");
        //校验企业信息
        if(registerUSerVO.getRegistType()== EmRegistType.Enterprise){
            if(!RegexUtils.checkDigit(registerUSerVO.getEpCode()))
                throw  new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"组织机构代码输入有误，请重新输入");
            if(com.alibaba.druid.util.StringUtils.isEmpty(registerUSerVO.getEpAddr()))
                throw  new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"公司地址校验失败，请检查");
            if(!RegexUtils.checkChinese(registerUSerVO.getEpContact()))
                throw  new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"联系人校验失败");
            if(!RegexUtils.checkMobile(registerUSerVO.getEpContacphone()))
                throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"联系电话校验失败");
            if(!RegexUtils.checkURL(registerUSerVO.getEpSite()))
                throw  new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"网站地址校验失败，请检查网站官网地址输入");
            if(!RegexUtils.checkEmail(registerUSerVO.getEpEmail()))
                throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"企业邮箱输入有误，请检查联系邮箱");
            if(!RegexUtils.checkDigit(registerUSerVO.getEpRegCap()))
                throw  new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"企业注册资金输入有误");
            if(com.alibaba.druid.util.StringUtils.isEmpty(registerUSerVO.getEpIndustry()))
                throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"所属行业填写有误，请检查");
            if(com.alibaba.druid.util.StringUtils.isEmpty(registerUSerVO.getEpNature()))
                throw  new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"公司性质有误，请检查");
        }


        //学生还要检查校内学号，供学校角色审核用
        //学生角色是1，学校角色是2，企业角色是3
        if(registerUSerVO.getRegistType()== EmRegistType.Student){
            if(!RegexUtils.checkIdCard(registerUSerVO.getTuIdnumber()))
                throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"身份证校验失败，请检查身份证的输入");
            if(!RegexUtils.checkDigit(registerUSerVO.getTuStudentid()))
                throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"学号校验失败，请检查学号");
        }
        //将注册信息拆分成两个部分，一部分是企业信息，一部分是用户信息
        UserDO userDO =convertFromModeRegisterVO(registerUSerVO);
        enterpriseDO enterpriseDO=convertFromModelEnterorseDO(registerUSerVO);
        userService.RegisterUser(userDO,enterpriseDO);
        return  CommonReturnType.create(registerUSerVO);
    }


    /**
     * 查询用户名是否已经存在
     * @param LogName
     * @return
     * @throws BusinessException
     */
    @RequestMapping("/Repeat")
    @ResponseBody
    public  CommonReturnType RepeatUser(@RequestParam(name = "LogName") String LogName) throws BusinessException {
            if(RegexUtils.checkBlankSpace(LogName))
                throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"请输入要查询的用户名");

        Map<String,String> responseData =new HashMap<>();
           if( !userService.UserRepeat(LogName)){
               responseData.put("ErrMsg","已存在此用户名");
               return  CommonReturnType.create(responseData);
           }
        responseData.put("Success","此用户名可用");
        return  CommonReturnType.create(responseData);
    }




    /**
     * 用于合并两个Bean来达到脱密的步骤。
     *
     * @param userModel
     * @return
     */
    private UserVO convertFromModelUserVO(UserModel userModel) {
        if (userModel == null) {
            return null;
        }
        UserVO userVO = new UserVO();
        MyBeanUtils.copyProperties(userModel, userVO);
        return userVO;

    }


    /**
     * 将注册VO转化成用户DO
     * @param registerUSerVO
     * @return
     */
    private UserDO convertFromModeRegisterVO(RegisterUSerVO registerUSerVO) throws BusinessException {
        if(registerUSerVO==null){
            throw  new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"用户信息转换失败，请检查用户信息填写正确性");
        }
        UserDO userDO=new UserDO();
        MyBeanUtils.copyProperties(registerUSerVO,userDO);
        //将用户密码MD5加密一次
        userDO.setPassword(MD5Utils.getPwd(userDO.getPassword()));

        return  userDO;
    }

    /**
     * 将注册VO转换成企业信息DO
     * @param registerUSerVO
     * @return
     */
    private enterpriseDO convertFromModelEnterorseDO(RegisterUSerVO registerUSerVO) throws BusinessException {
        if(registerUSerVO==null){
            throw  new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"企业信息转换失败，请检查企业信息填写正确性");
        }
        enterpriseDO enterpriseDO=new enterpriseDO();
        MyBeanUtils.copyProperties(registerUSerVO,enterpriseDO);
        return enterpriseDO;
    }

}
