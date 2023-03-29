package com.dobby;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Dobby01Application {

	public static void main(String[] args) {
		SpringApplication.run(Dobby01Application.class, args);
	}

}
