package com.movie.naveenprojectconsumer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Naveenprojectconsumer2Application {

	public static void main(String[] args) {
		SpringApplication.run(Naveenprojectconsumer2Application.class, args);
	}

}
