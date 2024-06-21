package com.jwt;

import com.dpb.utils.RsaUtils;
import org.junit.Test;

/**
 * @author wanglb@belink.com
 * @version V1.0
 * @title
 * @description 在通用子模块中编写测试类生成rsa公钥和私钥
 * @date 2024-06-21 17:44
 */
public class test {
    private String privateKey = "F:/code/boot-security-jwt/auth_key/id_key_rsa";

    private String publicKey = "F:/code/boot-security-jwt/auth_key/id_key_rsa.pub";

    @Test
    public void test1() throws Exception{
        RsaUtils.generateKey(publicKey,privateKey,"dpb",1024);
    }



}
