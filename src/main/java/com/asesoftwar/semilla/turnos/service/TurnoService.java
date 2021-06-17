package com.asesoftwar.semilla.turnos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.asesoftwar.semilla.turnos.dto.ResponseDTO;
import com.asesoftwar.semilla.turnos.dto.TurnoDTO;
import com.asesoftwar.semilla.turnos.entity.ComercioEntity;
import com.asesoftwar.semilla.turnos.entity.ServicioEntity;
import com.asesoftwar.semilla.turnos.entity.TurnosEntity;
import com.asesoftwar.semilla.turnos.mapper.ITurnoMapper;
import com.asesoftwar.semilla.turnos.repository.IComercioRepository;
import com.asesoftwar.semilla.turnos.repository.IServicioRepository;
import com.asesoftwar.semilla.turnos.repository.ITurnoRepository;

@Service
public class TurnoService implements ITurnosService {

	@Autowired
	private ITurnoRepository turnoRepository;
	@Autowired
	private ITurnoMapper mapperTurno;

	@Override
	public ResponseDTO getAll() {
	
		return new ResponseDTO(mapperTurno.listEntityToDto(turnoRepository.findAll()), true, "ok", HttpStatus.OK);
	}

	//consultar servicio por ID de servicoo desde Turno 
	
	@Override
	public ResponseDTO findByTurnoServicio(Integer idServicio) {
		
		List<TurnoDTO> lisTurnoDTO=mapperTurno.listEntityToDto(turnoRepository.queryTurnoServicio(idServicio));
		
		
		return new ResponseDTO(lisTurnoDTO, true, "ok", HttpStatus.OK);
	}

	@Override
	public ResponseDTO findByTurnoComercio(Integer idComercio) {
		List<TurnoDTO> lisTurnoDTO=mapperTurno.listEntityToDto(turnoRepository.queryTurnosComercio(idComercio));
		return new ResponseDTO(lisTurnoDTO, true, "ok", HttpStatus.OK);
	}
	

	
	
	
	



}
