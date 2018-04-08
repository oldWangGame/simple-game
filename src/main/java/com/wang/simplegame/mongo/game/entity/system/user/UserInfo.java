package com.wang.simplegame.mongo.game.entity.system.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInfo {
    private String name;//昵称
    private String realName;//真实姓名
    private String idCardNum;//身份证
    private String gender;//性别
    private Integer age;//年龄
}
