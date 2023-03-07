package com.generation.vhfc.clases;

public class Taco {
	//atributos
	private String tipoDeTortilla;
	private String guisado;
	private int numDeTortilla;
	private String tamanoDeTortilla;
	private double precio;
	
	//sobrecarga
	public Taco() {
		
	}
	
	//constructor
	public Taco(String tipoDeTortilla, String guisado, int numDeTortilla, String tamanoDeTortilla, double precio) {
		super();
		this.tipoDeTortilla = tipoDeTortilla;
		this.guisado = guisado;
		this.numDeTortilla = numDeTortilla;
		this.tamanoDeTortilla = tamanoDeTortilla;
		this.precio = precio;
	}
	
	//Getters y setters
	public String getTipoDeTortilla() {
		return tipoDeTortilla;
	}

	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}

	public String getGuisado() {
		return guisado;
	}

	public void setGuisado(String guisado) {
		this.guisado = guisado;
	}

	public int getNumDeTortilla() {
		return numDeTortilla;
	}

	public void setNumDeTortilla(int numDeTortilla) {
		this.numDeTortilla = numDeTortilla;
	}

	public String getTamanoDeTortilla() {
		return tamanoDeTortilla;
	}

	public void setTamanoDeTortilla(String tamanoDeTortilla) {
		this.tamanoDeTortilla = tamanoDeTortilla;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override // Source > Generate toString()
	public String toString() {
		return "Taco [tipoDeTortilla=" + tipoDeTortilla + ", guisado=" + guisado + ", numDeTortilla=" + numDeTortilla
				+ ", tamanoDeTortilla=" + tamanoDeTortilla + ", precio=" + precio + "]";
	}

	
	
	
	
}
