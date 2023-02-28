package control;

import java.util.Scanner;

public class EstructuraIf {
	Scanner entrada = new Scanner(System.in);
	public void controlIf() {
		// TODO Auto-generated method stub
		/*
		if (condition) {
			
		}*/
		//int Integer
		//float Float
		//char //1 solo caracter
		//double 
		long nota = 4;
		if (nota > 5) {
			System.out.println("Nota aprobada " + nota);
		}
		System.out.println("Continua el control...");
		/*
		if (condition) {
			
		} else {
			
		}*/
		if (nota >= 5) {
			System.out.println("Nota aprobada " + nota);
		} else {
			System.out.println("Nota no aprobada " + nota);
		}
	}
	public void divisible() {
		// TODO Auto-generated method stub
		System.out.println("Introduzca un numero: ");
		int dato1 = entrada.nextInt();
		System.out.println("Introduzca un segundo numero: ");
		int dato2 = entrada.nextInt();
		if (dato1 % dato2 == 0) {
			System.out.println(dato1 + " es divisible " + dato2);
		} else {
			System.out.println(dato1 + " no es divisible entre " + dato2);
		}
		
		
	}
	public void compara() {
		// TODO Auto-generated method stub
			System.out.println("Introduzca un numero: ");
			int dato3 = entrada.nextInt();
			System.out.println("Introduzca un segundo numero: ");
			int dato4 = entrada.nextInt();
			if (dato3 != dato4) {
				System.out.println("Este número no es igual");
			} else {
				System.out.println("Los números son iguales");
			}
	}
	public void numMayor() {
		// TODO Auto-generated method stub
			System.out.println("Introduzca un numero: ");
			int valor1 = entrada.nextInt();
			System.out.println("Introduzca un segundo numero: ");
			int valor2 = entrada.nextInt();
			if (valor1 > valor2) {
				System.out.println("Este número es mayor");
			} else {
				System.out.println("Este número es menor");
			}
	}
	
	public void anidado() {
		// TODO Auto-generated method stub
		/*if (condition) {
			
		} else if(condition){

		} else {
			
		}*/
		
		
		
	}
	public void realNum() { //Saber si un número es real, positivo o negativo
		// TODO Auto-generated method stub
			System.out.println("Introduzca un numero: ");
			int valor4 = entrada.nextInt();
			if (valor4 > 0) {
				System.out.println("Este número es un número positivo");
			} else if( valor4 < 0 ) {
				System.out.println("Este número es un número negativo");
			} else {
				System.out.println("Este número es cero");
			}
	}
}
