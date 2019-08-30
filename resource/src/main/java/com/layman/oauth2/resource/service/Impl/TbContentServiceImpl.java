package com.layman.oauth2.resource.service.Impl;

import com.layman.oauth2.resource.entity.TbContent;
import com.layman.oauth2.resource.mapper.TbContentMapper;
import com.layman.oauth2.resource.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ServiceImpl
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/8/30 10:48
 * @Version 3.0
 **/
@Service
public class TbContentServiceImpl implements TbContentService {

    @Autowired
    private TbContentMapper tbContentMapper;

    @Override
    public List<TbContent> selectAllTbContent() {
        List<TbContent> tbContents = tbContentMapper.selectAll();
        return tbContents;
    }
}
