package com.generation.vhfc.clases;

public class ClaseGenerica <T>{
	//Esta es la clase generica
	T obj;

	public ClaseGenerica(T obj) {
		this.obj = obj;
	}
	public void claseTipo() {
		System.out.println("El tipo T es: " + obj.getClass().getName());
	}
	
}
