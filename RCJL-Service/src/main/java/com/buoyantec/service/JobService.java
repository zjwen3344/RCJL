package com.buoyantec.service;

import com.buoyantec.Utils.UtilsVO.JobListVO;
import com.buoyantec.Utils.UtilsVO.JobReviewVO;
import com.buoyantec.Utils.UtilsVO.JobVO;
import com.buoyantec.dataobject.UserDO;
import com.buoyantec.dataobject.TJobDO;
import com.buoyantec.error.BusinessException;
import com.buoyantec.service.ReturnVO.JobReturnVO;

import java.util.List;

/**
 * @program: RCJL
 * @description: 招聘相关接口
 * @author: zjwen3344@gmail.com
 * @create: 2019-12-26 11:00
 **/
public interface JobService {

    /**
     * 添加一篇招聘
     * @param tjobDO
     */
    void Add(TJobDO tjobDO);

    /**
     * 删除一个招聘
     * @param ID
     */
    void Delete(TJobDO ID);

    /**
     * 修改一个招聘
     * @param tjobDO
     */
    void Set(TJobDO tjobDO);

    /**
     * 通过ID查找一个招聘
     * @param ID
     * @return
     */
    TJobDO FindByID(Long ID) throws BusinessException;

    /**
     * 通过企业名字搜索
     * @param Name
     * @return
     */
    List<TJobDO> FindByNameEnterpriseName(String Name);

    /**
     * 通过企业ID查询招聘
     * @param ID
     * @return
     */
    List<TJobDO> FindByEnterpriseID(Long ID);

    /**
     *通过职位类型查询招聘
     * @param TypeName
     * @return
     */
    JobReturnVO FindByJobType(String TypeName,int StartRow, int PageSize);

    /**
     * 审核一个岗位
     * @param job
     */
    void ReviewJOB(TJobDO job);

    /**
     * 批量审核岗位
     * @param JobIDList
     * @param userDO
     */
    void ReviewJobList(List<JobReviewVO> JobIDList, UserDO userDO);

    /**
     * 首页查询招聘岗位
     * @param StartRow
     * @param PageSize
     * @return
     */
    JobReturnVO FindTop(int StartRow, int PageSize);

    /**
     * 查看一个岗位的VO信息
     * @param ID
     * @return
     */
    JobVO FindVOByID(Long ID) throws BusinessException;

    /**
     * 安职位分类查询职位
     * @param JobClass
     * @param StartRow
     * @param PageSize
     * @return
     */
    JobReturnVO FindByJobClass(String JobClass,int StartRow, int PageSize);

}
