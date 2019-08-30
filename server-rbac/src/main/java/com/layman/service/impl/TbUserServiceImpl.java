package com.layman.service.impl;

import com.layman.entity.TbUser;
import com.layman.mapper.TbUserMapper;
import com.layman.service.TbUserService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

/**
 * @ClassName TbUserServiceImpl
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/8/29 9:52
 * @Version 3.0
 **/
@Service
public class TbUserServiceImpl implements TbUserService {

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser getByUsername(String username) {
        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username", username);
        return tbUserMapper.selectOneByExample(example);
    }
}
