package com.wang.simplegame.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author 王叠  2017/11/17
 */
@Configuration
@EnableMongoRepositories(basePackages = {"com.wang.simplegame.mongo.game"},
        mongoTemplateRef = "gameMongoTemplate")
@ConfigurationProperties(prefix = "mongodb.game")
@Slf4j
public class MongoGameConfig extends AbstractMongoConfig {
    @Override
    @Bean(name = "gameMongoTemplate")
    public MongoTemplate getMongoTemplate() {
        return new MongoTemplate(mongoDbFactory());
    }
}


