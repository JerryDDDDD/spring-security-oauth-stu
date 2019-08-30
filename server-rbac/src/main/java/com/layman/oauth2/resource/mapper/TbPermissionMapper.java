package com.layman.oauth2.resource.mapper;

import com.layman.oauth2.resource.entity.TbPermission;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

public interface TbPermissionMapper extends MyMapper<TbPermission> {

    List<TbPermission> selectByUserId(Long userId);
}