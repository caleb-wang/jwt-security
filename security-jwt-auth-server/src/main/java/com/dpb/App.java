package com.dpb;

import com.dpb.config.RsaKeyProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author wanglb@belink.com
 * @version V1.0
 * @title
 * @description
 * @date 2024-06-21 18:02
 */

@SpringBootApplication
@MapperScan("com.dpb.mapper")
@EnableConfigurationProperties(RsaKeyProperties.class)
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }

    /**
     * NoOpPasswordEncoder不对密码进行额外操作
     *
     * @return
     */
    /*@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }*/
}
