package com.generation.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.repositories.ProductoRepository;

@Service
//inyeccion de dependencias y operaciones crud
public class ProductoService {
	
	//Autowired, permite recibir las dependencias que necesitan en lugar de crearlas ellas mismas
	//Dependencia entre clases
	//Instanciar cliente a través del constructor
	//Getters y setters para modificar info, no solo para acceder
	
	//te creo, te conecto/cableo, te utilizo
	private final ProductoRepository productoRepository;
	
	//Cablear autowired
	@Autowired
	public ProductoService(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}
	
	//Create (Metodo para agregar un objeto del tipo producto y guardarlo en la base de datos
	public void crearProducto() {
		
	}
	
	//Read
	public List<Producto> leerProductos() {
		return productoRepository.findAll();
	}
	
	//Read (leer un producto con un id especifico)
    public Producto getProducto(Long prodId) {
        return productoRepository.findById(prodId).
                orElseThrow(()-> new IllegalStateException("El Producto "
                        + "con el id " + prodId + " no existe.") );
    }
    
    //getProducto
	
//	//Update
//	public void actualizarProducto() {
//		
//	}
//	
//	//Delete
//	public void borrarProducto() {
//		
//	}
}
