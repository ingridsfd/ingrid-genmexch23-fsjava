package com.generation.vhfc.mains;

import java.util.*;

public class Colecciones {

	public static void main(String[] args) {
		//No se puede instanciar una interfaz
		//por eso no se usa List
		//operador diamante <>
		ArrayList <String> coleccion = new ArrayList<String>();
		//una interfaz en java es un tipo de clase abstracta
		coleccion.add("colecciones");
		coleccion.add("cohorte");
		
		/*coleccion.add(13);
		coleccion.add(15.15);
		coleccion.add('a');*/
		//parametrizacion que se va a utilizar solo una especie de objeto
		
		for (int i = 0; i < coleccion.size(); i++) {
			System.out.println(coleccion.get(i));
			
		}

	}

}
