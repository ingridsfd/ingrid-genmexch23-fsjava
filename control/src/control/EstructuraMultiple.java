package control;

import java.util.Scanner;

public class EstructuraMultiple {
	Scanner dato = new Scanner(System.in);
	public void vocal() {
		// TODO Auto-generated method stub
		System.out.println("Introduzca letra: ");
		
		char letra = dato.next().charAt(0);
		switch (letra) {
		case 'a': case 'A':
		case 'e': case 'E':
		case 'i': case 'I':
		case 'o': case 'O':
		case 'u': case 'U':
			System.out.println("Es vocal ");
			break;

		default:
			System.out.println("El caracter no es vocal");
			break;
		}
	}
}
