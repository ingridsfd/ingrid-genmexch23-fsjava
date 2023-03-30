package com.generation.ecommerce.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//Indicamos que extendemos la interface JpaRepository, y que manejamos la entidad llamda
//producto identificandola por su atributo Long id

import com.generation.ecommerce.model.Producto;

//Usare querys predefinidas del JPA repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
	//Crear mis propias querys personalizadas
	//JPQL (Java Persistence Query Language)
	@Query("SELECT p FROM Producto p WHERE p.nombre=?1")
	
	
	//Optional que pasa si no encuentra el producto
	Optional<Producto> findByNombre(String nombre);
}
