package io.github.prenitavulpo.SantanderAulasJavaJPA.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity(name="emprestimo")
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "valor")
    private float valor;
    @Column(name = "num_parcelas")
    private int numParcelas;
    @Column(name = "data_emprestimo")
    private String dataEmprestimo;
    @Column(name = "status")
    private String status;

    @OneToMany(mappedBy = "emprestimo"
//            , fetch = FetchType.EAGER,cascade = CascadeType.ALL
    )
    private List<Parcela> parcelas;
    @ManyToMany
    @JoinTable(
            name = "pessoa_emprestimo",
            joinColumns = {@JoinColumn(name = "id_emprestimo")},
            inverseJoinColumns = {@JoinColumn(name = "id_pessoa")}
    )
    private List<Pessoa> pessoas;
}
