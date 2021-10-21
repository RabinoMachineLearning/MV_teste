package com.MV.funcionario.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MV.funcionario.datasource.model.Funcionario;
import com.MV.funcionario.repository.FuncionarioRepository;
@SpringBootApplication
@Controller


	
	@RestController
	
	@RequestMapping (value= "/api")
	public class FuncionarioController {
		
			
	
	@Autowired 
	private FuncionarioRepository funcionarioRepository;
	
	
	@GetMapping (path = "/funcionario")
	public List<Funcionario> buscarFuncionario() {
	
		return funcionarioRepository.findAll();
		
	}
	
	 
}
