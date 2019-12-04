package com.buoyantec.service.impl;

import com.buoyantec.dao.attachmentDOMapper;
import com.buoyantec.dataobject.UserDO;
import com.buoyantec.dataobject.attachmentDO;
import com.buoyantec.dataobject.attachmentDOExample;
import com.buoyantec.error.BusinessException;
import com.buoyantec.error.EmBusinessError;
import com.buoyantec.service.AttachmentService;
import com.buoyantec.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @program: RCJL
 * @description: 附件下载实现类,有空静下心来要重构一下这一块的代码，写的比较烂
 * @author: zjwen3344@gmail.com
 * @create: 2019-12-03 16:33
 **/
@Service
public class AttachmentServiceImpl implements AttachmentService {

    @Autowired
   private attachmentDOMapper attachmentDOMapper;

    @Autowired
    private UserService userService;

    private Logger logger= LoggerFactory.getLogger(this.getClass());


    SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd/");

    @Override
    public attachmentDO FindByUserID() {
        return null;
    }

    @Override
    public attachmentDO FindByFileName(String FaleID) {
        attachmentDOExample example=new attachmentDOExample();
        attachmentDOExample.Criteria criteria=example.createCriteria();
        criteria.andTaNewfalenameEqualTo(FaleID);
        List<attachmentDO> attachmentDOSLIST=attachmentDOMapper.selectByExample(example);
        if(attachmentDOSLIST.size()!=0||attachmentDOSLIST!=null)
            return  attachmentDOSLIST.get(0);
        return null;
    }

    @Override
    public void Save(attachmentDO file) {

        attachmentDOMapper.insertSelective(file);
    }

    @Override
    public void Delect(attachmentDO file) {

    }
    public Map<String,String> UploadImage(MultipartFile file, String UserName , String realPath, String HttpType, String uri, String Porint) throws BusinessException {

        UserDO userDO=userService.FindByUserName(UserName);
        if(userDO==null)throw new BusinessException(EmBusinessError.USER_NOT_EXIST);
        attachmentDO attachmentDO=new attachmentDO();

        //生成要上传的时间
        String format = sdf.format(new Date());
        //拼接保存目录
        realPath += format;

        System.out.printf(realPath + format);
        //生成上传文件目录
        File folder = new File(realPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        //取用户要上传的文件名
        String oldName = file.getOriginalFilename();
        //用UUID替换掉原来的文件名
        String ID=UUID.randomUUID().toString();
        String newName = ID + oldName.substring(oldName.lastIndexOf("."));
        //写出文件
        try{
            file.transferTo(new File(folder,newName));
        }catch (Exception e){
            logger.error(e.getMessage());
            throw  new BusinessException(EmBusinessError.SYSTEM_ERROR,"写出文件到目录时发生错误!");
        }
        String url = HttpType + "://" + uri + ":" + Porint + "/upload" + format + newName;
         attachmentDO.setTaDesc("");
        System.out.printf(HttpType+"://"+uri+":"+Porint+"/Upload");
        attachmentDO.setTaFilename(oldName);
        attachmentDO.setTaFileuri(HttpType+"://"+uri+":"+Porint+"/Upload/Download?id="+ID);
        attachmentDO.setTalLoacluri(realPath+newName);
        attachmentDO.setTaDesc("");
        attachmentDO.setTuId(userService.FindByUserName(UserName).getTuId());
        attachmentDO.setTaNewfalename(ID);
           attachmentDOMapper.insertSelective(attachmentDO);

        logger.info("用户:"+UserName+"|||上传文件:"+oldName+"|||上传地址是:"+realPath+newName+"|||数据库名为:"+newName+"|||下载地址为:"+url+"\n");

        Map<String ,String> result=new HashMap();
        result.put("message","上传成功!");
        result.put("下载地址",HttpType+"://"+uri+":"+Porint+"/Upload/Download?id="+ID);
        return result;
    }



}
