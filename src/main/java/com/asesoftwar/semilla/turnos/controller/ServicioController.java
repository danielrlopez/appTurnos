package com.asesoftwar.semilla.turnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.asesoftwar.semilla.turnos.entity.ServicioEntity;

import com.asesoftwar.semilla.turnos.service.IServicioService;

@RestController
@RequestMapping(path = "/api/v1/servicio")
public class ServicioController {
	
	@Autowired
	private IServicioService servicioService;
	
	// buscar por ID
	@GetMapping(path = "/busComercio")
	public ServicioEntity buscarPorIdComercio(@RequestParam Integer idComercio) {
			return servicioService.buscarPorIdComecio(idComercio);
	}
	
	
	
	
	
	
	
	//liastar todos
	
	@GetMapping(path = "/listar")
	public List<ServicioEntity> getall(){
		return servicioService.listarTodos();
	}
	
	// buscar por ID
	@GetMapping(path = "/buscar")
	public ServicioEntity buscarPorId(@RequestParam Integer idServicio) {
		return servicioService.buscarPorID(idServicio);
	}
	
	//crear servicios
	
	@PostMapping(path = "/crear", consumes = "application/json",produces = "application/json")
	public ServicioEntity crearServicio(@RequestBody ServicioEntity entity) {
		try {
			return servicioService.crearServicio(entity);
		} catch (Exception e) {
			return null;
		}
	}
	
	//editar servico
	
	@PostMapping(path = "/editar", consumes = "application/json",produces = "application/json")
	
	public ServicioEntity editarServicio(@RequestBody ServicioEntity entity) {
		return servicioService.editarServicio(entity);
	}
	
	//Eliminar servico
	@GetMapping(path = "/eliminar")
	public void eliminarServico(@RequestParam Integer idServicio) {
		servicioService.eliminarServicio(idServicio);
	}
	
	
	

}
