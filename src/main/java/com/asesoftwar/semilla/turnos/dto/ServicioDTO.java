package com.asesoftwar.semilla.turnos.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.asesoftwar.semilla.turnos.entity.TurnosEntity;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class ServicioDTO {
	

	private Integer idServicio;
	
	private Integer idComercio;
	
	private String nomServicio;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "HH:mm:ss", timezone = "America/New_York")
	private Date horaApertura;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "HH:mm:ss", timezone = "America/New_York")
	private Date horaCierre;

	private Integer duracion;

	private List<TurnoDTO> turnos;

}
