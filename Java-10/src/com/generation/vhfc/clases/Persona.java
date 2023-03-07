package com.generation.vhfc.clases;

public class Persona {
	//atributos
	private String nombre;
	private int edad;
	private int nss;
	
	//constructor vacio
	public Persona() {
		
	}
	//constructor 
	public Persona(String nombre, int edad, int nss) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nss = nss;
	}
	//constructor sobre cargado
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNss() {
		return nss;
	}

	public void setNss(int nss) {
		this.nss = nss;
	}
	
	
}
