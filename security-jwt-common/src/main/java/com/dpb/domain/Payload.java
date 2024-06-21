package com.dpb.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author wanglb@belink.com
 * @version V1.0
 * @title
 * @description
 * @date 2024-06-21 17:37
 */
@Data
public class Payload <T>{
    private String id;
    private T userInfo;
    private Date expiration;
}
