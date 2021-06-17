package com.asesoftwar.semilla.turnos.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.asesoftwar.semilla.turnos.dto.ResponseDTO;
import com.asesoftwar.semilla.turnos.dto.ServicioDTO;
import com.asesoftwar.semilla.turnos.entity.ServicioEntity;
import com.asesoftwar.semilla.turnos.mapper.IServicioMapper;
import com.asesoftwar.semilla.turnos.repository.IServicioRepository;

@Service
public class ServicioService implements IServicioService{

	private static final Logger logger  = LoggerFactory.getLogger(ServicioService.class);
	
	@Autowired
	private IServicioRepository servicioRepository;
	
	@Autowired
	private IServicioMapper mapperServicio;
	

	@Override
	public ResponseDTO getAll() {
		
		return new ResponseDTO(mapperServicio.listEntityToDto(servicioRepository.findAll()), true, "ok", HttpStatus.OK);
	}


	@Override
	public ResponseDTO getServicoById(Integer idServicio) {
		Optional<ServicioEntity> optional = servicioRepository.findById(idServicio);
		if (optional.isPresent()) {
			
			return new ResponseDTO(optional.get(), true, "ok", HttpStatus.OK);
			
		}else {
			return new ResponseDTO(null, true, "servico no encontrado", HttpStatus.OK);
		}
	}


	@Override
	public ResponseDTO createServicio(ServicioDTO servicioDTO) {
		try {
			ServicioEntity servicoEntity = mapperServicio.dtoToEntity(servicioDTO);
			servicioRepository.save(servicoEntity);
			return new ResponseDTO(mapperServicio.entityToDto(servicoEntity), true, "ok", HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseDTO(null, true, "no se puede crear el servico", HttpStatus.OK);
		}
		
	}


	@Override
	public ResponseDTO updateServicio(ServicioDTO servicioDTO) {
		ServicioEntity servicoEntity = mapperServicio.dtoToEntity(servicioDTO);
		servicioRepository.save(servicoEntity);
		return new ResponseDTO(mapperServicio.entityToDto(servicoEntity),true,"ok", HttpStatus.OK);
		
	}


	@Override
	public ResponseDTO deleteServicio(Integer idServicio) {
		
		logger.info("ingreso al metodo deleteservicio");
		
		try {
			servicioRepository.deleteById(idServicio);
			
			
			
			logger.info("el servicio {} se elimino",idServicio);
			
			return new ResponseDTO(null, true, "Servico eliminado", HttpStatus.OK);
		} catch (Exception e) {
			
			logger.error("Error {}",e.getMessage());
			return new ResponseDTO(null, false, "el servicio no pudo ser eliminado", HttpStatus.OK);
		}
	}

	
	
}
