package com.layman.config.service;

import com.layman.oauth2.resource.entity.TbPermission;
import com.layman.oauth2.resource.entity.TbUser;
import com.layman.service.TbPermissionService;
import com.layman.service.TbUserService;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserDetailServiceImpl
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/8/29 11:35
 * @Version 3.0
 **/
@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private TbUserService tbUserService;

    @Autowired
    private TbPermissionService tbPermissionService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        TbUser user = tbUserService.getByUsername(s);
        List<GrantedAuthority> grantedAuthorities = Lists.newArrayList();
        if (user != null) {
            List<TbPermission> tbPermissions = tbPermissionService.selectByUserId(user.getId());
            tbPermissions.forEach(tbPermission -> {
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
                grantedAuthorities.add(grantedAuthority);
            });
        }
        return new User(user.getUsername(), user.getPassword(), grantedAuthorities);
    }
}
