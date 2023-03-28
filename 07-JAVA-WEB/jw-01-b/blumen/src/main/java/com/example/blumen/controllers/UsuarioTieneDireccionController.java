package com.example.blumen.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.blumen.models.UsuarioTieneDireccionModel;
import com.example.blumen.services.UsuarioTieneDireccionService;

@RestController
@RequestMapping("/id")
public class UsuarioTieneDireccionController {
    @Autowired
    UsuarioTieneDireccionService usuarioTieneDireccionService;
    
    @GetMapping(path = "/{id}")
    public Optional<UsuarioTieneDireccionModel> obtenerUsuarioPorId(@PathVariable ("id")Long id){
        return usuarioTieneDireccionService.obtenerPorId(id);
    }
}

