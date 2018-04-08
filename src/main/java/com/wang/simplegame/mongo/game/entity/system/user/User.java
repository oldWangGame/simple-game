package com.wang.simplegame.mongo.game.entity.system.user;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
@Getter
@Setter
//用户表
public class User {
    private String id;//唯一编号
    private UserInfo baseInfo;//基本信息
    private UserContacts contacts;//联系方式
    private UserSecurity security;//安全相关信息
}
