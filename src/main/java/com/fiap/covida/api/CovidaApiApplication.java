package com.fiap.covida.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@EntityScan(basePackages = "com.fiap.covida.api.model")
@SpringBootApplication

public class CovidaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovidaApiApplication.class, args);
	}

}


//Documentação
//http://localhost:8080/swagger-ui/index.html