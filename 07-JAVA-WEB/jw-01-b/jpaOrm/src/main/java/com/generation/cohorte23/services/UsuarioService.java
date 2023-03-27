package com.generation.cohorte23.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.cohorte23.models.UsuarioModel;
import com.generation.cohorte23.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository; 
	
	public ArrayList<UsuarioModel> busquedaPorPrioridad (Integer prioridad){
		return usuarioRepository.findByPrioridad(prioridad);
		}
	
	public ArrayList<UsuarioModel>ListarUsuarios(){
		return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
	}

	public UsuarioModel guardarUsuario (UsuarioModel usuario) {
				return usuarioRepository.save(usuario);
	}
}