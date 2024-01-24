package com.restcliente.clienterest.get;

import org.springframework.web.bind.annotation.*;
import com.restcliente.clienterest.service.ClienteRestService;

/**
 * Clase orquestadora entre API Rest y cliente API Marvel
 */
@RestController
@RequestMapping("/public/marvel")
public class ClienteRestController {

    /**
     * Dependencia
     */
    private final ClienteRestService clienteRestService;

    /**
     * Dependencia
     * @param clienteRestService service
     */
    public ClienteRestController(ClienteRestService clienteRestService) {
        this.clienteRestService = clienteRestService;
    }
    
    /**
     * Metodo para obtener todos los personajes
     * @return Object con todos los personajes
     */
    @GetMapping("")
    public Object getAllPersonajes() {
        return clienteRestService.getAllPersonajes();
    }

    /**
     * Metodo para obtener personaje por id 
     * @param id
     * @return Object con el personaje correspondiente al id
     */
    @GetMapping("/{id}") 
    public Object getPersonajeById(@PathVariable Long id) { 
    	return clienteRestService.getPersonajeById(id); 
    }
	 

}
