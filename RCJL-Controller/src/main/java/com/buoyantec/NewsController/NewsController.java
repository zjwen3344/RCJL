package com.buoyantec.NewsController;

import com.alibaba.fastjson.JSONObject;
import com.buoyantec.BaseController;
import com.buoyantec.Utils.JWTUtil;
import com.buoyantec.Utils.MyBeanUtils;
import com.buoyantec.Utils.StringUtil;
import com.buoyantec.dataobject.UserDO;
import com.buoyantec.dataobject.newsDO;
import com.buoyantec.dataobject.news_classDO;
import com.buoyantec.error.BusinessException;
import com.buoyantec.error.EmBusinessError;
import com.buoyantec.response.CommonReturnType;
import com.buoyantec.service.NewsService;
import com.buoyantec.service.ReturnVO.NewsReturnVO;
import com.buoyantec.service.UserService;
import com.buoyantec.viewobject.NewsTypeVO;
import com.buoyantec.viewobject.NewsVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
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
    @RequiresPermissions({"AdminAddNews"})
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

    /**
     * 获取新闻详情
     * @param NewsID
     * @return
     * @throws BusinessException
     */
    @GetMapping("NewsInfo")
    @ResponseBody()
    public CommonReturnType GetNews(@RequestParam(name = "NewsID") Long NewsID) throws BusinessException {
        NewsVO newsVO =  new NewsVO();
        MyBeanUtils.copyProperties(newsService.FindByID(NewsID),newsVO);
        return  CommonReturnType.create(newsVO);
    }


    /**
     * 管理员删除新闻
     * @param ID  要删除的新闻ID
     * @return
     * @throws BusinessException
     */
    @GetMapping("DelectNews")
    @RequiresPermissions({"AdminDeleteNews"})
    @RequiresRoles("Admin")
    public  CommonReturnType DeleteNews(@RequestParam(name = "NewsID") Long ID) throws BusinessException {
        String loginAccount= JWTUtil.GetUserName(SecurityUtils.getSubject().getPrincipal().toString());
        UserDO user=userService.FindByUserName(loginAccount);
        newsDO news=newsService.FindByID(ID);
        newsService.Delect(news,user);
        return  CommonReturnType.create("删除成功!");
    }


    /**
     * 分页获取所有新闻
     * @param StartRow
     * @param PageSize
     * @return
     */
    @GetMapping("GetNews")
    @ResponseBody()
    public CommonReturnType GetNewsTOP(@RequestParam(name = "StartRow") int  StartRow,@RequestParam(name = "PageSize")int PageSize){
        List<NewsVO> newsvo= new ArrayList<>();
        NewsReturnVO result=newsService.FindByNewsTOP(StartRow,PageSize);
        for (newsDO i :result.getData()){
            NewsVO n=new NewsVO();
            MyBeanUtils.copyProperties(i,n);
            newsvo.add(n);
        }
        HashMap<String,Object> resu=new HashMap<>();
        resu.put("Data",newsvo);
        resu.put("Count",result.getCount());
        return  CommonReturnType.create(resu);
    }

    /**
     * 分页获取不同新闻类型ID
     * @param StartRow
     * @param PageSize
     * @return
     */
    @GetMapping("GetNewsType")
    @ResponseBody()
    public CommonReturnType GetNewsTOP(@RequestParam(name = "StartRow") int  StartRow,@RequestParam(name = "PageSize")int PageSize,@RequestParam(name = "NewsTypeID") Long  NewsTypeID){
        List<NewsVO> newsvo= new ArrayList<>();
        NewsReturnVO result=newsService.FindByNewsTypeID(NewsTypeID,StartRow,PageSize);
        List<newsDO> list=result.getData();
        for (newsDO i :list){
            NewsVO n=new NewsVO();
            MyBeanUtils.copyProperties(i,n);
            newsvo.add(n);
        }
        HashMap<String,Object> hase=new HashMap<>();
        hase.put("Data",newsvo);
        hase.put("Count",result.getCount());
        return  CommonReturnType.create(hase);
    }


    /**
     * 获取所有新闻分类
     * @return
     */
    @GetMapping("GetNewsClass")
    @ResponseBody()
    public  CommonReturnType GetNewsClass(){
        List<NewsTypeVO> newsTypeVOS=new ArrayList<>();
        for (news_classDO i:newsService.GetNewsType()){
            NewsTypeVO n=new NewsTypeVO();
            MyBeanUtils.copyProperties(i,n);
            newsTypeVOS.add(n);
        }
        return CommonReturnType.create(newsTypeVOS);
    }

    /**
     * 管理员删除新闻分类
     * @param ID 新闻分类ID
     * @return
     */
    @GetMapping("DelectNewsType")
    @RequiresRoles("Admin")
    @RequiresPermissions({"AdminDeleteNewsType"})
    public  CommonReturnType DelectNewsType(@RequestParam(name = "NewsTypeID") Long ID){
        String loginAccount= JWTUtil.GetUserName(SecurityUtils.getSubject().getPrincipal().toString());
        UserDO user=userService.FindByUserName(loginAccount);
        newsService.DeleteNewsClass(ID,user.getTuId());
        return  CommonReturnType.create("删除成功!");
    }

    /**
     * 管理员修改新闻
     * @param jsonObject
     * @return
     * @throws BusinessException
     */
    @PostMapping("/SetNews")
    @RequiresRoles("Admin")
    @RequiresPermissions({"AdminSetNews"})
    public CommonReturnType SetNews(@RequestBody JSONObject jsonObject) throws BusinessException {
        String loginAccount= JWTUtil.GetUserName(SecurityUtils.getSubject().getPrincipal().toString());
        UserDO user=userService.FindByUserName(loginAccount);
        //创建新闻对象
        newsDO news =new newsDO();
        if(jsonObject.getLong("newsID")==null){
            throw  new BusinessException(EmBusinessError.News_ID_NULL);
        }
        news.setTnId(jsonObject.getLong("newsID"));
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
        news.setTnOrde(jsonObject.getInteger("Orde"));
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
        news.setTnMideftime(new Date());
        news.setTnMidefuser(user.getTuId());
        newsDO n=newsService.Set(news.getTnId(),news);
        NewsVO nVO=new NewsVO();

        MyBeanUtils.copyProperties(n,nVO);

        return  CommonReturnType.create( nVO ,"修改成功",200);
    }











}
