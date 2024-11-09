package com.example.PROJETO.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "NF_compra")

public class NF_compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long nfc_id;

    @Column(name = "data_emissao", nullable = false)
    private Date nfc_data_emissao;

    @ManyToOne
    @JoinColumn(name = "for_id")
    private String for_id;

}
