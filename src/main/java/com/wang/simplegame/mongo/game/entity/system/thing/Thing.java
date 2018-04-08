package com.wang.simplegame.mongo.game.entity.system.thing;

import com.wang.simplegame.mongo.game.entity.player.PlayerRole;
import com.wang.simplegame.mongo.game.entity.system.role.RoleUpInfo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "thing")
//系统物品表
public class Thing  extends RoleUpInfo implements ThingEffect{
    protected String id;//系统唯一编号
    protected String name;//物品名称
    protected String introduce;//物品介绍

    @Override
    public PlayerRole beUse(PlayerRole playerRole) {
        return playerRole;
    }
}
