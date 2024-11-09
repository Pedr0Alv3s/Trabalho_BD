package com.example.PROJETO.model;

import com.example.PROJETO.model.NF_venda;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Itens_venda")
public class Itens_venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long itv_id;

    @Column
    private int itv_qtd;

    @Column
    private int itv_preco;

    @ManyToMany
    @JoinColumn(name = "nfv_id")
    private NF_venda nfv_id;

    @ManyToMany
    @JoinColumn(name = "prd_id")
    private int prd_id;
}
