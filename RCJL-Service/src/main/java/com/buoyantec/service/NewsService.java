package com.buoyantec.service;

import com.buoyantec.dataobject.UserDO;
import com.buoyantec.dataobject.newsDO;
import com.buoyantec.dataobject.news_classDO;
import com.buoyantec.error.BusinessException;
import com.buoyantec.service.ReturnVO.NewsReturnVO;
import org.apache.tomcat.jni.User;

import java.util.HashMap;
import java.util.List;

/**
 * @program: RCJL
 * @description: 新闻相关的接口
 * @author: zjwen3344@gmail.com
 * @create: 2019-12-20 14:14
 **/
public interface NewsService {

    /**
     * 添加新闻
     * @param news
     */
    void Add(newsDO news, UserDO userDO);

    //删除新闻
    void Delect(newsDO news, UserDO userDO);

    //修改新闻
    newsDO Set(Long newsID,newsDO newsDO );

    /**
     * 获取首页的新闻
     * @return
     */
    NewsReturnVO FindByNewsTOP(int StartRow,int PageSize);

    /**
     * 获取某一条新闻
     * @param ID 新闻ID
     * @return
     */
    newsDO FindByID(Long ID) throws BusinessException;

    /**
     * 获取某一个新闻分类的所有新闻
     * @param ID
     * @return
     */
    NewsReturnVO FindByNewsTypeID(Long ID, int StartRow, int PageSize);

    /**
     * 修改一个新闻分类
     * @param newsTypeID
     * @param newsClassDO
     */
    void SETNewsClass(Long newsTypeID,news_classDO newsClassDO );

    /**
     * 删除一个新闻分类
     * @param NewsCLassID
     * @param UserID
     */
    void DeleteNewsClass(Long NewsCLassID,Long UserID);

    /**
     * 添加新的新闻类型
     * @param newsClassDO
     */
    void AddNewsClass(news_classDO  newsClassDO );

    /**
     * 获取所有新闻分类
     * @return
     */
    List<news_classDO> GetNewsType();




}
