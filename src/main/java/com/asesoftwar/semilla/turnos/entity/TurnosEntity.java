package com.asesoftwar.semilla.turnos.entity;

import java.util.Date;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "turnos")


public class TurnosEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)// persistir objetos, columna generada automaticamente 
	@Column(name = "id_turno")
	private Integer idTurno;
	
	@Column(name = "id_servicio")
	private Integer idServicio;
	
	@Column(name = "fecha_turno")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaTurno;
	
	@Column(name = "hora_inicio")
	@Temporal(TemporalType.TIME)
	private Date horaInicio;
	
	@Column(name = "hora_fin")
	@Temporal(TemporalType.TIME)
	private Date horaFin;
	
	@Column(name = "estado")
	private Integer estado;
	

}
