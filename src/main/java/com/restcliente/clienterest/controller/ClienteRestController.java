package com.restcliente.clienterest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.restcliente.clienterest.service.ClienteRestService;

/**
 * Clase orquestadora entre API Rest y cliente API Marvel
 */
@RestController
@RequestMapping("/public/marvel")
public class ClienteRestController {
	
	/**
	 * Componente del logger
	 */
	private static final Logger LOG = LoggerFactory.getLogger(ClienteRestController.class);
	
	/**
	 * Inyeccion de dependencia clienteRestService
	 */
	@Autowired
	private ClienteRestService clienteRestService;
    
    /**
     * Metodo para obtener todos los personajes
     * @return Object con todos los personajes
     */
    @GetMapping("")
    public Object getAllPersonajes() {
    	LOG.info("Ingresa al metodo getAllPersonajes de la clase ClienteRestController");
        return clienteRestService.getAllPersonajes();
    }

    /**
     * Metodo para obtener personaje por id 
     * @param id
     * @return Object con el personaje correspondiente al id
     */
    @GetMapping("/{id}") 
    public Object getPersonajeById(@PathVariable Long id) { 
    	LOG.info("Ingresa al metodo getPersonajeById de la clase ClienteRestController");
    	return clienteRestService.getPersonajeById(id); 
    }
	 

}
