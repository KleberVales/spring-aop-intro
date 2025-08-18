package com.example.springaopintro;

import com.example.springaopintro.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.example.springaopintro")
@EnableAspectJAutoProxy
public class SpringAopIntroApplication {

	public static void main(String[] args) {
		// Inicializa o contexto Spring sem Spring Boot
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringAopIntroApplication.class);

		// Obtém o bean UserService e executa lógica
		UserService userService = context.getBean(UserService.class);
		userService.registerUser("kleber.vales");
	}
}

/*
   - Criar uma classe que simula o processo de registro de um usuário (lógica de negócio)
   - Criar uma classe que aplica preocupações transversais como logging e medição de tempo usando Spring AOP
 */

