package com.isfd.Testers;

import com.isfd.clases.OperacionesAritmeticas;
import com.isfd.clases.Resta;
import com.isfd.clases.Suma;
import com.isfd.clases.Mensajes;

public class TestOperacionesAritmeticas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suma s = new Suma (5,2);
		OperacionesAritmeticas ss = new Suma(10,3);
		Mensajes sss  = new Suma();
		Mensajes sr = new Resta(10,4);
		
		System.out.println("Suma es: " + s.sumar());
		System.out.println("Operaciones Aritmeticas: " + ss.sumar());
		s.mensaje();
		sss.mensajes();
		sr.mensajes();

	}

}
