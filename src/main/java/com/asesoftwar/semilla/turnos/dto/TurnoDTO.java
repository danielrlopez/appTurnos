package com.asesoftwar.semilla.turnos.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class TurnoDTO {
	

	private Integer idTurno;
	
	private Integer idServicio;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy/MM/dd", timezone = "America/New_York")
	private Date fechaTurno;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "HH:mm:ss", timezone = "America/New_York")
	private Date horaInicio;

	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "HH:mm:ss", timezone = "America/New_York")
	private Date horaFin;
	
	@Column(name = "estado")
	private Integer estado;
	
	public TurnoDTO() {}
	
	public TurnoDTO(Integer idTurno,Integer idServicio,Date fechaTurno,Date horaInicio,Date horaFin,Integer estado) {
		super();
		this.idTurno=idTurno;
		this.idServicio=idServicio;
		this.fechaTurno=fechaTurno;
		this.horaInicio=horaInicio;
		this.horaFin=horaFin;
		this.estado=estado;
		
	}

}
