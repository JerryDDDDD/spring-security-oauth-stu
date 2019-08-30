package com.layman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @ClassName OAuth2Application
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/8/27 15:29
 * @Version 3.0
 **/
@SpringBootApplication
@MapperScan(basePackages = "com.layman.oauth2.resource.mapper")
public class OAuth2RBACApplication {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2RBACApplication.class, args);
    }

}
