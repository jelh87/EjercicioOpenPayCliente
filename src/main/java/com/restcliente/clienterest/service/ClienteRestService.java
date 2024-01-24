package com.restcliente.clienterest.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

/**
 * Clase Service 
 */
@Service
public class ClienteRestService {

    /**
     * restClient
     */
    private final RestClient restClient;

    /**
     * 	Access
     */
    public ClienteRestService() {
    	restClient = RestClient.builder()
    			.baseUrl("https://gateway.marvel.com:443/v1")
    			.build();
    }
    
    /**
     *  Metodo para obtener todos los personajes
     * @return Objecto con todos los personajes
     */
    public Object getAllPersonajes() {
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
    	Object respuesta = restClient.get() 
    			.uri("https://gateway.marvel.com:443/v1/public/characters/{id}?ts=1&apikey=7b42f958ad03d181fad9d0af2d094191&hash=0f4544fc97fffb4f592a7f9ad089a5ec", id)
    			.retrieve() 
    			.body(Object.class); 
    	return respuesta;
    }

}

