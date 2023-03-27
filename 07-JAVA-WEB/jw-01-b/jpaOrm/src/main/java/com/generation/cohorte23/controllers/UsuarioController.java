package com.generation.cohorte23.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.generation.cohorte23.models.UsuarioModel;
import com.generation.cohorte23.services.UsuarioService;

@RestController 
@RequestMapping ("/usuario")
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;
	@GetMapping()
	public ArrayList<UsuarioModel> ListarUsuarios(){
		return usuarioService.ListarUsuarios();
	}
	@PostMapping()
	public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuarioModelo) {
		return usuarioService.guardarUsuario(usuarioModelo);
	}
	@GetMapping("/query")
	public ArrayList<UsuarioModel> obtenerPorPrioridad (@RequestParam("prioridad")Integer prioridad){
		return usuarioService.busquedaPorPrioridad(prioridad);
	}
	
}