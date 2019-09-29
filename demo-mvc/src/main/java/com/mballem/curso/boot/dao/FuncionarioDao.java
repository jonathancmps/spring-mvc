package com.mballem.curso.boot.dao;

import java.util.List;

import com.mballen.curso.boot.domain.Departamento;
import com.mballen.curso.boot.domain.Funcionario;

public interface FuncionarioDao {
	
void save(Funcionario funcionario);
	
	void update(Funcionario funcionario);
	
	void delete(Long id);
	
	Departamento findById();
	
	List<Funcionario> findAll();
}
