package com.asesoftwar.semilla.turnos.entity;

import java.sql.Date;
import java.sql.Time;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
	private Date fechaTurno;
	
	@Column(name = "hora_inicio")
	private Time horaInicio;
	
	@Column(name = "hora_fin")
	private Time horaFin;
	
	@Column(name = "estado")
	private Integer estado;
	

}
