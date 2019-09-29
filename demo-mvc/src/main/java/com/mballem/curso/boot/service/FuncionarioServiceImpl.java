package com.mballem.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mballem.curso.boot.dao.FuncionarioDao;
import com.mballen.curso.boot.domain.Funcionario;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {
	
	@Autowired
	FuncionarioDao dao;

	@Override
	public void salvar(Funcionario funcionario) {
		dao.save(funcionario);		
	}

	@Override
	public void editar(Funcionario funcionario) {
		dao.update(funcionario);		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);		
	}

	@Override
	public Funcionario buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Funcionario> buscarTodos() {
		return dao.findAll();
	}

}
