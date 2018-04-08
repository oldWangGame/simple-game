package com.wang.simplegame.mongo.game.entity.player;

import com.wang.simplegame.mongo.game.entity.system.role.Role;
import com.wang.simplegame.mongo.game.entity.system.role.RoleInitInfo;
import com.wang.simplegame.mongo.game.entity.system.user.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "player_role")
//玩家角色表
public class PlayerRole extends RoleInitInfo{
    private User player;//关联玩家
    private Role role;//关联系统角色
    private PlayerRoleBaseInfo baseInfo;//玩家角色基本信息
    private PlayerRoleBag bag;//玩家角色包裹
}
