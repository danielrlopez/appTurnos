package com.asesoftwar.semilla.turnos.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.asesoftwar.semilla.turnos.dto.ServicioDTO;
import com.asesoftwar.semilla.turnos.entity.ServicioEntity;


@Mapper(componentModel = "spring")
public interface IServicioMapper {
	
	
	public ServicioDTO entityToDto(ServicioEntity servicioEntity);
	
	public ServicioEntity dtoToEntity(ServicioDTO servicoDTO);
	
	public List<ServicioDTO> listEntityToDto(List<ServicioEntity> servicioEntity);
	public List<ServicioEntity> listDtoToEntity(List<ServicioDTO> servicoDTOs);

}
