package com.med;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.med.mapper")
public class MedSearcherApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedSearcherApplication.class, args);
	}
}
