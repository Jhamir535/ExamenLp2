package com.bd.mysql.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.bd.mysql.modelo.ClassMedico;

public interface IMedicoRepository extends CrudRepository<ClassMedico,Integer>{

}
