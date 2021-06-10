package com.asesoftwar.semilla.turnos.service;

import java.util.List;

import com.asesoftwar.semilla.turnos.dto.ComercioDTO;
import com.asesoftwar.semilla.turnos.dto.ResponseDTO;


public interface IComercioService {
	
	public ResponseDTO getAll();
	
		
	public ResponseDTO getComercioById(Integer id_comercio);
	public ResponseDTO createComercio(ComercioDTO comercioDTO);
	public ResponseDTO updateComercio(ComercioDTO comercioDTO);
	public ResponseDTO deleteComercio(Integer id_comercio);

}
