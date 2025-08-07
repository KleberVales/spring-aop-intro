package com.example.springaopintro;

import com.example.springaopintro.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringAopIntroApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringAopIntroApplication.class, args);
		UserService userService = context.getBean(UserService.class);
		userService.registerUser("kleber.vales");
	}
}
