package com.asesoftwar.semilla.turnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftwar.semilla.turnos.entity.ServicioEntity;

import com.asesoftwar.semilla.turnos.service.IServicioService;

@RestController
@RequestMapping(path = "/api/v1/servicio")
public class ServicioController {
	
	@Autowired
	private IServicioService servicioService;
	
	//liastar todos
	
	@GetMapping(path = "/listar")
	public List<ServicioEntity> getall(){
		return servicioService.listarTodos();
	}

}
