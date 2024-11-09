package com.example.PROJETO.DTO;
import java.net.InterfaceAddress;

public class CargoFuncionarioCountDTO {

    private String nomeCargo;
    private Long totalFuncionarios;

    public CargoFuncionarioCountDTO(String nomeCargo, Long totalFuncionarios) {
        this.nomeCargo = nomeCargo;
        this.totalFuncionarios = totalFuncionarios;
    }

    // Getters e setters
    public String getNomeCargo() {
        return nomeCargo;
    }

    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public Long getTotalFuncionarios() {
        return totalFuncionarios;
    }

    public void setTotalFuncionarios(Long totalFuncionarios) {
        this.totalFuncionarios = totalFuncionarios;
    }
}
