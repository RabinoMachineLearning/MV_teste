package com.MV.funcionario.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.MV.funcionario.datasource.model.Funcionario;
import com.MV.funcionario.repository.FuncionarioRepository;

public class CadastroFuncionario {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	
	
	public void cadastro(Funcionario funcionario) {
		funcionarioRepository.saveAndFlush(funcionario);

	}
	
}
