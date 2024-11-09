package com.example.PROJETO.model;

import com.example.PROJETO.model.Funcionario;
import jakarta.persistence.*;
import lombok.Cleanup;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Cargo")

public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "crg_id", nullable = false)
    private Long crg_id;

    @Column(name = "crg_nome", nullable = false)
    private String crg_nome;

    @OneToMany(mappedBy = "cargo")
    private Funcionario fun_id;
}
