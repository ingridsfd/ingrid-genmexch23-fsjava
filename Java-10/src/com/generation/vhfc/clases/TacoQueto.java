package com.generation.vhfc.clases;

public class TacoQueto {
	
	Taco tq = new Taco();
	
	/*public String preparar() {
		.toString();
	}*/
	public float vender(int numTortilla ) {
		return (float) (numTortilla * tq.getPrecio());
	}
	/*public String ponerSalsa() {
		return .toString();
	}*/
	public void subirPrecio() {
		tq.setPrecio(25.0);
		System.out.println(tq.getPrecio());
	}
}
