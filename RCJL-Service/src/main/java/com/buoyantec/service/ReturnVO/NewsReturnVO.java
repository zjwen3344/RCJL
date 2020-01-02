package com.buoyantec.service.ReturnVO;

import com.buoyantec.dataobject.newsDO;

import java.util.List;

/**
 * @program: RCJL
 * @description: 分页查询新闻返回类
 * @author: zjwen3344@gmail.com
 * @create: 2019-12-30 14:14
 **/
public class NewsReturnVO {


    public Long getCount() {
        return Count;
    }

    public void setCount(Long count) {
        Count = count;
    }

    public List<newsDO> getData() {
        return Data;
    }

    public void setData(List<newsDO> data) {
        Data = data;
    }
    private  Long Count;
    private List<newsDO> Data;
}
