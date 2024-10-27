package com.example.PROJETO.model.Produto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "NF_venda")

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prd_id", nullable = false)
    private Long prd_id;

    @Column(name = "prd_nome", nullable = false)
    private String prd_nome;

    @Column(name = "prd_tipo", nullable = false)
    private String prd_tipo;

    @Column(name = "prd_validade", nullable = false)
    private Date prd_validade;

    @Column(name = "prd_preco", nullable = false)
    private float prd_preco;

    @Column(name = "prd_quantidade", nullable = false)
    private int prd_quantidade;
}
