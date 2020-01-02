package com.buoyantec.JobController;

import com.alibaba.fastjson.JSONObject;
import com.buoyantec.BaseController;
import com.buoyantec.Utils.JWTUtil;
import com.buoyantec.dataobject.TJobDO;
import com.buoyantec.dataobject.UserDO;
import com.buoyantec.dataobject.enterpriseDO;
import com.buoyantec.error.BusinessException;
import com.buoyantec.error.EmBusinessError;
import com.buoyantec.response.CommonReturnType;
import com.buoyantec.service.JobService;
import com.buoyantec.service.ReturnVO.JobReturnVO;
import com.buoyantec.service.UserEPService;
import com.buoyantec.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;

/**
 * @program: RCJL
 * @description: 招聘相关请求接口
 * @author: zjwen3344@gmail.com
 * @create: 2019-12-29 13:44
 **/
@RestController("Job")
//设置控制器的URL
@RequestMapping("/Job")
public class JobController extends BaseController {

    @Autowired
    private JobService JobSerVer;
    @Autowired
    private UserService userService;
    @Autowired
    private UserEPService UserEPSerVer;

    /**
     * 免审核添加招聘接口
     * @return
     */
    @PostMapping("/ExemptAddJob")
    @RequiresRoles("EP")
    @RequiresPermissions({"EPExemptJob"})
    public CommonReturnType ExemptAddJob(){
        return  null;
    }


    /**
     * 企业添加招聘接口
     * @param jsonObject
     * @return
     * @throws BusinessException
     */
    @PostMapping("/AddJob")
    @RequiresRoles("EP")
    public CommonReturnType AddJob(@RequestBody JSONObject jsonObject) throws BusinessException {
        String loginAccount= JWTUtil.GetUserName(SecurityUtils.getSubject().getPrincipal().toString());
        UserDO user=userService.FindByUserName(loginAccount);
        enterpriseDO epDO=UserEPSerVer.FindByUserID(user.getTuId());
        if(epDO==null){
            throw  new BusinessException(EmBusinessError.ENTERPRISE_NULL);
        }
        TJobDO job=new TJobDO();
        //企业ID
        job.setTeId(epDO.getTeId());
        job.setTjName(jsonObject.getString("JobName"));
        job.setTjType(jsonObject.getString("JobType"));
        job.setTjClassification(jsonObject.getString("JobClass"));
        job.setTjPeople(jsonObject.getLong("JobPeople"));
        job.setTjSex(jsonObject.getString("JobSex"));
        job.setTjProfe(jsonObject.getString("JobProfe"));
        job.setTjEducation(jsonObject.getString("JobEDUCation"));
        job.setTjArea(jsonObject.getString("JobArea"));
        job.setTjPay(jsonObject.getString("JobPay"));
        job.setTjFl(jsonObject.getString("JobFL"));
        job.setTjComputer(jsonObject.getString("JobComputer"));
        job.setTjOther(jsonObject.getString("JobOther"));
        job.setTjDescription(jsonObject.getString("JobDescription"));
        job.setTjDeadline(jsonObject.getDate("JobDeadline"));
        job.setTjReleasedate(jsonObject.getDate("JobReleaseedate"));
        job.setTjContactperson(jsonObject.getString("JobContactEmail"));
        job.setTjContactdetails(jsonObject.getString("JobContactPhone"));
        job.setTjCreateruserid(user.getTuId());
        job.setTjReleaseuserid(user.getTuId());
        job.setTjCreatertime(new Date());
        job.setTjPopularity(Long.valueOf(0));

        JobSerVer.Add(job);

        return  CommonReturnType.create("提交职位成功!请等待管理员审核!");
    }

    @GetMapping("/SelectJob")
    public CommonReturnType SelectJob(@RequestParam(name = "JobID") Long JobID) throws BusinessException {
       return CommonReturnType.create( JobSerVer.FindVOByID(JobID));
    }

    /**
     * 分页查询所有招聘接口
     * @param StartRow
     * @param PageSize
     * @return
     */
    @GetMapping("/SelectAll")
    public  CommonReturnType SelectJob(@RequestParam(name = "StartRow") int  StartRow,@RequestParam(name = "PageSize")int PageSize){
        HashMap<String,Object> result=new HashMap<>();
        JobReturnVO j=JobSerVer.FindTop(StartRow,PageSize);
        result.put("Data",j.getData());
        result.put("Count",j.getCount());
        return CommonReturnType.create(  result);
    }

    /**
     * 分页按职位类型查询职位
     * @param StartRow
     * @param PageSize
     * @param Type
     * @return
     */
    @GetMapping("/SelectJobType")
    public  CommonReturnType SelectJobType(@RequestParam(name = "StartRow") int  StartRow,@RequestParam(name = "PageSize")int PageSize,@RequestParam(name = "Type")String Type){
        HashMap<String,Object> result=new HashMap<>();
        JobReturnVO j=JobSerVer.FindByJobType(Type,StartRow,PageSize);
        result.put("Data",j.getData());
        result.put("Count",j.getCount());
        return CommonReturnType.create(  result);
    }

    /**
     * 分页按职位类型查询职位
     * @param StartRow
     * @param PageSize
     * @param Type
     * @return
     */
    @GetMapping("/SelectJobClass")
    public  CommonReturnType SelectJobClass(@RequestParam(name = "StartRow") int  StartRow,@RequestParam(name = "PageSize")int PageSize,@RequestParam(name = "Type")String Type){
        HashMap<String,Object> result=new HashMap<>();
        JobReturnVO j=JobSerVer.FindByJobClass(Type,StartRow,PageSize);
        result.put("Data",j.getData());
        result.put("Count",j.getCount());
        return CommonReturnType.create(  result);
    }




}
