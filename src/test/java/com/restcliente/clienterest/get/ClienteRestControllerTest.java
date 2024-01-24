package com.restcliente.clienterest.get;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.restcliente.clienterest.service.ClienteRestService;

/**
 * Clase test de la clase ClienteRestController
 */
class ClienteRestControllerTest {
	
	/**
	 * Instancia
	 */
	private ClienteRestService clienteRestService = new ClienteRestService();
	
	/**
	 * Instancia
	 */
	private ClienteRestController clienteRestController = new ClienteRestController(clienteRestService);
	
	/**
	 * resultadoAll
	 */
	private Object resultadoAll = new Object();
	
	/**
	 * resultadoOne
	 */
	private Object resultadoOne = new Object();
	
	/**
	 * noEsperado
	 */
	private Object noEsperado = new Object();
	
	/**
	 * id
	 */
	private Long id = 1011334L;

	/**
	 * Metodo setup ejecuciones previas a los Test
	 */
	@BeforeEach
	public void setup(){
		resultadoAll = clienteRestController.getAllPersonajes();
		resultadoOne = clienteRestController.getPersonajeById(id);
	}
	
	/**
	 * Test del metodo getAllPersonajes
	 */
	@DisplayName("JUnit test metodo getAllPersonajes")
	@Test
	void testGetAllPersonajes() {
		final Object esperado = clienteRestController.getAllPersonajes();
		Assertions.assertNotNull(esperado);
		Assertions.assertEquals(resultadoAll, esperado);
		Assertions.assertNotEquals(resultadoOne, esperado);
		Assertions.assertNotSame(noEsperado, esperado);
	}
	
	/**
	 * Test del metodo getPersonajeById
	 */
	@DisplayName("JUnit test metodo getPersonajeById")
	@Test
	void testGetPersonajeById() {
		final Object esperado = clienteRestController.getPersonajeById(id);
		Assertions.assertNotNull(esperado);
		Assertions.assertEquals(resultadoOne, esperado);
		Assertions.assertNotEquals(resultadoAll, esperado);
		Assertions.assertNotSame(noEsperado, esperado);
	}

}
