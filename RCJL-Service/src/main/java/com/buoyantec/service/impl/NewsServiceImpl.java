package com.buoyantec.service.impl;

import com.buoyantec.Utils.MyBeanUtils;
import com.buoyantec.dao.newsDOMapper;
import com.buoyantec.dao.news_classDOMapper;
import com.buoyantec.dataobject.*;
import com.buoyantec.error.BusinessException;
import com.buoyantec.error.EmBusinessError;
import com.buoyantec.service.NewsService;
import com.buoyantec.service.ReturnVO.NewsReturnVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @program: RCJL
 * @description: 新闻相关接口的实现类
 * @author: zjwen3344@gmail.com
 * @create: 2019-12-20 14:26
 **/
@Service
public class NewsServiceImpl  implements NewsService {

    Logger log= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private newsDOMapper newsDAO;

    @Autowired
    private news_classDOMapper newsClassDAO;


    /**
     * 添加新闻
     * @param news
     */
    @Override
    public void Add(newsDO news, UserDO userDO) {
        if(news.getTnOrde()==0){
            newsDOExample newsEx=new newsDOExample();
            newsEx.setOrderByClause("tn_ID  DESC ");
            newsEx.setStartRow(0);
            newsEx.setPageSize(1);
            List<newsDO> nDO=newsDAO.selectByExample(newsEx);
            news.setTnOrde((int) (nDO.get(0).getTnId()+1));
        }
        news.setTuId(userDO.getTuId());
        newsDAO.insertSelective(news);
    }

    /**
     * 删除新闻
     * @param news
     */
    @Override
    public void Delect(newsDO news, UserDO userDO) {
        newsDO n=newsDAO.selectByPrimaryKey(news.getTnId());
        n.setTnDelete(true);
        n.setTnDeleteuser(userDO.getTuId());
        newsDAO.updateByPrimaryKey(n);
    }

    /**
     * 修改新闻
     * @param newsDO
     * @return
     */
    @Override
    public newsDO Set(Long newsID,newsDO newsDO ) {
        newsDO n=newsDAO.selectByPrimaryKey(newsID);
        //合并两个Bean对象，如果source里面的值有空的那么target里面如果已有值，那target值不会被覆盖
//        MyBeanUtils.copyProperties(newsDO,n);
//        newsDAO.updateByPrimaryKey(n);
        newsDO.setTnId(newsID);
        newsDAO.updateByPrimaryKeySelective(newsDO);
        return  newsDAO.selectByPrimaryKey(newsID);
    }

    /**
     * 查找一篇新闻
     * @param ID 新闻ID
     * @return
     */
    @Override
    public newsDO FindByID(Long ID) throws BusinessException {
       newsDO news= newsDAO.selectByPrimaryKey(ID);
       log.isDebugEnabled();
       if(news!=null&&news.getTnDelete()!=true){

           return  news;
       }
        throw new BusinessException(EmBusinessError.NEWS_NULL);
    }


    /**
     * 查找一个新闻类型的所有新闻
     * @param ID 新闻类型的ID
     * @param StartRow  起始位置
     * @param PageSize  容量
     * @return
     */
    @Override
    public NewsReturnVO FindByNewsTypeID(Long ID, int StartRow, int PageSize) {
        NewsReturnVO result=new NewsReturnVO();
        newsDOExample newsdoE=new newsDOExample();
        newsDOExample.Criteria criteria=newsdoE.createCriteria();
        criteria.andTnDeleteEqualTo(false);
        criteria.andTncIdEqualTo(ID);
        newsdoE.setOrderByClause("tn_Orde");
        newsdoE.setStartRow(StartRow);
        newsdoE.setPageSize(PageSize);
        result.setCount(newsDAO.countByExample(newsdoE));
        result.setData(newsDAO.selectByExample(newsdoE));
        return result;
    }

    /**
     * 修改一个新闻分类
     * @param newsTypeID   要修改的新闻分类ID
     * @param newsClassDO  新的新闻分类
     */
    @Override
    public void SETNewsClass(Long newsTypeID, news_classDO newsClassDO ) {
        news_classDO nclassDO=newsClassDAO.selectByPrimaryKey(newsTypeID);
        newsClassDO.setTncId(newsTypeID);
        newsClassDAO.updateByPrimaryKeySelective(nclassDO);
    }

    /**
     * 删除新闻分类
     * @param NewsCLassID
     * @param UserID
     */
    @Override
    public void DeleteNewsClass(Long NewsCLassID, Long UserID) {
        news_classDO newsCDO=newsClassDAO.selectByPrimaryKey(NewsCLassID);
        newsCDO.setTbcDelete(true);
        newsCDO.setTncDeletetime(new Date());
        newsCDO.setTncDeleteuserid(UserID);
        newsClassDAO.updateByPrimaryKey(newsCDO);
    }

    /**
     * 添加新的新闻分类
     * @param newsClassDO
     */
    @Override
    public void AddNewsClass(news_classDO newsClassDO ) {
        newsClassDAO.insert(newsClassDO);
    }

    /**
     * 查找首页的新闻
     * @return 返回6个新闻
     */
    @Override
    public NewsReturnVO FindByNewsTOP(int StartRow,int PageSize) {
        newsDOExample newsdo=new newsDOExample();
        NewsReturnVO n=new NewsReturnVO();
        newsdo.createCriteria().andTnDeleteEqualTo(false);
       // 不写就是降序
        newsdo.setOrderByClause("tn_Orde");
        newsdo.setStartRow(StartRow);
        newsdo.setPageSize(PageSize);
        n.setCount(newsDAO.countByExample(newsdo));
        n.setData(newsDAO.selectByExample(newsdo));
        return n;
    }


    /**
     * 返回所有新闻类型
     * @return
     */
    @Override
    public List<news_classDO> GetNewsType() {
        news_classDOExample ncexam=new news_classDOExample();
        ncexam.createCriteria().andTbcDeleteEqualTo(false);

        return  newsClassDAO.selectByExample(ncexam);
    }




}
