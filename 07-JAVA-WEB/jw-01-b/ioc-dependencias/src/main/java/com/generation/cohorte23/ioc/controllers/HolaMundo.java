package com.generation.cohorte23.ioc.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo {
	//le dice al tomcat, te voy a enviar lo que ejecute este metodo de abajo
	@RequestMapping("/") //que ejecute el metodo http
	public String hola() {
		return "Hola mundo desde Spring Boot";
	}
}
