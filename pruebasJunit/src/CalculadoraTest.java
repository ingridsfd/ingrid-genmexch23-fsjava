import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import pruebasJunit.isfd.app.Calculadora;

class CalculadoraTest {
private Calculadora ct;
private Calculadora ct1 = null;

	@BeforeEach 
	public void configurandoBefore() {
		// TODO Auto-generated method stub
		ct = new Calculadora();
		System.out.println("Ejecutando Before --> configurandoBefore()");

	}
	
	@AfterEach
	public void configurandoAfter() {
		ct = null;
		// TODO Auto-generated method stub
		System.out.println("Ejecutando AfterEach()--->configurandoAfter()");
		System.out.println("------*****");
	}
	
	@Test
	public void calculadoraNull() {
		//si assert null si existe un caso de prueba, regresa valores booleanos
		assertNull(ct1, "La clase es una instancia no nula");
		System.out.println("ejecutando primer test ---> calculadora ");
	}
	
	@Test
	public void calculadoraNotNull() {
		//si assert null si existe un caso de prueba, regresa valores booleanos
		assertNotNull(ct, "La clase esta instanciada");
		System.out.println("ejecutando segundo test ---> calculadora");
	}
	
	/*****primeras pruebas*****/
	
	@Test
	public void primerosAsert() {
		/*
		 * 1. Indicar que se va a evaluar
		 * 2. Indicar lo que se va a realizar
		 * 3. 
		 */
		int resultadoEsperado = 10;
		int resultadoActual;
		resultadoActual = ct.sumar(6, 4);
		assertEquals(resultadoEsperado, resultadoActual);
		System.out.println("Ejecutando tercer test ---> primeroAssert()");
	}
	
		@Test
		public void sumaTEst() {
			// TODO Auto-generated method stub
			Calculadora calculadora = new Calculadora();
			assertEquals(20, calculadora.sumar(10, 10));
			System.out.println("Ejecutando cuarto test ---> primerosAssert()");
	}
		/***** TIPOS TEST *****/
		@Test
		public void tiposAsserts() {
			// TODO Auto-generated method stub
			assertTrue(1 == 1);
			assertEquals("Generation", "Generation");
			assertNull(ct1);
			Calculadora c1 = new Calculadora();
			Calculadora c2 = new Calculadora();
			Calculadora c3 = new Calculadora();
			assertSame(c1, c3);
			assertNotSame(c2, c3);
			assertEquals(1,1.2,.5);
		}
		@Test
		public void validandoSuma() {
			// TODO Auto-generated method stub
			assertEquals(11, ct.sumar(5, 6));
		}
		@Test
		public void validandoResta() {
			assertEquals(50,ct.restar(56, 0));
		}
		@Test
		public void validandoRestaNegativa() {
			assertEquals(-10, ct.restar(1, 20));
		}
		@Test
		public void validandoDivision() {
			assertEquals(2, ct.division(10, 5));
		}
		
		@Disabled("En espera")
		@Test
		public void validandoByZero() {
			assertThrows(ArithmeticException.class, () -> ct.divisionByZero(10,1), "No se puede dividir por cero");
		}
		
		
		

}
