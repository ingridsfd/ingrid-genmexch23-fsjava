package colecciones;

import java.util.*;

public class MisCollection {

	public static void main(String[] args) {
		MisCollection c = new MisCollection();
		//imprimir(c.listasCollections());
		//imprimir(c.setCollections());
		//imprimir(c.removeExample());
		mapCollections(); //El c no se utilia porque map no es una
		//coleccion como tal
		
		Object a[] = c.setCollections().toArray();
		for (int i = 0; i < a.length; i++) {
			System.out.println("Este es un set en arreglo " + a[i]);
		} 
		
		//wrapperClass();
	}
	
	private static void mapCollections() { //hay que ponerle static void para que interprete como colleccion
		Map miMap = new HashMap();
		miMap.put("valor1", "Juan");
		miMap.put("valor2", "Maria");
		miMap.put("valor3", "Arturo");
		miMap.put("valor4", "Karla");
		//miMap.clear();
		miMap.remove("valor3");
		imprimir(miMap.keySet());
		imprimir(miMap.values());
		
		//Si Map no es una coleccion, es una abstraccion de todas formas
		//Tiene que ser enviado como un estatico, no como un objeto por lo mismo
		//de que no es de tipo collection
		
		
		//También es un conjunto
		//Map no está ligada a collection, más sin embargo, puede implementar colecciones
		//Es una abstraccion de colecciones
		//Set es un conjunto, Map son dos conjuntos uno clave y otro para su coleccion
		//La cosa esque HashMap es abstraccion
	}
	
	//Caracteristicas del set
	//No permiten tener elementos duplicados
	//No tiene orden, pone el orden en desorden
	Set setCollections() {
	Set miSet = new HashSet();
	miSet.add("uno");
	miSet.add("dos");
	miSet.add("tres");
	miSet.add("cuatro");
	miSet.add("cinco");
	
	miSet.remove("uno"); //Hay que espeficicar el string para remover en el arreglo
	System.out.println("tamaño de la lista " + miSet.size());
	//miSet.clear(); //Elimina toda la lista
	boolean e = miSet.isEmpty(); //revisar documentacion porque si está vacío retorna automaticamente falso //como está en contrario, entonces, es verdadero
	System.out.println("-->" + e); 
	
	/*Object a[] = miSet.toArray();
	for (int i = 0; i < a.length; i++) {
		System.out.println("Este es un set en arreglo " + a[i]);
	}*/
	
	return miSet;
	}
	
	
	
	private List listasCollections() {
		//no se puede crear una instancia de una interfaz
		//solo se puede declarar un objeto
		//la clase abstracta puede ser extendida solo una vez y es padre-hija, siempre
		List miLista = new ArrayList(); //La lista que construye al objeto, se le conoce como referencia
		System.out.println(miLista + "Tamaño de la lista antes " + miLista.size());
		System.out.println("Está vacía " + miLista.isEmpty());
		//Es un constructor
		//Esta es la lista
		//Tiene orden y acepta diversos tipos de dato, es mutable
		miLista.add("1");
		miLista.add(0,2);
		miLista.add(3);
		//si le indicamos el índice, agrega "Pato" al indice 0
		miLista.add(0, "Pato"); // método agregar
		
		miLista.set(0, miLista); //método sustituir, replace
		miLista.remove(2); //método remover, para arriba
		
		
		System.out.println(miLista + "Tamaño de la lista despues " + miLista.size());
		System.out.println("Está vacía " + miLista.isEmpty());
		//Una interfaz es una clase, clase que es abstracta
		//Una clase abstracta va de padre a hijo
		//solo hay métodos declarados, pero le decimos cuáles son
		//crear método del tipo de retorno, de tipo Lista
		boolean e = miLista.contains(3); //es por elemento, no por índice
		System.out.println("-->" + e);
		
		miLista.remove(0);
		System.out.println(miLista.remove(0));
		
		return miLista;
		
	}
	
	//Ejemplos personales
	private List removeExample() {
	    
	        List numeros = new ArrayList();
	        numeros.add(1);
	        numeros.add(2);
	        numeros.add(3);
	        numeros.add(4);
	        numeros.add(5);
	        
	        System.out.println("Antes de remover el elemento: " + numeros);
	        numeros.remove(2); // Remover el elemento por índice
	        
	        System.out.println("Después de remover el elemento: " + numeros);
	        
	        return numeros;
	    
	}
	
	private static void imprimir(Collection collection) {
		for (Object elementos : collection) {
			System.out.println("elementos " + elementos);
		}
		//el void sí retorna, no usa la función 'return'
		
	}
	 /*
	static void wrapperClass() { //static genera el objeto
		//byte, short, char, long, float, int, double
		byte numeroB = 12;
		System.out.println("Tamaño de un byte " + Byte.SIZE);
		System.out.println("Valor Max " + Byte.MAX_VALUE);
		System.out.println("Valor Min " + Byte.MIN_VALUE);
		System.out.println("---> " + numeroB);
		
		int numeroI = -2147483648;
		System.out.println("Tamaño de un byte: " + Integer.BYTES);
		System.out.println("Tamaño de un entero " + Integer.SIZE);
		System.out.println("Valor Max " + Integer.MAX_VALUE);
		System.out.println("Valor Min " + Integer.MIN_VALUE);
		System.out.println("---> " + numeroI);
		
		//Wrapper es una clase que potencializan a otras clases
		//U otras estructuras de datos primitivas, como arreglos
		
		short numeroA = 16;
		System.out.println("Tamaño de un byte: " + Short.BYTES);
		System.out.println("Tamaño de un short " + Short.SIZE);
		System.out.println("Valor Max " + Short.MAX_VALUE);
		System.out.println("Valor Min " + Short.MIN_VALUE);
		System.out.println("---> " + numeroA);
		
		long numeroC = 64;
		System.out.println("Tamaño de un byte: " + Long.BYTES);
		System.out.println("Tamaño de un long " + Long.SIZE);
		System.out.println("Valor Max " + Long.MAX_VALUE);
		System.out.println("Valor Min " + Long.MIN_VALUE);
		System.out.println("---> " + numeroC);
		
		float numeroD = 15;
		System.out.println("Tamaño de un byte: " + Float.BYTES);
		System.out.println("Tamaño de un float " + Float.SIZE);
		System.out.println("Valor Max " + Float.MAX_VALUE);
		System.out.println("Valor Min " + Float.MIN_VALUE);
		System.out.println("---> " + numeroD);
	}*/

}
