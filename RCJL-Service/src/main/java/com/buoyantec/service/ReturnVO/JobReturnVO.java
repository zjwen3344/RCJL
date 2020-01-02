package com.buoyantec.service.ReturnVO;

import com.buoyantec.Utils.UtilsVO.JobListVO;
import com.buoyantec.dataobject.newsDO;

import java.util.List;

/**
 * @program: RCJL
 * @description: 招聘分页返回类
 * @author: zjwen3344@gmail.com
 * @create: 2019-12-30 16:54
 **/
public class JobReturnVO {
    public Long getCount() {
        return Count;
    }

    public void setCount(Long count) {
        Count = count;
    }

    public List<JobListVO> getData() {
        return Data;
    }

    public void setData(List<JobListVO> data) {
        Data = data;
    }

    private  Long Count;
    private List<JobListVO> Data;
}
