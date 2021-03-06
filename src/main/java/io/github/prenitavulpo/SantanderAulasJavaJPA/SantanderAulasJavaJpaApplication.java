package io.github.prenitavulpo.SantanderAulasJavaJPA;

import io.github.prenitavulpo.SantanderAulasJavaJPA.model.Pessoa;
import io.github.prenitavulpo.SantanderAulasJavaJPA.repository.PessoaRepository;
import io.github.prenitavulpo.SantanderAulasJavaJPA.service.EmprestimoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SantanderAulasJavaJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SantanderAulasJavaJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(EmprestimoService emprestimoService){
		return args ->{
			emprestimoService.criarEmprestimo();
		};
	}
}
