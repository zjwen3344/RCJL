package com.buoyantec.service;

import com.buoyantec.dataobject.permissionDO;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @program: RCJL
 * @description: 权限表操作
 * @author: zjwen3344@gmail.com
 * @create: 2019-11-25 10:09
 **/
public interface PermissionService {
    permissionDO FindByID(Long id);
    List<permissionDO> FindByID(List<Long> id);
    void Save(permissionDO perDO);
    void Delect(Long id,Long UserID);
}
