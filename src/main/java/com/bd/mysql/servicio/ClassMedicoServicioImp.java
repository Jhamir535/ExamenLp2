package com.bd.mysql.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.mysql.modelo.ClassMedico;
import com.bd.mysql.repositorio.IMedicoRepository;

@Service

public class ClassMedicoServicioImp implements IMedicoServicio{

	@Autowired
	private IMedicoRepository imedicorepository;
	
	
	@Override
	public void RegistrarMedico(ClassMedico classmedico) {
		imedicorepository.save(classmedico);
		
	}

	@Override
	public void EliminarMedico(Integer id) {

		imedicorepository.deleteById(id);
	}

	@Override
	public ClassMedico BuscarporId(Integer id) {
		
		return imedicorepository.findById(id).orElse(null);
	}

	@Override
	public List<ClassMedico> ListaMedico() {
		
		return (List<ClassMedico>) imedicorepository.findAll();
	}
	

}
