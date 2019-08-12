package com.example.employeeconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class EmployeeConsumerApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(EmployeeConsumerApplication.class, args);
		com.example.controllers.RestController bean = ac.getBean(com.example.controllers.RestController.class);
		System.out.println(bean);
		bean.getEmployee();
	}

	@Bean
	public com.example.controllers.RestController consumerControllerClient() {
		return new com.example.controllers.RestController();
	}
}
