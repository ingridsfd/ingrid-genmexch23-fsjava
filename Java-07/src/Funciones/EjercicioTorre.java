package Funciones;

import java.lang.Math;

public class EjercicioTorre {
    public static void main(String[] args) {
        double adyacente = 100.0; // distancia en metros
        double anguloElevacion = 30.0; // ángulo en grados
        double alturaTorre;

        // Convertir el ángulo a radianes
        double anguloRad = Math.toRadians(anguloElevacion);

        // Calcular la altura de la torre utilizando el teorema de Pitágoras
        double hipotenusa = 2 * adyacente;
        double catetoOpuesto = Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(adyacente, 2));
        alturaTorre = catetoOpuesto;

        // Imprimir el resultado
        System.out.println("La altura de la torre es: " + alturaTorre + " metros");
        System.out.println("La base de la torre es: " + adyacente + " metros");
    }
}

/*Calcula la altura de una torre que se encuentra a 
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
* Datos del tipo double o float */