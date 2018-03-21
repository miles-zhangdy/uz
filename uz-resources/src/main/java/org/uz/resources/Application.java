package org.uz.resources;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("org.uz.business.*.dao")
@ComponentScan(basePackages = {"org.uz"})  
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
		
		
	}

}