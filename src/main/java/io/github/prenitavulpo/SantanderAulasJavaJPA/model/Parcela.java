package io.github.prenitavulpo.SantanderAulasJavaJPA.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@RequiredArgsConstructor
@Entity(name="parcela")
public class Parcela {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "valor")
    private Float valor;

    @Column(name = "num")
    private Integer num;

    @Column(name = "data_pagamento")
    private LocalDateTime dataPagamento;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_emprestimo")
    private Emprestimo emprestimo;
}
