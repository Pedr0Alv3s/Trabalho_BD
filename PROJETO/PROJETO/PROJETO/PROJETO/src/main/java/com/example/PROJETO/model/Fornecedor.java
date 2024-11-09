package com.example.PROJETO.model.Fornecedor;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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

    @Column(name = "for_endereço", nullable = false)
    private String for_endereço;

    @Column(name = "for_email", nullable = false)
    private String for_email;

    @Column(name = "for_telefone", nullable = false)
    private String for_telefone;

}