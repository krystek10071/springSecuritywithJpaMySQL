package com.example.kris;

import com.example.kris.models.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class KrisApplication {

	public static void main(String[] args) {
		SpringApplication.run(KrisApplication.class, args);
	}

}
