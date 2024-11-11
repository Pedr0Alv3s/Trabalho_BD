package com.example.PROJETO.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Setter
@Getter
@Entity
@Table(name = "Fornecedor")

public class Fornecedor{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "for_id", nullable = false)
    private Long for_id;

    @Column(name = "for_cnpj", nullable = false)
    private String for_cnpj;

    @Column(name = "for_nome", nullable = false)
    private String for_nome;

    @Column(name = "for_email", nullable = false)
    private String for_email;

    @Column(name = "for_endereco", nullable = false)
    private String for_endereco;

    @Column(name = "for_telefone", nullable = false)
    private String for_telefone;

    @OneToMany(mappedBy = "fornecedor")
    private List<NF_compra> nfc_id;
}