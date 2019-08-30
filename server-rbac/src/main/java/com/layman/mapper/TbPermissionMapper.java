package com.layman.mapper;

import com.layman.entity.TbPermission;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

public interface TbPermissionMapper extends MyMapper<TbPermission> {

    List<TbPermission> selectByUserId(Long userId);
}