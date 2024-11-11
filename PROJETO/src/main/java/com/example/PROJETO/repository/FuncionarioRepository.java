package com.example.PROJETO.repository;

import com.example.PROJETO.DTO.FuncionarioporCargoDTO;
import com.example.PROJETO.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    //metodo de busca pelo nome do funcionario;
    List<Funcionario> findByfunNome(String funNome);

    //metodo de soma de funcionarios por cargo;
    /* @Query(value = "SELECT new com.example.PROJETO.DTO.FuncionarioporCargoDTO(c.crg_nome, COUNT(f.fun_id) AS total_funcionarios) "
                    + "FROM Funcionario f "
                    + "JOIN Cargo AS c ON f.crg_id = c.crg_id "
                    + "GROUP BY c.crg_nome", nativeQuery = true)
    List<FuncionarioporCargoDTO> FuncionarioporCargo(); */
}
