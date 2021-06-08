package com.asesoftwar.semilla.turnos.service;

import java.util.List;

import com.asesoftwar.semilla.turnos.entity.ServicioEntity;


public interface IServicioService {
	
	public List<ServicioEntity> listarTodos();
	public ServicioEntity buscarPorID(Integer idServicio);
	public ServicioEntity crearServicio(ServicioEntity servicioEntity);
	public ServicioEntity editarServicio(ServicioEntity servicioEntity);
	public void eliminarServicio(Integer idServicio);
	public ServicioEntity buscarPorIdComecio(Integer idComercio);

}
