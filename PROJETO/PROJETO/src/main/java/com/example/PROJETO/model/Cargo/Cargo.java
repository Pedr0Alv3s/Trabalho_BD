package com.example.PROJETO.model.Cargo;

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
}
