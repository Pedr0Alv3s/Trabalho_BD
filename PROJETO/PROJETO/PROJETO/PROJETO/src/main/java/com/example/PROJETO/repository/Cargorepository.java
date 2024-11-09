package com.example.PROJETO.repository.Cargorepository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.PROJETO.model.Cargo.Cargo;

public interface Cargorepository extends JpaRepository<Cargo, Integer> {
	Optional<Cargo> findByNome(String crg_nome);
}