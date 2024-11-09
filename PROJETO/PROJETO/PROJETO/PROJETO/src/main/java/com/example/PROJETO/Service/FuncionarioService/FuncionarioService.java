package com.example.PROJETO.Service.FuncionarioService;

import com.example.PROJETO.DTO.CargoFuncionarioCountDTO.CargoFuncionarioCountDTO;
import com.example.PROJETO.repository.Funcionariorepository.Funcionariorepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    private final Funcionariorepository funcionarioRepository;

    public FuncionarioService(Funcionariorepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public List<CargoFuncionarioCountDTO>  getCountFuncionariosByCargo() {
        return funcionarioRepository.countFuncionariosByCargo();
    }
}
