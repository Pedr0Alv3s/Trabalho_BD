package com.example.PROJETO.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "Cliente")

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cli_id", nullable = false)
    private Long cli_id;

    @Column(name = "cli_nome", nullable = false)
    private String cli_nome;

    @Column(name = "cli_endereco", nullable = false)
    private String cli_endereco;

    @Column(name = "cli_email", nullable = false)
    private String cli_email;

    @Column(name = "cli_senha", nullable = false)
    private String cli_senha;

    @Column(name = "cli_telefone", nullable = false)
    private String cli_telefone;

    @OneToMany(mappedBy = "cliente")
    private Set<NF_venda> nfv_id;

}
