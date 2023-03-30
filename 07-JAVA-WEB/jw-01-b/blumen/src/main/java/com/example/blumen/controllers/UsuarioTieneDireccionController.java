package com.example.blumen.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.blumen.models.UsuarioTieneDireccionModel;
import com.example.blumen.services.UsuarioTieneDireccionService;

@RestController
@RequestMapping("/id")
public class UsuarioTieneDireccionController {
    @Autowired
    UsuarioTieneDireccionService usuarioTieneDireccionService;
    
    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
    	boolean ok = usuarioTieneDireccionService.eliminarUsuario(id);
    	if (ok) {
			return "Se elimino el usuario";
		} else {
			return "No se elimino el usuario";
		}
    }
    
    @PostMapping()
    public UsuarioTieneDireccionModel guardarUsuario(@RequestBody UsuarioTieneDireccionModel usuariotienedireccionmodelo) {
        return usuarioTieneDireccionService.guardarUsuario(usuariotienedireccionmodelo);
    }
    
    @GetMapping(path = "/{id}")
    public Optional<UsuarioTieneDireccionModel> obtenerUsuarioPorId(@PathVariable ("id")Long id){
        return usuarioTieneDireccionService.obtenerPorId(id);
    }
}

