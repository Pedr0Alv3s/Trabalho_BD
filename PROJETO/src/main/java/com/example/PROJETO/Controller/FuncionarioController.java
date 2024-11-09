package com.example.PROJETO.Controller;

import com.example.PROJETO.Service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    @Autowired
    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping("/porcargo")
    //public List<CargoFuncionarioCountDTO> getFuncionariosPorCargo() {
        //return funcionarioService.getCountFuncionariosByCargo();
    public ResponseEntity getall(){
        return ResponseEntity.ok("deu ok");

    }
}