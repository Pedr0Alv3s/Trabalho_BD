package com.example.PROJETO.model;

import com.example.PROJETO.model.NF_compra;
import com.example.PROJETO.model.Produto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "Itens-compra")

public class Itens_compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long itc_id;

    @Column
    private int itc_qtd;

    @Column
    private int itc_preco;

    @ManyToMany
    @JoinTable(
            name = "itens_compra_nfc",  // Nome da tabela de junção
            joinColumns = @JoinColumn(name = "itc_id"),  // Coluna de junção referente à entidade atual (Itens_compra)
            inverseJoinColumns = @JoinColumn(name = "nfc_id")     // Coluna de junção referente à outra entidade (Nfc)
    )
    private Set<NF_compra> nfc_id;

    @ManyToMany
    @JoinTable(
            name = "itens_compra_prd",  // Nome da tabela de junção
            joinColumns = @JoinColumn(name = "itc_id"),
            inverseJoinColumns = @JoinColumn(name = "prd_id")
    )
    private Set<Produto> prd_id;
}
