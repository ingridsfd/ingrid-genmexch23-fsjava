package oop.clases;

public class Fecha extends Object{ //extends hereda
	private int dia;
	private int mes;
	private int anio;
	
	public Fecha() {
		
	}
	
	public Fecha(int dia, int mes, int año, int anio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	public String diaMesAnio() {
		return "La fecha es: --> " + this.dia + " " + this.mes + " " + this.anio;
	}
	
	//Object una forma de expresar propiedades y caracteristicas
	//Clase padre que tiene métodos que se pueden reutilizar
	
	//Sobreescribir, override. Herencia vertical.
	public String toString() { //Que solo declara métodos, no los implementa
		return "La fecha es: --> dia=[" + dia + "] mes=[" + mes + "] anio=[" + anio + "]";
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
}
