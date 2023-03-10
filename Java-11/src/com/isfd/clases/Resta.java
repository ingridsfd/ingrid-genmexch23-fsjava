package com.isfd.clases;

public class Resta implements  OperacionesAritmeticas, Mensajes {
//va a implementar de Operaciones Aritmeticas
	private double a;
	private double b;
	
	
	public Resta() {
		super();
	}

	public Resta(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public void mensaje() {
		System.out.println("Hola soy una resta");
	}

	@Override
	public void mensajes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double sumar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double resta() {
		// TODO Auto-generated method stub
		return this.a - this.b;
	}
	
	
}