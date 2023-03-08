package com.generation.vhfc.ManejoExcepciones;

import java.util.Scanner;

public class NoComprobadasExceptions {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		System.out.println("Introduzca un valor: ");
		int divisor;
		
		try {
			divisor = Integer.parseInt(dato.next());
			int division = 10/divisor;
			System.out.println("-->" + division);
		} catch (ArithmeticException e) { //especifica excepcion aritmetica
			//la e es de un objeto
			System.out.println("Capturando la exception " + e.getMessage());
		} catch(NumberFormatException nfe) {
			System.out.println("el dato es un caracter " + nfe.getMessage());
		} finally {
			System.out.println("Este block es opcional y se va a ejecutar con o sin la excepción");
		}
		//Cuando una funcion es static no tenemos que llamar al objeto
		//Clase wrapper: una clase encapsula a otra para darle más funcionalidad
		
		System.out.println("continuamos con el flujo de la aplicación");
		
	}
	
}

