package com.example.blumen.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.blumen.models.UsuarioTieneDireccionModel;
import com.example.blumen.repositories.UsuarioTieneDireccionRepo;

//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;

@Service
public class UsuarioTieneDireccionService {

    @Autowired
    UsuarioTieneDireccionRepo usuarioTieneDireccionRepo;
    
    public boolean eliminarUsuario(Long id) {
    	try {
    		usuarioTieneDireccionRepo.deleteById(id);
        	return true; 
		} catch (Exception e) {
			return false;
		}
    }
    
    public UsuarioTieneDireccionModel guardarUsuario(UsuarioTieneDireccionModel usuario) {
        return usuarioTieneDireccionRepo.save(usuario);
    }
     
     public Optional<UsuarioTieneDireccionModel> obtenerPorId (Long id){
         return usuarioTieneDireccionRepo.findById(id);
     }
}