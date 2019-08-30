package com.layman.oauth2.resource.service;

import com.layman.oauth2.resource.entity.TbContent;

import java.util.List;

/**
 * @InterfaceName TbContentService
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/8/30 10:47
 * @Version 3.0
 **/
public interface TbContentService {
    List<TbContent> selectAllTbContent();
}
