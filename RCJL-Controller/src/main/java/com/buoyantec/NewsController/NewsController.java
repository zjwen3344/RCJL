package com.buoyantec.NewsController;

import com.alibaba.fastjson.JSONObject;
import com.buoyantec.BaseController;
import com.buoyantec.Utils.JWTUtil;
import com.buoyantec.Utils.MyBeanUtils;
import com.buoyantec.dataobject.UserDO;
import com.buoyantec.dataobject.newsDO;
import com.buoyantec.error.BusinessException;
import com.buoyantec.error.EmBusinessError;
import com.buoyantec.response.CommonReturnType;
import com.buoyantec.service.NewsService;
import com.buoyantec.service.UserService;
import com.buoyantec.viewobject.NewsVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: RCJL
 * @description: 新闻相关的接口控制器
 * @author: zjwen3344@gmail.com
 * @create: 2019-12-20 15:08
 **/
//将UserController.class  设置成控制器对象，并且控制器名称是User
@RestController("News")
//设置控制器的URL
@RequestMapping("/News")
public class NewsController extends BaseController {

    @Autowired
    private NewsService newsService;
    @Autowired
    private UserService userService;


    /**
     * 添加新闻接口
     * @param jsonObject
     * @return
     * @throws BusinessException
     */
    @RequiresPermissions({"AddNews"})
    @PostMapping("/AddNews")
    public CommonReturnType AddNews(@RequestBody JSONObject jsonObject) throws BusinessException {
       try{
           //先获取到是谁上传的
           String loginAccount= JWTUtil.GetUserName(SecurityUtils.getSubject().getPrincipal().toString());
           UserDO user=userService.FindByUserName(loginAccount);
           //传给服务端处理
           try {
               //创建新闻对象
               newsDO news =new newsDO();
               //解析传进来的内容
               //获取传进来的新闻类型ID
               news.setTncId(jsonObject.getLong("newsTypeID"));
               //新闻标题
               news.setTnTitle(jsonObject.getString("Title"));
               //新闻副标题
               news.setTnVicetitle(jsonObject.getString("ViceTitle"));
               //标题颜色
               news.setTnTitlecole(jsonObject.getString("TitileCole"));
               //标题是否加粗
               news.setTnTitleb(jsonObject.getInteger("titleB"));
               //新闻排序
               if (jsonObject.getInteger("Orde") == 0) {
                   news.setTnOrde(0);
               }else{
                   news.setTnOrde(jsonObject.getInteger("Orde"));
               }
               //简介
               news.setTnIntr(jsonObject.getString("intr"));
               //点击数
               news.setTnNumberOc(jsonObject.getInteger("numberOC"));
               //发布日期
               news.setTnReleasedatetime(jsonObject.getDate("releaseDatetime"));
               //作者
               news.setTnAuthor(jsonObject.getString("Author"));
               //新闻封面
               news.setTnCover(jsonObject.getString("Cover"));
               //新闻内容
               news.setTnContent(jsonObject.getString("Content"));
               newsService.Add(news,user);
               return     CommonReturnType.create("添加成功!");
           }catch (Exception ex){
               throw new BusinessException(EmBusinessError.NEWS_ERROR);
           }
       }catch (Exception ex){
           throw new BusinessException(EmBusinessError.PERMISSIONS_NOT_PER);
       }


    }



    @GetMapping("NewsInfo")
    @ResponseBody()
    public CommonReturnType GetNews(@RequestParam(name = "NewsID") Long NewsID) throws BusinessException {
        NewsVO newsVO =  new NewsVO();
        MyBeanUtils.copyProperties(newsService.FindByID(NewsID),newsVO);
        return  CommonReturnType.create(newsVO);
    }

    @GetMapping("GetNews")
    @ResponseBody()
    public CommonReturnType GetNewsTOP(@RequestParam(name = "StartRow") int  StartRow,@RequestParam(name = "PageSize")int PageSize){
        List<NewsVO> newsvo= new ArrayList<>();
        for (newsDO i :newsService.FindByNewsTOP(StartRow,PageSize)){
            NewsVO n=new NewsVO();
            MyBeanUtils.copyProperties(i,n);
            newsvo.add(n);
        }
        return  CommonReturnType.create(newsvo);
    }



















}
