package com.asesoftwar.semilla.turnos.entity;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "servicios")

public class ServicioEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)// persistir objetos, columna generada automaticamente 
	@Column(name = "id_servicio")
	private Integer id_servicio;
	
	@Column(name = "id_comercio")
	private Integer idComercio;
	
	@Column(name = "nom_servicio")
	private String nom_servicio;
	
	@Column(name = "hora_apertura")
	private Time hora_apertura;
	
	@Column(name = "hora_cierre")
	private Time hora_cierre;
	
	@Column(name = "duracion")
	private Integer duracion;

}
