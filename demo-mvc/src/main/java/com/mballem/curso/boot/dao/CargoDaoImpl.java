package com.mballem.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.mballen.curso.boot.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
