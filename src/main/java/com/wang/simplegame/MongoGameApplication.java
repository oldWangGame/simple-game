package com.wang.simplegame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;

@SpringBootApplication(exclude = MongoDataAutoConfiguration.class)
public class MongoGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoGameApplication.class, args);
	}
}
