package com.wang.simplegame.mongo.game.entity.player;

import com.wang.simplegame.mongo.game.entity.system.role.RoleInitInfo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//玩家角色基本信息
public class PlayerRoleBaseInfo extends RoleInitInfo {
    private Integer lv;//角色当前等级
    private Integer lvMax;//角色最大等级
    private Integer exp;//角色当前经验
    private Integer expMax;//角色当前等级最大经验值
    private Integer mpMax;//当前最大魔力值
    private Integer hpMax;//当前最大血量
}
