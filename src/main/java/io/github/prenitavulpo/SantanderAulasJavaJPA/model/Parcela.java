package io.github.prenitavulpo.SantanderAulasJavaJPA.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Parcela {
    private String id;
    private float valor;
    private int num;
    private String status;
    private String data_patagamento;
    private int id_emprestimo;

    private Emprestimo emprestimo;
}
