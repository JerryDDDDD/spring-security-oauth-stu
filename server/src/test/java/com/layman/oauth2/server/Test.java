package com.layman.oauth2.server;

import org.junit.runner.RunWith;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @ClassName Test
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/8/27 15:17
 * @Version 3.0
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("secret"));
    }
}
