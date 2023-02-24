package clases;

import java.util.Scanner;

public class NuevoHola {
	//Scanner sn = new Scanner(System.in);
	//diferencia entre miembro de datos, tiene modificador de acceso
	//private String nombre;
	//Esto es un objeto porque se declara de un tipo de una clase
	//y tambien es variable porque recibe tipos de datos
	//para iniciarlizar la variable ( objeto de tipo String)
	//usamos el método constructor()
	
	//el constructor en Java se nombre igual que la clase
	/*
	public NuevoHola(String nombre) {
		this.nombre = nombre;
	}*/
	/*
	public void saludo() {
		System.out.println("Hola desde java con sts de nuez " + this.nombre);
	}*/
	
	public void saludoConNombreString(String nombre) {
		//para preguntar por nombre
		System.out.println("Hola amigo " + nombre);
		//para recibir
	}
}