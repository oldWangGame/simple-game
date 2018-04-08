package com.wang.simplegame.mongo.game.entity.system.role;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "role")
//角色模板表
public class Role {
    private String id;//系统唯一标识
    private String name;//角色名
    private String introduce;//介绍信息
    private RoleInitInfo initInfo;//角色初始属性
    private RoleUpInfo upInfo;//角色成长属性
}
