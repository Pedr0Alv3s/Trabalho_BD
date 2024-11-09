package com.example.PROJETO.repository.Funcionariorepository;

import java.util.List;
import java.util.Optional;

import com.example.PROJETO.DTO.CargoFuncionarioCountDTO.CargoFuncionarioCountDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PROJETO.model.Funcionario.Funcionario;
import org.springframework.data.jpa.repository.Query;

public interface Funcionariorepository extends JpaRepository<Funcionario, Integer> {
	Optional<Funcionario> findByNome(String fun_nome);
	@Query(value = "SELECT f.crg_nome AS Cargo, COUNT(f) AS total_de_funcionários"
			+ "FROM Funcionario f"
			+ "GROUP BY f.crg_nome"
			,nativeQuery = true)
	List<CargoFuncionarioCountDTO> countFuncionariosByCargo();
}