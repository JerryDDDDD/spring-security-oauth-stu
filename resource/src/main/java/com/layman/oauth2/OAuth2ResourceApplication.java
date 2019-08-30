package com.layman.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @ClassName OAuth2ResourceApplication
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/8/30 10:22
 * @Version 3.0
 **/
@SpringBootApplication
@MapperScan(basePackages = "com.layman.oauth2.resource.mapper")
public class OAuth2ResourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OAuth2ResourceApplication.class, args);
    }
}
