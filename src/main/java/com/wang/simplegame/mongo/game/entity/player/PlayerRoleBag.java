package com.wang.simplegame.mongo.game.entity.player;

import com.wang.simplegame.mongo.game.entity.system.thing.Thing;

//玩家角色包裹
public class PlayerRoleBag {
    private Integer maxSize;//最大容量
    private Integer thingNum;//当前包裹中有效物品个数
    private Thing[] thingPack;//物品容器
}
