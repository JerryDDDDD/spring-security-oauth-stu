package com.layman.service;

import com.layman.entity.TbUser;

/**
 * @InterfaceName TbUserService
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/8/29 9:51
 * @Version 3.0
 **/
public interface TbUserService {

    TbUser getByUsername(String username);
}
