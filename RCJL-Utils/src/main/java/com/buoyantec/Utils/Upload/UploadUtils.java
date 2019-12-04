package com.buoyantec.Utils.Upload;

import com.buoyantec.error.BusinessException;
import com.buoyantec.error.EmBusinessError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @program: RCJL
 * @description: 上传文件工具类
 * @author: zjwen3344@gmail.com
 * @create: 2019-12-02 17:03
 **/
public class UploadUtils {


//    SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd/");
//    Logger logger= LoggerFactory.getLogger(this.getClass());
//
//
//    /**
//     * 上传图片文件
//     * @param file 要上传的文件
//     * @param UserName 上传文件的用户名
//     * @param realPath 上传文件的目录
//     * @param HttpType 请求类型
//     * @param uri 域名
//     * @param Porint 地址与端口
//     * @return
//     * @throws BusinessException
//     */
//    public  Map<String,String> Image(MultipartFile file,String UserName , String realPath,String HttpType,String uri,String Porint) throws BusinessException {
//
//       UserDO userDO=userService.FindByUserName(UserName);
//        if(userDO==null)throw new BusinessException(EmBusinessError.USER_NOT_EXIST);
//        attachmentDO attachmentDO=new attachmentDO();
//
//        //生成要上传的时间
//        String format = sdf.format(new Date());
//        //拼接保存目录
//        realPath += format;
//
//        System.out.printf(realPath + format);
//        //生成上传文件目录
//        File folder = new File(realPath);
//        if (!folder.exists()) {
//            folder.mkdirs();
//        }
//        //取用户要上传的文件名
//        String oldName = file.getOriginalFilename();
//        //用UUID替换掉原来的文件名
//        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."));
//        //写出文件
//        try{
//            file.transferTo(new File(folder,newName));
//        }catch (Exception e){
//            logger.error(e.getMessage());
//            throw  new BusinessException(EmBusinessError.SYSTEM_ERROR,"写出文件到目录时发生错误!");
//        }
//        String url = HttpType + "://" + uri + ":" + Porint + "/upload" + format + newName;
//        logger.info("用户:"+1+"|||上传文件:"+oldName+"|||上传地址是:"+realPath+newName+"|||数据库名为:"+newName+"|||下载地址为:"+url);
//        attachmentDO.setTaDesc("");
//        System.out.printf(HttpType+"://"+uri+":"+Porint+"/Upload");
//
////        attachmentDO.setTaFilename(oldName);
////        attachmentDO.setTaFileuri(HttpType+"://"+uri+":"+Porint+"/Upload");
////
//        Map<String ,String> result=new HashMap();
//        result.put("message","上传成功!");
//        return result;
//    }


}
