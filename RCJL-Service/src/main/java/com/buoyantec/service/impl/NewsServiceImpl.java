package com.buoyantec.service.impl;

import com.buoyantec.dao.newsDOMapper;
import com.buoyantec.dao.news_classDOMapper;
import com.buoyantec.dataobject.UserDO;
import com.buoyantec.dataobject.newsDO;
import com.buoyantec.dataobject.newsDOExample;
import com.buoyantec.dataobject.news_classDO;
import com.buoyantec.error.BusinessException;
import com.buoyantec.error.EmBusinessError;
import com.buoyantec.service.NewsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    }

    /**
     * 修改新闻
     * @param newsDO
     * @return
     */
    @Override
    public newsDO Set(newsDO newsDO, UserDO userDO) {
        return null;
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
     * @return
     */
    @Override
    public List<newsDO> FindByNewsTypeID(Long ID) {
        return null;
    }

    /**
     * 查找首页的新闻
     * @return 返回6个新闻
     */
    @Override
    public List<newsDO> FindByNewsTOP(int StartRow,int PageSize) {
        newsDOExample newsdo=new newsDOExample();
        newsdo.createCriteria().andTnDeleteEqualTo(false);
       // 不写就是降序
        newsdo.setOrderByClause("tn_Orde");
        newsdo.setStartRow(StartRow);
        newsdo.setPageSize(PageSize);
        return newsDAO.selectByExample(newsdo);
    }

    //返回所有新闻类型
    @Override
    public news_classDO GetNewsType() {
        return null;
    }
}
