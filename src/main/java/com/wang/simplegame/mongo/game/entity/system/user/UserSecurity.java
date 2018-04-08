package com.wang.simplegame.mongo.game.entity.system.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSecurity {
    private String key;//秘钥
    private String pwd;//登录密码
    private String[] safeIps;//安全ip清单
}
