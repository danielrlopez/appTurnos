package com.asesoftwar.semilla.turnos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asesoftwar.semilla.turnos.entity.TurnosEntity;

public interface ITurnoRepository extends JpaRepository<TurnosEntity, Integer>{

}
