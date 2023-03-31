package com.generation.ecommerce.services;

import java.util.List;
import java.util.Optional;

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
	//Si el producto existe no debería actualizar la base de datos porque sería un objeto duplicado
	public void crearProducto(Producto prod) {
		//objeto del tipo producto, dos caminos: si lo encuentro, si no lo encuentro
		Optional <Producto> productoBuscado = 
				productoRepository.findByNombre(prod.getNombre());
		//isPresent
	        if (productoBuscado.isPresent()) {
	            throw new IllegalStateException("El producto con el nombre "
	                    + "[" + prod.getNombre() + "] ya existe.");
	        } else {
	            productoRepository.save(prod);
	        }//else //if 
	}//addProducto
	
	//Read
	public List<Producto> leerProductos() {
		return productoRepository.findAll();
	}
	
	//Read (leer un producto con un id especifico)
    public Producto leerProducto(Long prodId) {
        return productoRepository.findById(prodId).orElseThrow(()-> new IllegalStateException("El Producto " + "con el id " + prodId + " no existe.") );
    }//getProducto
    
	//Update
	public void actualizarProducto(Long prodId, String nombre, String descripcion, String URL_Imagen, Double precio) {
		//si el producto existe
		if (productoRepository.existsById(prodId)) {
			//entonces, lo modifico
			Producto productoABuscar = productoRepository.getById(prodId);
		//ya que verifico que mi producto existe, lo traigo y lo asigno a una variable llamada productoABuscar
			if (nombre!=null) productoABuscar.setNombre(nombre);
			if (descripcion!=null) productoABuscar.setDescripcion(descripcion);
			if (precio!=0) productoABuscar.setPrecio(precio);
			if (URL_Imagen!=null) productoABuscar.setURL_Imagen(URL_Imagen);
			//cuando termino de editar el objeto...
			productoRepository.save(productoABuscar);
		} else {
			System.out.println("El producto con el id " + prodId + " no existe");
		}
	}
	
	//Delete
	public void borrarProducto(Long prodId) {
		if (productoRepository.existsById(prodId)) {
			productoRepository.deleteById(prodId);
		}
	}
}
