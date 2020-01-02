package com.buoyantec.service.impl;

import com.buoyantec.Utils.UtilsVO.JobListVO;
import com.buoyantec.Utils.UtilsVO.JobReviewVO;
import com.buoyantec.Utils.UtilsVO.JobVO;
import com.buoyantec.dao.TJobDOMapper;
import com.buoyantec.dao.TJobReviewerDOMapper;
import com.buoyantec.dao.enterpriseDOMapper;
import com.buoyantec.dataobject.*;
import com.buoyantec.error.BusinessException;
import com.buoyantec.error.EmBusinessError;
import com.buoyantec.service.JobService;
import com.buoyantec.service.ReturnVO.JobReturnVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: RCJL
 * @description: 招聘实现类
 * @author: zjwen3344@gmail.com
 * @create: 2019-12-26 15:06
 **/
@Service
public class JobServiceImpl  implements JobService {

    @Autowired
   private TJobDOMapper JobDAO;
    @Autowired
    private TJobReviewerDOMapper ReviJobDAO;
    @Autowired
    private enterpriseDOMapper EPDAO;

    private
    Logger log= LoggerFactory.getLogger(this.getClass());


    /**
     * 添加新的未审核的职位
     * @param tjobDO
     */
    @Override
    public void Add(TJobDO tjobDO) {
        JobDAO.insertSelective(tjobDO);
        TJobReviewerDO tjrDO=new TJobReviewerDO();
        tjrDO.setTjId(tjobDO.getTjId());
        ReviJobDAO.insertSelective(tjrDO);
        log.info("添加新的职位:"+tjobDO.getTjName());
    }


    /**
     * 删除一个职位
     * @param Job
     */
    @Override
    public void Delete(TJobDO Job) {
        JobDAO.updateByPrimaryKeySelective(Job);
    }

    /**
     * 修改一个职位的信息
     * @param tjobDO
     */
    @Override
    public void Set(TJobDO tjobDO) {
        JobDAO.updateByPrimaryKeySelective(tjobDO);
    }

    /**
     * 通过职位ID查找一个职位
     * @param ID
     * @return
     */
    @Override
    public TJobDO FindByID(Long ID) throws BusinessException {
        try {
            TJobDO job=JobDAO.selectByPrimaryKey(ID);
            return job;
        }catch (Exception ex){
            throw new BusinessException(EmBusinessError.JOB_ERROR);
        }

    }

    /**
     * 通过职位名称,与职位介绍,模糊查找职位
     * @param Name
     * @return
     */
    @Override
    public List<TJobDO> FindByNameEnterpriseName(String Name) {
        List<TJobDO> JOBList=new ArrayList<>();
        TJobDOExample example =new TJobDOExample();
        TJobDOExample.Criteria criteria= example.createCriteria();
        Name= "%" + Name+ "%";
        criteria.andTjNameLike(Name);
        criteria.andTjDescriptionLike(Name);
        return JobDAO.selectByExample(example);
    }

    /**
     * 通过公司ID查询职位
     * @param ID
     * @return
     */
    @Override
    public List<TJobDO> FindByEnterpriseID(Long ID) {
        TJobDOExample tJobDOExample=new TJobDOExample();
        tJobDOExample.createCriteria().andTeIdEqualTo(ID);
        return JobDAO.selectByExample(tJobDOExample);
    }

    /**
     * 通过职位类型查找职位
     * @param TypeName
     * @return
     */
    @Override
    public JobReturnVO FindByJobType(String TypeName,int StartRow, int PageSize) {
        JobReturnVO jrv=new JobReturnVO();
        List<JobListVO> list=new ArrayList<>();
        TJobDOExample jobexam=new TJobDOExample();
        TJobDOExample.Criteria criteria=jobexam.createCriteria();
        criteria.andTjIsdeleteEqualTo(false);
        criteria.andTjIsreviewerEqualTo(true);
        criteria.andTjTypeEqualTo(TypeName);
        jobexam.setOrderByClause(" tj_CreaterTime desc");
        jobexam.setPageSize(PageSize);
        jobexam.setStartRow(StartRow);

        for (TJobDO i:JobDAO.selectByExample(jobexam)){
            JobListVO j=new JobListVO();
            TJobDO tJobDO=i;
            j.setEPname(EPDAO.selectByPrimaryKey(tJobDO.getTeId()).getEpName());
            j.setTJDeadline(tJobDO.getTjReleasedate());
            j.setJobName(tJobDO.getTjName());
            j.setTJEducation(tJobDO.getTjEducation());
            j.setTJPeople(tJobDO.getTjPeople());
            list.add(j);
        }
        jrv.setData(list);
        jrv.setCount(JobDAO.countByExample(jobexam));
        return jrv;
    }

    /**
     * 审核一个职位
     * @param job
     */
    @Override
    public void ReviewJOB(TJobDO job) {
        JobDAO.updateByPrimaryKeySelective(job);
    }

    /**
     *批量通过审核
     * @param JobIDList
     * @param userDO
     */
    @Override
    public void ReviewJobList(List<JobReviewVO> JobIDList, UserDO userDO) {
        for (JobReviewVO i: JobIDList){
           TJobReviewerDO  j= ReviJobDAO.selectByPrimaryKey(i.getJobID());
           j.setTjrIsreviewer(true);
           j.setTjrResult(i.getReview());
           j.setTjrDenialreason(i.getDenialReason());
           j.setTjrRevieweruserid(userDO.getTuId());
           j.setTjrReviewertime(new Date());
           ReviJobDAO.insertSelective(j);
        }
    }

    /**
     * 分页查找所有职位
     * @param StartRow
     * @param PageSize
     * @return
     */
    @Override
    public JobReturnVO FindTop(int StartRow, int PageSize) {
//        List<TJobReviewerDO> tjob=new ArrayList<>();
//        List<JobListVO> list=new ArrayList<>();
//        TJobReviewerDOExample TjobRe=new TJobReviewerDOExample();
//        TjobRe.createCriteria().andTjrResultEqualTo(true);
//        TjobRe.setOrderByClause("tjr_ReviewerTime desc");
//        TjobRe.setPageSize(PageSize);
//        TjobRe.setStartRow(StartRow);
//        tjob=ReviJobDAO.selectByExample(TjobRe);
//
//        for (TJobReviewerDO i:tjob){
//            JobListVO j=new JobListVO();
//            TJobDO tJobDO=JobDAO.selectByPrimaryKey(i.getTjId());
//            j.setEPname(EPDAO.selectByPrimaryKey(tJobDO.getTeId()).getEpName());
//            j.setTJDeadline(tJobDO.getTjReleasedate());
//            j.setJobName(tJobDO.getTjName());
//            j.setTJEducation(tJobDO.getTjEducation());
//            j.setTJPeople(tJobDO.getTjPeople());
//            list.add(j);
//        }
//        JobReturnVO jrv=new JobReturnVO();
//        jrv.setData(list);
//        jrv.setCount(ReviJobDAO.countByExample(TjobRe));
        JobReturnVO jrv=new JobReturnVO();
         List<JobListVO> list=new ArrayList<>();
        TJobDOExample jobexam=new TJobDOExample();
        TJobDOExample.Criteria criteria=jobexam.createCriteria();
        criteria.andTjIsdeleteEqualTo(false);
        criteria.andTjIsreviewerEqualTo(true);
        jobexam.setOrderByClause(" tj_CreaterTime desc");
        jobexam.setPageSize(PageSize);
        jobexam.setStartRow(StartRow);

        for (TJobDO i:JobDAO.selectByExample(jobexam)){
            JobListVO j=new JobListVO();
            TJobDO tJobDO=i;
            j.setEPname(EPDAO.selectByPrimaryKey(tJobDO.getTeId()).getEpName());
            j.setTJDeadline(tJobDO.getTjReleasedate());
            j.setJobName(tJobDO.getTjName());
            j.setTJEducation(tJobDO.getTjEducation());
            j.setTJPeople(tJobDO.getTjPeople());
            list.add(j);
        }
        jrv.setData(list);
        jrv.setCount(JobDAO.countByExample(jobexam));
        return jrv;
    }

    /**
     * 查询具体一个职位
     * @param ID
     * @return
     */
    @Override
    public JobVO FindVOByID(Long ID) throws BusinessException {
        JobVO jobvo=new JobVO();
        TJobReviewerDOExample tjobEx=new TJobReviewerDOExample();
        tjobEx.createCriteria().andTjIdEqualTo(ID);
        List<TJobReviewerDO> trDjo=ReviJobDAO.selectByExample(tjobEx);
        if(trDjo==null||trDjo.size()==0){
            log.error("有用户提交了一个职位ID,但是这个职位ID并没有对应的职位审批,此职位ID是:"+ID);
            throw  new BusinessException(EmBusinessError.JOB_ERROR);
        }
        try{
            if(trDjo.get(0).getTjrResult()==false){
                log.error("有用户查询了一个还没有过审的职位ID:"+trDjo.get(0).getTjId());
                throw  new BusinessException(EmBusinessError.JOB_ERROR);
            }
        }catch (Exception ex){
            log.error("有用户查询了一个还没有过审的职位ID:"+trDjo.get(0).getTjId());
            throw  new BusinessException(EmBusinessError.JOB_ERROR);
        }

        TJobDO job=JobDAO.selectByPrimaryKey(ID);
        if(job==null){
            log.error("有用户提交了一个不存在的职位ID,此职位审批ID是:"+trDjo.get(0).getTjId());
            throw  new BusinessException(EmBusinessError.JOB_ERROR);
        }
       enterpriseDO ep=EPDAO.selectByPrimaryKey(job.getTeId());
        if(ep==null){
            log.error("有用模糊在查询一个不存在的企业ID,此企业ID是::"+trDjo.get(0).getTjId());
            throw  new BusinessException(EmBusinessError.JOB_ERROR);
        }
        jobvo.setEPname(ep.getEpName());
        jobvo.setAddr(ep.getEpAddr());
        jobvo.setSIte(ep.getEpSite());
        jobvo.setEmail(ep.getEpEmail());
        jobvo.setREG_CAP(ep.getEpRegCap());
        jobvo.setEpindustry(ep.getEpIndustry());
        jobvo.setEpNature(ep.getEpNature());
        jobvo.setIntroduction(ep.getEpIntroduction());
        jobvo.setJobName(job.getTjName());
        jobvo.setTJRype(job.getTjType());
        jobvo.setTJclass(job.getTjClassification());
        jobvo.setTJPeople(job.getTjPeople());
        jobvo.setTJSex(job.getTjSex());
        jobvo.setTJprofe(job.getTjProfe());
        jobvo.setTJEducation(job.getTjEducation());
        jobvo.setTJarea(job.getTjArea());
        jobvo.setTJPay(job.getTjPay());
        jobvo.setTJFL(job.getTjFl());
        jobvo.setTJComputer(job.getTjComputer());
        jobvo.setTJOther(job.getTjOther());
        jobvo.setTJDescription(job.getTjDescription());
        jobvo.setTJDeadline(job.getTjDeadline());
        jobvo.setTJReleasedate(job.getTjReleasedate());
        jobvo.setTJPopularity(job.getTjPopularity());
        jobvo.setTJEMail(job.getTjContactperson());
        jobvo.setTJPhone(job.getTjContactdetails());

        return jobvo;
    }

    /**
     * 通过职位类别来查询职位
     * @param JobClass
     * @param StartRow
     * @param PageSize
     * @return
     */
    @Override
    public JobReturnVO FindByJobClass(String JobClass, int StartRow, int PageSize) {
        JobReturnVO jrv=new JobReturnVO();
        List<JobListVO> list=new ArrayList<>();
        TJobDOExample jobexam=new TJobDOExample();
        TJobDOExample.Criteria criteria=jobexam.createCriteria();
        criteria.andTjIsdeleteEqualTo(false);
        criteria.andTjIsreviewerEqualTo(true);
        criteria.andTjClassificationEqualTo(JobClass);
        jobexam.setOrderByClause(" tj_CreaterTime desc");
        jobexam.setPageSize(PageSize);
        jobexam.setStartRow(StartRow);


        for (TJobDO i:JobDAO.selectByExample(jobexam)){
            JobListVO j=new JobListVO();
            TJobDO tJobDO=i;
            j.setEPname(EPDAO.selectByPrimaryKey(tJobDO.getTeId()).getEpName());
            j.setTJDeadline(tJobDO.getTjReleasedate());
            j.setJobName(tJobDO.getTjName());
            j.setTJEducation(tJobDO.getTjEducation());
            j.setTJPeople(tJobDO.getTjPeople());
            list.add(j);
        }
        jrv.setData(list);
        jrv.setCount(JobDAO.countByExample(jobexam));
        return jrv;
    }


}
