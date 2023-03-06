package testers;

import oop.clases.Persona;

public class TestPersona {
 public static void main(String[] args) {
	/*Persona p = new Persona();
	System.out.println("-->" p.nombre);
	p.setNombre("Maria");
	System.out.println(">>>" + p.getNombre());}*/
	
	Persona p0 = new Persona("Pepe");
	System.out.println("-->" + p0.getNombre());
	
	Persona p1 = new Persona("Tata", 90,1.85,85.3,"Sagitario" );
	System.out.println("-->" + p1.datosPersona());
	
 } 
}
