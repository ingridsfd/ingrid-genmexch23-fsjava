package com.generation.vhfc.mains;

import com.generation.vhfc.clases.Taco;
import com.generation.vhfc.clases.TacoQueto;

public class TestTaco {
	public static void main(String[] args) {
		//creamos el objeto1
		Taco tq = new Taco("maiz", "carne", 5, "mediana", 15);
		//objeto2
		TacoQueto tn = new TacoQueto();
		
		
		tq.setGuisado("pollo");
		System.out.println("Tu taco es de " + tq.getGuisado());
		
		tq.setPrecio(15.0);
		System.out.println("El taco te sale en: " + tq.getPrecio() + " pesos");
		
		tn.subirPrecio();
		
		//objeto3
		//TacoQueto tw = new TacoQueto();
		tn.vender(3);
		System.out.println("Son " + tn.vender(3) + " pesos de 3 tacos ");
		
		//El método toString aquí
		System.out.println(tq.toString());
		
	}
}
