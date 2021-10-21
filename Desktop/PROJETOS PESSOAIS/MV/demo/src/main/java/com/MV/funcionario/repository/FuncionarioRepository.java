package com.MV.funcionario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MV.funcionario.datasource.model.Funcionario;



public interface FuncionarioRepository 



extends JpaRepository<Funcionario,String >{

}
