package com.restcliente.clienterest.get;

import org.springframework.web.bind.annotation.*;

import com.restcliente.clienterest.model.Personaje;
import com.restcliente.clienterest.service.ClienteRestService;

@RestController
@RequestMapping("/public/marvel")
public class ClienteRestController {

    private final ClienteRestService postService;

    public ClienteRestController(ClienteRestService postService) {
        this.postService = postService;
    }
    
    @GetMapping("")
    public Object getAllPersonajes() {
        return postService.getAllPersonajes();
    }

    @GetMapping("/{id}") 
    public Personaje getPersonajeById(@PathVariable Integer id) { 
    	return postService.getPersonajeById(id); 
    }
	 

}
