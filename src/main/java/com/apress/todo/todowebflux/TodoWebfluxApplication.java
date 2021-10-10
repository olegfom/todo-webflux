package com.apress.todo.todowebflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.apress.todo"})
public class TodoWebfluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoWebfluxApplication.class, args);
	}

}
