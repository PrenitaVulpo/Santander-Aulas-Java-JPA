package io.github.prenitavulpo.SantanderAulasJavaJPA.service;

import io.github.prenitavulpo.SantanderAulasJavaJPA.model.Emprestimo;
import io.github.prenitavulpo.SantanderAulasJavaJPA.model.Pessoa;
import io.github.prenitavulpo.SantanderAulasJavaJPA.repository.EmprestimoRepository;
import io.github.prenitavulpo.SantanderAulasJavaJPA.repository.ParcelaRepository;
import io.github.prenitavulpo.SantanderAulasJavaJPA.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class EmprestimoService {

    private final PessoaRepository pessoaRepository;
    private final EmprestimoRepository emprestimoRepository;
    private final ParcelaRepository parcelaRepository;

    public void criarEmprestimo(){
        Pessoa p = Pessoa.builder()
                .nome("Joao")
                .cpf("1111")
                .endereco("Rua nnn")
                .salario((float)1000)
                .build();

        p = pessoaRepository.save(p);

        Emprestimo emprestimo = Emprestimo.builder()
                .dataEmprestimo(LocalDateTime.now())
                .valor(10000F)
                .numParcelas(5)
                .status("ABERTO")
                .build();

        emprestimo.getPessoas().add(p);

        emprestimoRepository.save(emprestimo);
    }
}
