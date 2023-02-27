package tiposDeDatosYvariables;

public class Ejercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 1
		//Declara 3 variables de tipo entero y utiliza el operador * y %
		int num1 = 8;
		int num2 = 56;
		int multiplicacion = num1 * num2;
		
		int modulo = num1 % 2;
		System.out.println("La multiplicacion es: " + multiplicacion);
		System.out.println("El módulo de 8 es: " + modulo);

		//Ejercicio 2
		//Declara dos variables de tipo boolean y utiliza el operador ==
		
		boolean esVerdadero = true;
		boolean esFalso = false;
		if (esVerdadero == esFalso) {
			
		}
		System.out.println("La comparación booleana es: " + esVerdadero);

		//Ejercicio 3
		//Declara dos variables de tipo Double y utiliza el operador <
		
		double cambioDinero = 25.50; //25.51 //25.52 //25.55
		if (cambioDinero > 25.49) {
			cambioDinero = 26;
		}
		System.out.println("Tu cambio se redondeó a: " + cambioDinero);
		
		//fahrenheit a celcius //(32 °F − 32) × 5/9 = 0 °C
		//fahrenheit a Kelvin //(32 °F − 32) × 5/9 + 273.15 = 273.15 K
		double fahrenheit1 = 132;
		
		double conversionK = (fahrenheit1 - 32)* 5/9 + 273.15;
		
		double conversionC = (fahrenheit1 - 32)* 5/9;
		
		System.out.println("De F a K es: " + conversionK);
		System.out.println("De F a C es: " + conversionC);
		
		//programa que si hace un numero par o impar
		byte numero4 = 25;
		if (numero4 % 2 == 0) {
			System.out.println("Es numero Par");
		} else {
			System.out.println("No es número Par");
		}
	}

}
