package io.github.prenitavulpo.SantanderAulasJavaJPA.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity(name = "pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;
    @Column(name = "cpf", length = 11)
    private String cpf;
    @Column(name = "salario")
    private float salario;
    @Column(name = "endereco")
    private String endereco;

    private List<Emprestimo> emprestimos;
}
