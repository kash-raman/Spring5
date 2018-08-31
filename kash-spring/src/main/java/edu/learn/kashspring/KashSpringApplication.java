package edu.learn.kashspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class KashSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(KashSpringApplication.class, args);
	}
}
