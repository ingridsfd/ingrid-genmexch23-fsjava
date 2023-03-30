package com.example.blumen.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.blumen.models.UsuarioTieneDireccionModel;

@Repository
public interface UsuarioTieneDireccionRepo extends CrudRepository<UsuarioTieneDireccionModel, Long>{
	//no hay metodo
}
