package control;

import java.util.Scanner;

public class OrdenTres 
{
	public void ordenarNumeros() 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el primer valor: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        int b = sc.nextInt();
        System.out.println("Ingrese el tercer valor: ");
        int c = sc.nextInt();
        
        int menor, medio, mayor;
        
        // Encontrar el valor menor, medio y mayor usando operadores ternarios
        menor = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
        mayor = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        medio = (a != menor && a != mayor) ? a : ((b != menor && b != mayor) ? b : c);
        
        // Imprimir el resultado en orden ascendente
        System.out.println("Valores ordenados: " + menor + ", " + medio + ", " + mayor);
	}
}