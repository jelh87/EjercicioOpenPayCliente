package com.restcliente.clienterest.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.restcliente.clienterest.model.Personaje;

@Service
public class ClienteRestService {

    private final RestClient restClient;

    public ClienteRestService() {
    	restClient = RestClient.builder()
    			//.baseUrl("https://gateway.marvel.com:443/v1")
    			.baseUrl("https://gateway.marvel.com:443/v1")
    			.build();
    }
    
    public Object getAllPersonajes() {
    	return restClient.get()
    			.uri("https://gateway.marvel.com:443/v1/public/characters?ts=1&apikey=7b42f958ad03d181fad9d0af2d094191&hash=0f4544fc97fffb4f592a7f9ad089a5ec")
    			.retrieve() 
    			//.body(new ParameterizedTypeReference<List<Personaje>>() {});
    			.body(Object.class); 
    }
    
    public Personaje getPersonajeById(int id) { 
    	return restClient.get() 
    			//.uri("/posts/{id}", id)
    			.uri("https://gateway.marvel.com:443/v1/public/characters/{id}?ts=1&apikey=7b42f958ad03d181fad9d0af2d094191&hash=0f4544fc97fffb4f592a7f9ad089a5ec", id)
    			.retrieve() 
    			.body(Personaje.class); 
    }

}

