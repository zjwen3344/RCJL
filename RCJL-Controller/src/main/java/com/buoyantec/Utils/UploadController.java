package com.buoyantec.Utils;

import com.buoyantec.BaseController;
import com.buoyantec.Utils.Upload.UploadUtils;
import com.buoyantec.dataobject.UserDO;
import com.buoyantec.dataobject.attachmentDO;
import com.buoyantec.error.BusinessException;
import com.buoyantec.error.EmBusinessError;
import com.buoyantec.response.CommonReturnType;
import com.buoyantec.service.AttachmentService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

/**
 * @program: RCJL
 * @description: 上传各类文件用
 * @author: zjwen3344@gmail.com
 * @create: 2019-12-02 15:13
 **/
@RestController("Upload")
@RequestMapping("Upload")
public class UploadController extends BaseController {

    Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AttachmentService attachmentService;

    @PostMapping("/UploadFile")
    @RequiresPermissions({"UploadFile"})
    public CommonReturnType importData(MultipartFile file, HttpServletRequest req) throws BusinessException  {
        String loginAccount=JWTUtil.GetUserName(SecurityUtils.getSubject().getPrincipal().toString());
        try{
            loginAccount = JWTUtil.GetUserName(SecurityUtils.getSubject().getPrincipal().toString());
        }catch (Exception e){
            throw  new BusinessException(EmBusinessError.TOKEN_IS_NULL);
        }
        logger.info("用户:"+loginAccount+"正在上传文件");
        if(file.isEmpty()){
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"请选择要上传的文件");
        }
        return  CommonReturnType.create(attachmentService.UploadImage(file,loginAccount,req.getServletContext().getRealPath("/upload"),req.getScheme(),req.getServerName(), req.getServerPort()+""));
    }

    @RequestMapping("Download")
    public  CommonReturnType Download(HttpServletResponse response,@RequestParam(name = "id") String id) throws UnsupportedEncodingException {
      attachmentDO att= attachmentService.FindByFileName(id);
            String filename=att.getTaFilename();
            String filePath=att.getTalLoacluri();
            File file =new File(filePath);

            //开始读取文件并且输出
            if(file.exists()){
                response.setContentType("application/force-download;charset=UTF-8");
                response.setCharacterEncoding("UTF-8");
               // response.setHeader("Content-Disposition)","attachment;fileName=" +   java.net.URLEncoder.encode(filename,"UTF-8"));
                response.addHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode(filename, "utf-8"));// 设置文件名
                byte[] buffer=new byte[1024];
                FileInputStream fis=null; //文件输入流
                BufferedInputStream bis=null;
                OutputStream os=null;//输出流

                try{
                    os = response.getOutputStream();
                    fis = new FileInputStream(file);
                    bis = new BufferedInputStream(fis);

                    int i=bis.read(buffer);
                    while(i!=-1){
                        os.write(buffer);
                        i=bis.read(buffer);
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }

                System.out.printf("-----------------File DOwnload------------------");
                try{
                    bis.close();
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        return  null;
    }

}
