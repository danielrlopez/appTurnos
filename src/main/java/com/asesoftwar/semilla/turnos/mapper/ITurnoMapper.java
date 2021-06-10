package com.asesoftwar.semilla.turnos.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.asesoftwar.semilla.turnos.dto.TurnoDTO;
import com.asesoftwar.semilla.turnos.entity.TurnosEntity;



@Mapper(componentModel = "spring")
public interface ITurnoMapper {
	
	public TurnoDTO entityToDto(TurnosEntity turnosEntity);
	
	public TurnosEntity dtoToEntity(TurnoDTO turnoDTO);
	
	public List<TurnoDTO> listEntityToDto(List<TurnosEntity> turnosEntity);
	public List<TurnosEntity> listDtoToEntity(List<TurnoDTO> turnoDTOs);

}
