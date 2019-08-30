package com.layman.service.impl;

import com.layman.entity.TbPermission;
import com.layman.mapper.TbPermissionMapper;
import com.layman.service.TbPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName TbPermissionServiceImpl
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/8/29 9:58
 * @Version 3.0
 **/
@Service
public class TbPermissionServiceImpl implements TbPermissionService {

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> selectByUserId(Long userId) {
        return tbPermissionMapper.selectByUserId(userId);
    }
}
