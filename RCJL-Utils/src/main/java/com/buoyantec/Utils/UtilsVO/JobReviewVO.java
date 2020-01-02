package com.buoyantec.Utils.UtilsVO;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @program: RCJL
 * @description: 岗位审批传参VO
 * @author: zjwen3344@gmail.com
 * @create: 2019-12-27 14:43
 **/
public class JobReviewVO {

    /**
     * 职位ID
     */
    private  Long  JobID;
    /**
     * 是否通过
     */
    private  Boolean  Review;
    /**
     * 备注
     */
    private  String  DenialReason;

    public Long getJobID() {
        return JobID;
    }

    public void setJobID(Long jobID) {
        JobID = jobID;
    }

    public Boolean getReview() {
        return Review;
    }

    public void setReview(Boolean review) {
        Review = review;
    }

    public String getDenialReason() {
        return DenialReason;
    }

    public void setDenialReason(String denialReason) {
        DenialReason = denialReason;
    }
}
