package com.generation.cohorte23.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.generation.cohorte23.models.UsuarioModel;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
	public ArrayList<UsuarioModel> findByPrioridad (Integer prioridad);
} 
