package com.buoyantec.Utils.UtilsVO;

import java.util.Date;

/**
 * @program: RCJL
 * @description: 招聘列表的返回磊
 * @author: zjwen3344@gmail.com
 * @create: 2019-12-27 16:33
 **/
public class JobListVO {

    public String getEPname() {
        return EPname;
    }

    public void setEPname(String EPname) {
        this.EPname = EPname;
    }

    public Date getTJDeadline() {
        return TJDeadline;
    }

    public void setTJDeadline(Date TJDeadline) {
        this.TJDeadline = TJDeadline;
    }

    public String getJobName() {
        return JobName;
    }

    public void setJobName(String jobName) {
        JobName = jobName;
    }

    public String getTJEducation() {
        return TJEducation;
    }

    public void setTJEducation(String TJEducation) {
        this.TJEducation = TJEducation;
    }

    public Long getTJPeople() {
        return TJPeople;
    }

    public void setTJPeople(Long TJPeople) {
        this.TJPeople = TJPeople;
    }

    // 企业名称
    private  String EPname;
    //  发布日期
    private Date TJDeadline;
    //  职位名称
    private String JobName;
    //  学历要求
    private  String TJEducation;
    //  招聘人数
    private  Long TJPeople;
}
