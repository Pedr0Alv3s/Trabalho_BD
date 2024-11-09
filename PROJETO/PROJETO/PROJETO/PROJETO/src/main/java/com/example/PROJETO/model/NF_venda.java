package com.example.PROJETO.model.NF_venda;

import com.example.PROJETO.model.Cliente.Cliente;
import com.example.PROJETO.model.Funcionario.Funcionario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "NF_venda")

public class NF_venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nfv_id", nullable = false)
    private Long nfv_id;

    @Column(name = "data_emissao", nullable = false)
    private Date nfv_data_emissao;

    @ManyToOne
    @JoinColumn(name = "fun_id")
    private Funcionario fun_id;

    @ManyToOne
    @JoinColumn(name = "cli_id")
    private Cliente cli_id;
}
