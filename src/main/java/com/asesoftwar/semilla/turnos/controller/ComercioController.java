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

import com.asesoftwar.semilla.turnos.dto.ComercioDTO;
import com.asesoftwar.semilla.turnos.dto.ResponseDTO;
import com.asesoftwar.semilla.turnos.entity.ComercioEntity;
import com.asesoftwar.semilla.turnos.entity.TurnosEntity;
import com.asesoftwar.semilla.turnos.service.IComercioService;


@RestController
@RequestMapping(path = "/api/v1/comercio")

public class ComercioController {
	
	@Autowired
	private IComercioService comercioService;
	
	//listar todos
	
	@GetMapping(path = "/all")
	public ResponseDTO getAll(){
		return comercioService.getAll();
	}

	
	//listar por id
	
	@GetMapping(path = "/buscar")
	public ResponseDTO getComercioById(@RequestParam Integer id_comercio) {
		return comercioService.getComercioById(id_comercio);
	}

	//crear comercio
	
	@PostMapping(path = "/crear", consumes = "application/json",produces = "application/json")
	public ResponseDTO createComercio(@RequestBody ComercioDTO entity) {
	
			return comercioService.createComercio(entity);
		
	}
	
	/// editar usuario //
	@PostMapping(path = "/editar", consumes = "application/json",produces = "application/json")
	
	public ResponseDTO editComercio(@RequestBody ComercioDTO entity) {
		return comercioService.updateComercio(entity);
	}
	
	///eliminar 
	@GetMapping(path = "/eliminar")
	public ResponseDTO eliminarComercio(@RequestParam Integer id_comercio) {
		 return comercioService.deleteComercio(id_comercio);
	}
	
	
}
