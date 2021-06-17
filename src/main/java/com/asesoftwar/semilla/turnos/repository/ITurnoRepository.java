package com.asesoftwar.semilla.turnos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.asesoftwar.semilla.turnos.entity.TurnosEntity;

public interface ITurnoRepository extends JpaRepository<TurnosEntity, Integer>{
	
	List<TurnosEntity> findByIdServicio(Integer idServicio);
	
	//consulta de turnos por servicio
	@Query("SELECT t FROM TurnosEntity t WHERE t.idServicio  = ?1")
	List<TurnosEntity> queryTurnoServicio(Integer idServicio);
	
	
	//consuta turnos por comercio 
	@Query("SELECT t FROM TurnosEntity t, ServicioEntity s, ComercioEntity c WHERE t.idServicio  = s.idServicio AND s.idComercio = c.id_comercio AND c.id_comercio = ?1")
	List<TurnosEntity> queryTurnosComercio(Integer idComercio );
}
