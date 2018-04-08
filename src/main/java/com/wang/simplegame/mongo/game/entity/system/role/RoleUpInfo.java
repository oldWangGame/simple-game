package com.wang.simplegame.mongo.game.entity.system.role;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
//角色成长信息
public class RoleUpInfo {
    protected Integer atkUp;//攻击力成长
    protected Integer defUp;//防御力成长
    protected Integer hpUp;//血量成长
    protected Integer magicUp;//魔力成长
    protected Integer mpUp;//魔力值成长
    protected Integer speed;//速度成长
}
