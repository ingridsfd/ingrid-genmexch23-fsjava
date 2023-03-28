package com.example.blumen.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.blumen.models.UsuarioTieneDireccionModel;
import com.example.blumen.repositories.UsuarioTieneDireccionRepo;
import com.generation.cohorte23.jpa.models.UsuarioModel;

@Service
public class UsuarioTieneDireccionService {
	@Autowired
	UsuarioTieneDireccionRepo usuarioTieneDireccionRepo;
	
	public boolean eliminarUsuarioTieneDireccion(Long id) {
    	try {
    		usuarioTieneDireccionRepo.deleteById(id);
        	return true; 
		} catch (Exception e) {
			return false;
		}
	}
	
	public ArrayList<UsuarioTieneDireccionModel> listarUsuarios() {
        return (ArrayList<UsuarioTieneDireccionModel>) usuarioTieneDireccionRepo.findAll();
    }
	
	public Optional<UsuarioTieneDireccionModel> obtenerPorId (Long id){
        return .findById(id);
    }
	
}
