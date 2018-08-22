package com.easyloan.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.easyloan")
@MapperScan(basePackages = "com.easyloan.manage.mapper")
public class EasyloanManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyloanManageApplication.class, args);
	}
}
