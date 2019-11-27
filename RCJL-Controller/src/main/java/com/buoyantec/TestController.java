package com.buoyantec;

import com.buoyantec.Utils.RegexUtils;
import com.buoyantec.error.BusinessException;
import com.buoyantec.error.EmBusinessError;
import com.buoyantec.response.CommonReturnType;
import com.buoyantec.service.UserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: RCJL
 * @description: 测试用户控制器
 * @author: zjwen3344@gmail.com
 * @create: 2019-11-25 17:39
 **/



//将UserController.class  设置成控制器对象，并且控制器名称是User
@RestController("Test")
//设置控制器的URL
@RequestMapping("/Test")
public class TestController {

protected  final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private UserService userService;

    /**
     * 查询用户名是否已经存在
     * @param LogName
     * @return
     * @throws BusinessException
     */
    @RequestMapping("/Repeat")
    @ResponseBody
    @RequiresPermissions({"SelectTest"})
    public CommonReturnType RepeatUser(@RequestParam(name = "LogName") String LogName) throws BusinessException {
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

    @RequiresPermissions({"SelectTest"}) //没有的话 AuthorizationException
    @PostMapping("/delete")
    public Map<String, Object> managerRole(String token) {
        System.out.println("delete");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("success", true);
        map.put("msg", "当前用户有delete的权力");

        logger.trace("Trace");
        logger.debug("Debug");
        logger.info("Info");
        logger.warn("Warn");
        logger.error("Error");


        return map;
    }
}
