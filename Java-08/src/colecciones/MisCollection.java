package colecciones;

import java.util.*;

public class MisCollection {

	public static void main(String[] args) {
		wrapperClass();
	}
	
	public void listasCollections() {
		//no se puede crear una instancia de una interfaz
		//solo se puede declarar un objeto
		//la clase abstracta puede ser extendida solo una vez y es padre-hija, siempre
		List miLista = new ArrayList();
		
	}
	private void imprimir(Collection collection) {
		for (Object elementos : collection) {
			
		}
		
	}
	
	static void wrapperClass() { //static genera el objeto
		//byte, short, char, long, float, int, double
		byte numeroB = 12;
		System.out.println("Tamaño de un byte " + Byte.SIZE);
		System.out.println("Valor Max " + Byte.MAX_VALUE);
		System.out.println("Valor Min " + Byte.MIN_VALUE);
		System.out.println("---> " + numeroB);
		
		int numeroI = -2147483648;
		System.out.println("Tamaño de un byte: " + Integer.BYTES);
		System.out.println("Tamaño de un entero " + Integer.SIZE);
		System.out.println("Valor Max " + Integer.MAX_VALUE);
		System.out.println("Valor Min " + Integer.MIN_VALUE);
		System.out.println("---> " + numeroI);
		
		//Wrapper es una clase que potencializan a otras clases
		//U otras estructuras de datos primitivas, como arreglos
		
		short numeroA = 16;
		System.out.println("Tamaño de un byte: " + Short.BYTES);
		System.out.println("Tamaño de un short " + Short.SIZE);
		System.out.println("Valor Max " + Short.MAX_VALUE);
		System.out.println("Valor Min " + Short.MIN_VALUE);
		System.out.println("---> " + numeroA);
		
		long numeroC = 64;
		System.out.println("Tamaño de un byte: " + Long.BYTES);
		System.out.println("Tamaño de un long " + Long.SIZE);
		System.out.println("Valor Max " + Long.MAX_VALUE);
		System.out.println("Valor Min " + Long.MIN_VALUE);
		System.out.println("---> " + numeroC);
		
		float numeroD = 15;
		System.out.println("Tamaño de un byte: " + Float.BYTES);
		System.out.println("Tamaño de un float " + Float.SIZE);
		System.out.println("Valor Max " + Float.MAX_VALUE);
		System.out.println("Valor Min " + Float.MIN_VALUE);
		System.out.println("---> " + numeroD);
	}

}
