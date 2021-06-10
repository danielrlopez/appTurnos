package com.asesoftwar.semilla.turnos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.asesoftwar.semilla.turnos.dto.ComercioDTO;
import com.asesoftwar.semilla.turnos.dto.ResponseDTO;
import com.asesoftwar.semilla.turnos.entity.ComercioEntity;
import com.asesoftwar.semilla.turnos.entity.TurnosEntity;
import com.asesoftwar.semilla.turnos.mapper.IComercioMapper;
import com.asesoftwar.semilla.turnos.repository.IComercioRepository;
import com.asesoftwar.semilla.turnos.repository.ITurnoRepository;

@Service
public class ComercioService implements IComercioService {
	
	
	@Autowired
	private IComercioRepository comercioRepository;
	@Autowired
	private IComercioMapper mapperComercio;
	@Override
	public ResponseDTO getAll() {
		return new ResponseDTO( mapperComercio.listEntityToDto( comercioRepository.findAll()), true, "ok", HttpStatus.OK);
	}
	@Override
	public ResponseDTO getComercioById(Integer id_comercio) {

		Optional<ComercioEntity> optional = comercioRepository.findById(id_comercio);
		
		if (optional.isPresent()) {
			
			return  new ResponseDTO(optional.get(), true, "ok", HttpStatus.OK); 
			
		}else {
			return  new ResponseDTO(null, false, "comercio no encontrado", HttpStatus.OK); 
		}
		

		
	}
	@Override
	public ResponseDTO createComercio(ComercioDTO comercioDTO) {
		try {
			
			ComercioEntity comercioEntity = mapperComercio.dtoToEntity(comercioDTO);
			
			comercioRepository.save(comercioEntity);
			
			return new ResponseDTO(mapperComercio.entityToDto(comercioEntity), true, "ok", HttpStatus.OK); 
		}catch (Exception e) {
			return new ResponseDTO(null, false, "No se puede crear el Coemrcio", HttpStatus.OK); 
		}
	}
	@Override
	public ResponseDTO updateComercio(ComercioDTO comercioDTO) {
		ComercioEntity comercioEntity = mapperComercio.dtoToEntity(comercioDTO);
		comercioRepository.save(comercioEntity);
		return new ResponseDTO(mapperComercio.entityToDto(comercioEntity), true, "ok", HttpStatus.OK);
	}
	@Override
	public ResponseDTO deleteComercio(Integer id_comercio) {
		try {
			comercioRepository.deleteById(id_comercio);
			return new ResponseDTO(null, true, "comercio eliminado", HttpStatus.OK) ;
		} catch (Exception e) {
			return new ResponseDTO(null, false, "el comercio no se puede eliminar", HttpStatus.OK) ;
		}
	}
	


	
	
	

}
