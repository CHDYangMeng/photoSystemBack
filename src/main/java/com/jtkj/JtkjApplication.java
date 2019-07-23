package com.jtkj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan("com.jtkj")
@MapperScan("com.jtkj.mapper")
public class JtkjApplication {

	public static void main(String[] args) {
		SpringApplication.run(JtkjApplication.class, args);
	}

}
