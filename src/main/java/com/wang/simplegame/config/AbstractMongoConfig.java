package com.wang.simplegame.config;

import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public abstract class AbstractMongoConfig {

    private String host, database;
    private int port;


    /*创建mongo连接工厂*/
    public MongoDbFactory mongoDbFactory() {
        if (host.indexOf(",") == -1) {
            return new SimpleMongoDbFactory(new MongoClient(host, port), database);
        }
        String[] hosts = host.trim().split(",");
        List<ServerAddress> seeds = new ArrayList<>();
        for (String item : hosts) {
            ServerAddress seed = new ServerAddress(item, port);
            seeds.add(seed);
        }
        return new SimpleMongoDbFactory(new MongoClient(seeds), database);
    }
    /*创建基于具体库的操作模板*/
    abstract public MongoTemplate getMongoTemplate();

}
