package oop.clases;

public class Persona {
	public String nombre = "Juan";
	private int edad;
	private double altura;
	private double peso;
	private String zodiaco;
	//Se pone publico para poder llamarla desde cualquier
	//parte del proyecto
	//Object es la clase padre de todas
	
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public String datosPersona() {
		return this.nombre + " " + this.edad + " " 
	+ this.altura + " " + this.peso + " " + this.zodiaco;
	}

	public Persona(String nombre, int edad, double altura, double peso, String zodiaco) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.zodiaco = zodiaco;
	}

public String getNombre() {
	return nombre;
}
public void  setNombre(String nombre) {
	this.nombre = nombre;
}

public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public double getAltura() { //para reasignar
	return altura;
}
public void setAltura(Double altura) { //para imprimir
	this.altura = altura;
}
public double getPeso() {
	return peso;
}
public void setPeso(Double peso) {
	this.peso = peso;
}
public String getZodiac() {
	return zodiaco;
}
public void setZodiaco(String zodiaco) {
	this.zodiaco = zodiaco;
}
}