package com.example.PROJETO.model;

import com.example.PROJETO.model.NF_venda;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "Itens_venda")
public class Itens_venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long itv_id;

    @Column
    private Integer itv_qtd;

    @Column
    private Integer itv_preco;

    /*@ManyToMany
    @JoinColumn(name = "nfv_id")
    private NF_venda nfv_id;*/
    @ManyToMany
    @JoinTable(
            name = "itens_compra_nfv",  // Nome da tabela de junção
            joinColumns = @JoinColumn(name = "itv_id"),  // Coluna de junção referente à entidade atual (Itens_compra)
            inverseJoinColumns = @JoinColumn(name = "nfv_id")     // Coluna de junção referente à outra entidade (Nfc)
    )
    private Set<NF_venda> nfv_id;

    @ManyToMany
    @JoinTable(
            name = "itens_compra_prd",  // Nome da tabela de junção
            joinColumns = @JoinColumn(name = "prd_id"),  // Coluna de junção referente à entidade atual (Itens_compra)
            inverseJoinColumns = @JoinColumn(name = "nfv_id")     // Coluna de junção referente à outra entidade (Nfc)
    )
    private Set<Produto> prd_id;
}
