package com.example.PROJETO.repository;

import com.example.PROJETO.model.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CargoRepository extends JpaRepository<Cargo, Long> {
    //metodo de busca pelo nome do cargo;
    List<Cargo> findBycrgNome(String crgNome);
}
