package com.layman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @ClassName oAuthServerApplication
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/8/27 11:08
 * @Version 3.0
 **/
@SpringBootApplication
public class oAuthServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(oAuthServerApplication.class, args);
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
