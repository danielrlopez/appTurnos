package com.asesoftwar.semilla.turnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftwar.semilla.turnos.entity.ComercioEntity;

import com.asesoftwar.semilla.turnos.service.IComercioService;


@RestController
@RequestMapping(path = "/api/v1/comercio")

public class ComercioController {
	
	@Autowired
	private IComercioService comercioService;
	
	//listar todos
	
	@GetMapping(path = "/all")
	public List<ComercioEntity> getAll(){
		return comercioService.getAll();
	}
	
	//listar por id
	
	@GetMapping(path = "/buscar")
	public ComercioEntity getComercioById(@RequestParam Integer id_comercio) {
		return comercioService.getComercioById(id_comercio);
	}

	//crear comercio
	
	@PostMapping(path = "/crear", consumes = "application/json",produces = "application/json")
	public ComercioEntity createComercio(@RequestBody ComercioEntity entity) {
		try {
			return comercioService.createComercio(entity);
		} catch (Exception e) {
			return null;
		}
	}
	
	/// editar usuario //
	@PostMapping(path = "/editar", consumes = "application/json",produces = "application/json")
	
	public ComercioEntity editComercio(@RequestBody ComercioEntity entity) {
		return comercioService.updateComercio(entity);
	}
	
	///eliminar 
	@GetMapping(path = "/eliminar")
	public void eliminarComercio(@RequestParam Integer id_comercio) {
		comercioService.deleteComercio(id_comercio);
	}
	
	
}
