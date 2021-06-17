package com.asesoftwar.semilla.turnos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftwar.semilla.turnos.dto.ResponseDTO;
import com.asesoftwar.semilla.turnos.service.ITurnosService;

@RestController
@RequestMapping(path = "/api/v1/turno")
public class TurnoController {
	
	@Autowired
	private ITurnosService serviceTurno;
	
	@GetMapping(path = "/listar")
	public ResponseDTO getall(){
		return serviceTurno.getAll();
		
	}
	
	//consultar turnos por id de servicio
	@GetMapping(path = "/turnosServicio/{idServicio}")
	public ResponseDTO consultarPorServicios(@PathVariable Integer idServicio){
		return serviceTurno.findByTurnoServicio(idServicio);
	}
	
	//consultar turnos por id de comecio
	@GetMapping(path = "/turnosComercio/{idComercio}")
	public ResponseDTO consultarPorComercios(@PathVariable Integer idComercio){
		return serviceTurno.findByTurnoComercio(idComercio);
	}

}
