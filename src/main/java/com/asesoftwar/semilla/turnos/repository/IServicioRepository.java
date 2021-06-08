package com.asesoftwar.semilla.turnos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asesoftwar.semilla.turnos.entity.ServicioEntity;

public interface IServicioRepository extends JpaRepository<ServicioEntity, Integer> {

}
