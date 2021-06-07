package com.asesoftwar.semilla.turnos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comercios")

public class ComercioEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)// persistir objetos, columna generada automaticamente 
	@Column(name = "id_comercio")
	private Integer id_comercio;
	
	@Column(name = "nom_comercio")
	private String nom_comercio;
	
	@Column(name = "aforo_maximo")
	private String aforo_maximo;

	//get and set
	
	public Integer getId_comercio() {
		return id_comercio;
	}

	public void setId_comercio(Integer id_comercio) {
		this.id_comercio = id_comercio;
	}

	public String getNom_comercio() {
		return nom_comercio;
	}

	public void setNom_comercio(String nom_comercio) {
		this.nom_comercio = nom_comercio;
	}

	public String getAforo_maximo() {
		return aforo_maximo;
	}

	public void setAforo_maximo(String aforo_maximo) {
		this.aforo_maximo = aforo_maximo;
	}
	
}
