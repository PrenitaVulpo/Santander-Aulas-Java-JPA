package io.github.prenitavulpo.SantanderAulasJavaJPA;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SantanderAulasJavaJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SantanderAulasJavaJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(){
		return args ->{
			System.out.println("teste");
		};
	}
}
