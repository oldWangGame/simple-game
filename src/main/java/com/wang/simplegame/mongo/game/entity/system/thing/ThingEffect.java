package com.wang.simplegame.mongo.game.entity.system.thing;

import com.wang.simplegame.mongo.game.entity.player.PlayerRole;

//物品效果
public interface ThingEffect {
    /**
     * 被使用
     *
     * @param playerRole 玩家角色
     * @return
     */
    PlayerRole beUse(PlayerRole playerRole);
}
