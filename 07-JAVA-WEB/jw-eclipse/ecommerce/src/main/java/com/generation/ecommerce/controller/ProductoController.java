package com.generation.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.services.ProductoService;

@RestController //que eres un controller para soportar metodos http
@RequestMapping(path="/miOtzo/productos/") //la ruta que de donde van a ir a parar los http
//indica la ruta o URL de nuestro endpoint para saber donde se manejan esas solicitudes HTTP
public class ProductoController {
	
	//Declara la instancia de la Clase ProductoService que se utiliza para acceder a los metodos definidos ahi.
	//Se declara como final porque su valor no sera cambiado despues de inicializar, para que esta instancia no cambie durante la ejecucion del programa.
	//Instancia de la clase "ProductoService" 
	//Crear objeto del producto servicio
	private final ProductoService productoServicio; //no nos llames, nosotros te llamamos
	
	//instancia comun
	//Perrito Chase = new Perrito ("Chase", "Perrito policia", 5);
	
	@Autowired
	public ProductoController (ProductoService productoServicio) {
		this.productoServicio = productoServicio;
	}
	
	//HTTP GET
	@GetMapping
	public List <Producto> getProductos() {
		return productoServicio.leerProductos();
	}
	
//	//HTTP POST
//	@PostMapping
//	public void postProducto() {
//		return productoServicio.crearProducto();
//	}
//	
//	//HTTP PUT
//	@PutMapping
//	public void putProducto() {
//		return productoServicio.actualizarProducto();
//	}
//	
//	//HTTP DELETE
//	@DeleteMapping
//	public void deleteProducto() {
//		return productoServicio.borrarProducto();
//	}
}
