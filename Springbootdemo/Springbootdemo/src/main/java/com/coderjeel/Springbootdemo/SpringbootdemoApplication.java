package com.coderjeel.Springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
		ApplicationContext context = SpringApplication.run(SpringbootApplication.class.args);
		System.out.println("hello this is coder_jeel");

		Alien obj = context.getBean(Alien.class);

		obj.code();

	}
}