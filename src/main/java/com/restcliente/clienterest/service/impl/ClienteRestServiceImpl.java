package com.restcliente.clienterest.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.restcliente.clienterest.service.ClienteRestService;

/**
 * Clase Service 
 */
@Service
public class ClienteRestServiceImpl implements ClienteRestService {
	
	/**
	 * Componente del logger
	 */
	private static final Logger LOG = LoggerFactory.getLogger(ClienteRestServiceImpl.class);

    /**
     * Cliente Rest
     */
    private final RestClient restClient;

    /**
     * 	Constructor
     */
    public ClienteRestServiceImpl() {
    	restClient = RestClient.builder()
    			.baseUrl("https://gateway.marvel.com:443/v1")
    			.build();
    }
    
    /**
     *  Metodo para obtener todos los personajes
     * @return Objecto con todos los personajes
     */
    public Object getAllPersonajes() {
    	LOG.info("Ingresa al metodo getAllPersonajes de la clase ClienteRestService");
    	Object respuesta = restClient.get()
    			.uri("https://gateway.marvel.com:443/v1/public/characters?ts=1&apikey=7b42f958ad03d181fad9d0af2d094191&hash=0f4544fc97fffb4f592a7f9ad089a5ec")
    			.retrieve() 
    			.body(Object.class); 
    	return respuesta;
    }
    
    /**
     * Metodo para obtener personaje por id
     * @param id id del personaje
     * @return Objecto con el personaje por id
     */
    public Object getPersonajeById(Long id) { 
    	LOG.info("Ingresa al metodo getPersonajeById de la clase ClienteRestService");
    	Object respuesta = restClient.get() 
    			.uri("https://gateway.marvel.com:443/v1/public/characters/{id}?ts=1&apikey=7b42f958ad03d181fad9d0af2d094191&hash=0f4544fc97fffb4f592a7f9ad089a5ec", id)
    			.retrieve() 
    			.body(Object.class); 
    	return respuesta;
    }

}

