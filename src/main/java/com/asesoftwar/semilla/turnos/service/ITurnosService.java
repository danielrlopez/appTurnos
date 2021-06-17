package com.asesoftwar.semilla.turnos.service;



import com.asesoftwar.semilla.turnos.dto.ResponseDTO;


public interface ITurnosService {
	
	public ResponseDTO getAll();
	
	public ResponseDTO findByTurnoServicio(Integer idServicio);
	public ResponseDTO findByTurnoComercio(Integer idComercio);

}
