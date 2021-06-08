package com.asesoftwar.semilla.turnos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesoftwar.semilla.turnos.entity.ServicioEntity;
import com.asesoftwar.semilla.turnos.repository.IServicioRepository;

@Service
public class ServicioService implements IServicioService{

	@Autowired
	private IServicioRepository servicioRepository;
	
	@Override
	public List<ServicioEntity> listarTodos() {
		
		return servicioRepository.findAll();
	}

	@Override
	public ServicioEntity buscarPorID(Integer idServicio) {
		Optional<ServicioEntity> optional = servicioRepository.findById(idServicio);
		if(optional.isPresent()) {
			return optional.get();
		}else {
			return null;
		}
	}
	


	@Override
	public ServicioEntity crearServicio(ServicioEntity servicioEntity) {
		try {
			return servicioRepository.save(servicioEntity);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public ServicioEntity editarServicio(ServicioEntity servicioEntity) {
		
		return servicioRepository.save(servicioEntity);
	}

	@Override
	public void eliminarServicio(Integer idServicio) {

		servicioRepository.deleteById(idServicio);
	}
	

	@Override
	public ServicioEntity buscarPorIdComecio(Integer idComercio) {
		Optional<ServicioEntity> optional = servicioRepository.findById(idComercio);
		if(optional.isPresent()) {
			return optional.get();
		}else {
			return null;
		}
		
	}

}
