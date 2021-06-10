package com.asesoftwar.semilla.turnos.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.asesoftwar.semilla.turnos.dto.ComercioDTO;
import com.asesoftwar.semilla.turnos.entity.ComercioEntity;



@Mapper(componentModel = "spring")
public interface IComercioMapper {
	
	
	public ComercioDTO entityToDto(ComercioEntity comercioEntity);
	
	public ComercioEntity dtoToEntity(ComercioDTO comercioDTO);
	
	public List<ComercioDTO> listEntityToDto(List<ComercioEntity> comercioEntity);
	public List<ComercioEntity> listDtoToEntity(List<ComercioDTO> comercioDTOs);
	
	
	

}
