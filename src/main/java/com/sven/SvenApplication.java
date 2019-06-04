package com.sven;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sven.dao")
public class SvenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SvenApplication.class, args);
	}
}
