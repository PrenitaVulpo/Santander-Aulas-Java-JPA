package io.github.prenitavulpo.SantanderAulasJavaJPA.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name="parcela")
public class Parcela {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name="valor")
    private float valor;
    @Column(name="num")
    private int num;
    @Column(name="status")
    private String status;
    @Column(name="data_pagamento")
    private String dataPagamento;
    @Column(name="id_emprestimo")
    private int idEmprestimo;

    @ManyToOne
    @JoinColumn(name="id_emprestimo")
    private Emprestimo emprestimo;
}
