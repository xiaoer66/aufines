package com.aufine.redis;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class LoginInfos {
    //用户名
    private String username;
    //唯一令牌
    private String token;
    //令牌生成时间
    private Date issuedAt;
    //令牌过期时间
    private Date expiration;
}
