package com.example.PROJETO.Controller.FuncionarioController;

import com.example.PROJETO.DTO.CargoFuncionarioCountDTO.CargoFuncionarioCountDTO;
import com.example.PROJETO.Service.FuncionarioService.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    @Autowired
    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping("/por-cargo")
    public List<CargoFuncionarioCountDTO> getFuncionariosPorCargo() {
        return funcionarioService.getCountFuncionariosByCargo();
    }
}