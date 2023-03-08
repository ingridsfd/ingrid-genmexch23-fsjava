package com.generation.vhfc.ManejoExcepciones;

public class Division {
	private int numerador; //Miembro de datos con 'private'
	private int denominador; //Miembro de datos


	public Division(int numerador, int denominador) throws OpExceptions{
		if (denominador == 0) { //'throws' donde se ubica la clase mas grande
			throw new OpExceptions("El denominador es un cero:");
		}
		this.numerador = numerador;
		this.denominador = denominador;
	}


	public Division(String msj) {
		// TODO Auto-generated constructor stub
	}


	public void visualizarD() {
		System.out.println("La division es: " + (this.numerador/this.denominador)); 
		
	}
	
}
