package com.asesoftwar.semilla.turnos.dto;

import java.util.List;



import com.asesoftwar.semilla.turnos.entity.ServicioEntity;

import lombok.Data;

@Data
public class ComercioDTO {

	private Integer id_comercio;
	
	private String nom_comercio;
	
	private Integer aforo_maximo;
	
	private List<ServicioDTO> comercios;


}
