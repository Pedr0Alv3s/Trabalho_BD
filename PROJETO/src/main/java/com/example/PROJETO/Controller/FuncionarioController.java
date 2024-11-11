package com.example.PROJETO.Controller;

import com.example.PROJETO.DTO.FuncionarioporCargoDTO;
import com.example.PROJETO.Service.FuncionarioService;
import com.example.PROJETO.model.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    /*@GetMapping
    public ResponseEntity getAllfuncionarios(){
        return ResponseEntity.ok("deu ok");
    }*/

    @GetMapping
    public List<Funcionario> buscarTodos() {
        return funcionarioService.getAll();
    }

    /*
    @GetMapping("/totalporcargo")
    public List<FuncionarioporCargoDTO> getFuncionariosporCargo(){
        return funcionarioService.getFuncionariosporCargo();
    } */




    /*private final FuncionarioService funcionarioService;

    @Autowired
    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping("/porcargo")
    public List<CargoFuncionarioCountDTO> getFuncionariosPorCargo() {
        return funcionarioService.getCountFuncionariosByCargo();


    }*/
}