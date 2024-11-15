package com.example.PROJETO.model;

import com.example.PROJETO.model.Cargo;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Funcionario")

public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fun_id", nullable = false)
    private Long fun_id;

    @Column(name = "fun_nome", nullable = false)
    private String funNome;

    @Column(name = "fun_endereco", nullable = false)
    private String fun_endereco;

    @Column(name = "fun_email", nullable = false)
    private String fun_email;

    @Column(name = "fun_senha", nullable = false)
    private String fun_senha;

    @Column(name = "fun_telefone", nullable = false)
    private String fun_telefone;

    @ManyToOne
    @JoinColumn(name ="crg_id")
    private Cargo cargo;

    @OneToMany(mappedBy = "funcionario")
    private List<NF_venda> nfv_id;
}
