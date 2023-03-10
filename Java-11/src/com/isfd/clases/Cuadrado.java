package com.isfd.clases;

public class Cuadrado extends FigurasGeometricas {
private int lado1;
private int lado2;

public Cuadrado(int lado1, int lado2) {
	super("Cuadrado");
	this.lado1 = lado1;
	this.lado2 = lado2;
}

public double areas() {
	return lado1 * lado2;
}

public double getBase() {
	return lado1;
}
public void setBase(int lado1) {
	this.lado1 = lado1;
}
public double getAltura() {
	return lado2;
}
public void setAltura(int lado2) {
	this.lado2 = lado2;
}

@Override
public void pedirDatos() {
	// TODO Auto-generated method stub
	
}

}