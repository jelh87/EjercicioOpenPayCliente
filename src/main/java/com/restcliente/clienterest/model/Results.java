package com.restcliente.clienterest.model;

public record Results(Integer id, String name, String description, 
		Thumbnail thumbnail, Comics comics, Series series, 
		Stories stories, Events events) {

}
