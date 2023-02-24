package principal;
import java.util.Scanner;
import clases.NuevoHola;

public class EjecutarNH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		/*
		NuevoHola nh = new NuevoHola("Ingrid");
		nh.saludo();*/
		/*
		String nombre;
		System.out.println("Cuál es tu nombre: ");
		nombre = sn.next();*/
		
		System.out.println("Ingresa tu nombre plis: ");
		String nombre = teclado.next();
		
		NuevoHola nh1 = new NuevoHola();
		nh1.saludoConNombreString(nombre);
		}
}