package com.buoyantec.service;

import com.buoyantec.dataobject.attachmentDO;
import com.buoyantec.error.BusinessException;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface AttachmentService {
    attachmentDO FindByUserID();
    attachmentDO FindByFileName(String FaleID);
    void Save(attachmentDO file);
    void Delect(attachmentDO file);
    Map<String,String> UploadImage(MultipartFile file, String UserName , String realPath, String HttpType, String uri, String Porint) throws BusinessException;


}
