package com.example.PROJETO.model;

import com.example.PROJETO.model.Funcionario;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Cleanup;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Cargo")

public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "crg_id", nullable = false)
    private Long crgId;

    @Column(name = "crg_nome", nullable = false)
    private String crgNome;

    @OneToMany(mappedBy = "cargo")
    @JsonBackReference
    private List<Funcionario> fun_id;
}
