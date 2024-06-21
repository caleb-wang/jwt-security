package com.jwt;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author wanglb@belink.com
 * @version V1.0
 * @title
 * @description
 * @date 2024-06-21 18:57
 */
public class JwtTest {

    @Test
    public void test1() throws Exception{
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String password = encoder.encode("123");
        System.out.println("加密后密码:"+password);
    }
}
