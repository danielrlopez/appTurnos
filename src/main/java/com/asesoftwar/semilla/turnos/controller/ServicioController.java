package com.asesoftwar.semilla.turnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftwar.semilla.turnos.dto.ResponseDTO;
import com.asesoftwar.semilla.turnos.dto.ServicioDTO;
import com.asesoftwar.semilla.turnos.entity.ServicioEntity;

import com.asesoftwar.semilla.turnos.service.IServicioService;

@RestController
@RequestMapping(path = "/api/v1/servicio")
public class ServicioController {
	
	@Autowired
	private IServicioService servicioService;
	
	
	
	//liastar todos
	
	@GetMapping(path = "/listar")
	public ResponseDTO getall(){
		return servicioService.getAll();
	}
	
	// buscar por ID
	@GetMapping(path = "/buscar")
	public ResponseDTO buscarPorId(@RequestParam Integer idServicio) {
		return servicioService.getServicoById(idServicio);
	}
	
	//crear servicios
	
	@PostMapping(path = "/crear", consumes = "application/json",produces = "application/json")
	public ResponseDTO crearServicio(@RequestBody ServicioDTO entity) {
		
			return servicioService.createServicio(entity);
		
	}
	
	//editar servico
	
	@PostMapping(path = "/editar", consumes = "application/json",produces = "application/json")
	
	public ResponseDTO editarServicio(@RequestBody ServicioDTO entity) {
		return servicioService.updateServicio(entity);
	}
	
	//Eliminar servico
	@GetMapping(path = "/eliminar")
	public ResponseDTO eliminarServico(@RequestParam Integer idServicio) {
		return servicioService.deleteServicio(idServicio);
	}
	
	
	

}
