package com.example.PROJETO.DTO;

public class FuncionarioporCargoDTO {

    private String cargo;
    private Integer totalFuncionarios;

    public FuncionarioporCargoDTO(String cargo, Integer totalFuncionarios){
        this.cargo = cargo;
        this.totalFuncionarios = totalFuncionarios;
    }

    //getters e setters

    public void setCargo(String cargo){
        this.cargo  = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public Integer getTotalFuncionarios() {
        return totalFuncionarios;
    }

    public void setTotalFuncionarios(Integer totalFuncionarios) {
        this.totalFuncionarios = totalFuncionarios;
    }
}
