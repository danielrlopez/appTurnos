package com.asesoftwar.semilla.turnos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesoftwar.semilla.turnos.entity.ComercioEntity;
import com.asesoftwar.semilla.turnos.entity.TurnosEntity;
import com.asesoftwar.semilla.turnos.repository.IComercioRepository;
import com.asesoftwar.semilla.turnos.repository.ITurnoRepository;

@Service
public class ComercioService implements IComercioService {
	
	
	@Autowired
	private IComercioRepository comercioRepository;
	
	@Autowired
	private ITurnoRepository turnoRepository;

	@Override
	public List<ComercioEntity> getAll() {
		
		return comercioRepository.findAll();
	}
	//consultar turnos 
	@Override
	public List<TurnosEntity> darTurnos() {
		
		return turnoRepository.findAll();
	}
	//consultar comercio por ID
	@Override
	public ComercioEntity getComercioById(Integer id_comercio) {
		Optional<ComercioEntity> optional = comercioRepository.findById(id_comercio);
		if(optional.isPresent()) {
			return optional.get();
		}else {
			return null;
		}
		
		
		
	}
	
	//crear comercio
	
	@Override
	public ComercioEntity createComercio(ComercioEntity comercioEntity) {
		try {
			return comercioRepository.save(comercioEntity);
		} catch (Exception e) {
			return null;
		}
	}
	
	//editar
	@Override
	public ComercioEntity updateComercio(ComercioEntity comercioEntity) {
	
		return comercioRepository.save(comercioEntity);
	}
	//eliminar
	@Override
	public void deleteComercio(Integer id_comercio) {
		comercioRepository.deleteById(id_comercio);

		
	}

	
	
	

}
