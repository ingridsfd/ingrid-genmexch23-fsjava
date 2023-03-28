package com.example.blumen.repositories;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.example.blumen.models.UsuarioTieneDireccionModel;

@Repository
public class UsuarioTieneDireccionRepo {
	public interface UsuarioTieneDireccionRepo extends CrudRepository <UsuarioTieneDireccionModel, Long> {
		public ArrayList<UsuarioTieneDireccionModel> findById (Long id);
	}
}
