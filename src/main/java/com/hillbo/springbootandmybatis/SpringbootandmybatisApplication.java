package com.hillbo.springbootandmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = {"classpath:mybatis-config.xml"})
@MapperScan("com.hillbo.springbootandmybatis.dao")
@SpringBootApplication
public class SpringbootandmybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootandmybatisApplication.class, args);
	}
}
