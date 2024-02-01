package com.restcliente.clienterest.service;

public interface ClienteRestService {
	
	/**
	 * Metodo para obtener todos los personajes 
	 * @return Objeto con todos los personajes
	 */
	public Object getAllPersonajes();

	/**
	 * Metodo para obtener personaje por id
	 * @param id id del personaje 
	 * @return Objeto con el personaje correspondiente al id
	 */
	public Object getPersonajeById(Long id);

}
