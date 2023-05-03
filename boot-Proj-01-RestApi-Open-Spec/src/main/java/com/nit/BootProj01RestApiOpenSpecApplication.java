package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(title="Student_Api",version = "2.0",description = "Student Rest Api"))
public class BootProj01RestApiOpenSpecApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootProj01RestApiOpenSpecApplication.class, args);
	}

}
