package com.layman.service;

import com.layman.oauth2.resource.entity.TbPermission;

import java.util.List;

/**
 * @InterfaceName TbPermissionService
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/8/29 9:57
 * @Version 3.0
 **/
public interface TbPermissionService {
    List<TbPermission> selectByUserId(Long userId);
}
