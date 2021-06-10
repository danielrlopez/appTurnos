package com.asesoftwar.semilla.turnos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesoftwar.semilla.turnos.entity.ComercioEntity;
import com.asesoftwar.semilla.turnos.entity.ServicioEntity;
import com.asesoftwar.semilla.turnos.entity.TurnosEntity;
import com.asesoftwar.semilla.turnos.repository.IComercioRepository;
import com.asesoftwar.semilla.turnos.repository.IServicioRepository;
import com.asesoftwar.semilla.turnos.repository.ITurnoRepository;

@Service
public class TurnoService implements ITurnosService {

	@Autowired
	private ITurnoRepository turnoRepository;
	
	@Autowired
	private IComercioRepository comercioRepository;

	
	@Override
	public TurnosEntity consultarTurnoPorComercio(Integer idServicio) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	/**@Override
	public TurnosEntity consultarTurnoPorComercio(Integer idServicio) {
		
		ComercioEntity ce = comercioRepository.getById(idServicio);
				 
		Optional<ServicioEntity> servicioslist = servicioRepository.findById(ce.getId_comercio())
		 for (servicioslist){
				     
				 turnosRepository.finByService();
				     
		 }
		
		
		Optional<TurnosEntity> optional = turnoRepository.findById(idServicio);
		if(optional.isPresent()) {
			return optional.get();
		}else {
			return null;
		}
	}*/


}
