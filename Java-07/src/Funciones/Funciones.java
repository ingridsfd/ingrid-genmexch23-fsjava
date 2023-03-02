package Funciones;

public class Funciones { //clase llamada Funciones
	
	//Las funciones se pueden declarar en cualquier lugar de la clase
	public static int sumar (int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	} //cierre de sumar
	
	//Funcion resta
		public static int resta (int num1, int num2) {
			int resultado = num1 - num2;
			return resultado;
		} //cierre de restar
		
	//Funcion multiplicacion
			public static int multi (int num1, int num2) {
				int resultado = num1 * num2;
				return resultado;
				} //cierre de multiplicar
			
	//Funcion multiplicacion
			public static int division (int num1, int num2) {
				int resultado = num1 / num2;
				return resultado;
				} //cierre de division
	
	//Funcion para imprimir asteriscos
	//De un lado genero la funcion
	public static void imprimirAsteriscos() {
		System.out.println("*****************");
	} //cierre imprimirAsteriscos
	
	//Funcion que combina distintos tipos de valores
	public static float sumaDecimal(float valor1, int valor2) {
		
		float resultadoDecimal = valor1 + valor2;
		return resultadoDecimal;
	} //cierre sumaDecimal
	
	//Funcion que usa Strings como argumentos
	public static String awitaDeLimon (String ingrediente1, String ingrediente2, String ingrediente3) {
		String recetaCompletada = ingrediente1 + ingrediente2 + ingrediente3;
		return recetaCompletada;
	}
	
	
	//Este metodo tiene como funcion, ejecutar cosas
	//En el main ponemos por lo general las cosas que queremos imprimir en consola
	public static void main(String[] args) {
		// Aqui invocamos a la funcion. Las invocaciones de la funcion se hacer generalmente dentro del metodo principal o main
		System.out.println("El resultado de la suma es: " + sumar(5,8));
		System.out.println("El resultado de la resta es: " + resta(5,8));
		System.out.println("El resultado de la multiplicacion es: " + multi(5,8));
		System.out.println("El resultado de la division es: " + division(8,2));
		//De este otro lado se invocan las funciones
		imprimirAsteriscos();
		System.out.println("El resultado de la suma decimal es: " + sumaDecimal(5.7f, 5));
		
		imprimirAsteriscos();
		System.out.println("Estos son los pasos para preparar aguita de limon: " + awitaDeLimon("agua", "limon", "azucar"));
		
		//Funciones de la biblioteca de matematicas (Math)
		double valorEjemplo = 7.65497834d;
			System.out.println("La raiz cuadrada de mi valor es: " + Math.sqrt(valorEjemplo));
			System.out.println("El seno de mi valor es: " + Math.sin(valorEjemplo));
			System.out.println("La potencia de mi valor es: " + Math.pow(valorEjemplo, 2));

	} //cierre metodo main

} //cierre de clase Funciones

/* Funciones 
 * - No retornan valores: No devuelven nada, no se especifica nada, y no
 * usamos la palabra return. 
 * - Si retornan valores: Se especifica el tipo de dato del argumento, el tipo de valor 
 * que regresa y se usa return para esto.
 * Que sean void o static no tiene nada que ver con lo anterior. Pueden ser ambas o no y de todas formas
 * designarle que retornen algo o no.
 * 
 * ¿Por qué se usa static? Le decimos que tal función pertenece a tal clase y no a un objeto como tal.
 * No se objetos a partir de funciones.
 * 
 * - Sintaxis de las funciones que si retornan valores
	tipoDeRetorno nombreDeLaFuncion(tipoDeDato argumento1, tipoDeDato argumento2, ...) {
		// Cuerpo de la función
	}

	- Sintaxis de las funciones que no retornan valores
	palabraReservada nombreDeLaFuncion(){
	//cuerpo de la funcion
		}
		
	Funciones de la biblioteca de Matematicas
	
		
	Argumento va a ser el tipo de dato que se va a utilizar en la función.
	
	Cosas que debemos tomar en cuenta al momento de crear nuestras funciones:
    - Deben de llevar un nombre unico
    - Opcionalmente podran recibir argumentos y devolver el resultado
    - Se debe especificar el tipo de dato que vamos a pasar como argumnto, y el resultado final de nuestra funcion
    - Cuidar el orden en como estamos agregando nuestros parametros o argumentos.
 * 
 * //Calcula la altura de una torre que se encuentra a 
 * 100 metros de una persona, que observa la punta de la 
 * torre con un angulo de elevacion de 30°
 * Funciones bloque de código
 * Método es una función pero para un objeto
 * 
 * Levantamiento de requerimientos
 * - Torre recta 90 grados
 * Usen funciones de la libreria Math
 * Tiempo es de 20 minutos
 * Impresiones en consola de todos los datos
 * Tu base es de 
 * Tu altura es de
 * Datos del tipo double o float 
 * 
 */
