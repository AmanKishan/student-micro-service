package com.dummy.studentmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class StudentmicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentmicroserviceApplication.class, args);
	}

}
