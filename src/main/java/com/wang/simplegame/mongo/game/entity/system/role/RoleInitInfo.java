package com.wang.simplegame.mongo.game.entity.system.role;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//角色初始信息
public class RoleInitInfo {
    protected Integer atk;//攻击力
    protected Integer def;//防御力
    protected Integer hp;//血量
    protected Integer magic;//魔力
    protected Integer mp;//魔力值
    protected Integer speed;//速度
}
