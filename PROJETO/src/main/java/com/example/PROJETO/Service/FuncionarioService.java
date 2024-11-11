package com.example.PROJETO.Service;

import com.example.PROJETO.DTO.FuncionarioporCargoDTO;
import com.example.PROJETO.model.Funcionario;
import com.example.PROJETO.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    // Método de busca por nome no serviço
    public List<Funcionario> buscarPorNome(String nome) {
        // Chama o método findByFun_nome no repositório
        return funcionarioRepository.findByfunNome(nome);
    }

    public List<Funcionario> getAll() {
        return funcionarioRepository.findAll();
    }

    /* public List<FuncionarioporCargoDTO> getFuncionariosporCargo(){
        return funcionarioRepository.FuncionarioporCargo();
    } */

    // Outros métodos do serviço...
}
