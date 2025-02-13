package com.example.PROJETO.Repository;
import com.example.PROJETO.model.Cliente;
import com.example.PROJETO.DTO.QuantidadeTotalCompra;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    @Query(value = "SELECT Cliente.cli_nome AS NomeCliente, COUNT(Nf_codigo) AS NumeroDeCompras FROM Nf " +
    "LEFT JOIN Cliente ON Cliente.cli_codigo = Nf.cli_codigo " +
    "GROUP BY Cliente.cli_nome; ", nativeQuery = true)
    List<QuantidadeTotalCompra> QuantidadeTotalCompra();
}