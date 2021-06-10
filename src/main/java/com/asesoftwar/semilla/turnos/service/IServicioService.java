package com.asesoftwar.semilla.turnos.service;

import java.util.List;

import com.asesoftwar.semilla.turnos.dto.ResponseDTO;
import com.asesoftwar.semilla.turnos.dto.ServicioDTO;



public interface IServicioService {
	
	public ResponseDTO getAll();
	public ResponseDTO getServicoById(Integer idServicio);
	public ResponseDTO createServicio(ServicioDTO servicioDTO);
	public ResponseDTO updateServicio(ServicioDTO servicioDTO);
	public ResponseDTO deleteServicio(Integer idServicio);
	

}
