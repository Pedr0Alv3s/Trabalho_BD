package com.example.PROJETO.model.Itens_compra;

import com.example.PROJETO.model.NF_compra.NF_compra;
import com.example.PROJETO.model.Produto.Produto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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
    @JoinColumn(name = "nfc_id")
    private NF_compra nfc_id;

    @ManyToMany
    @JoinColumn(name = "prd_id")
    private Produto prd_id;
}
