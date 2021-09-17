package com.ex.dockerspringboothello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ex")
public class DockerSpringbootHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringbootHelloApplication.class, args);
	}

}
