package tiposDeDatosYvariables;

import java.util.Scanner;

public class TiposDeDatosVar {

    public static void main(String[] args) {
    

        byte centigrados = 1;
        double fahrenheit = (centigrados * 1.8) + 32;
        double kelvin = centigrados + 273.15;

        System.out.println("1 centigrado a fahrenheit es" + fahrenheit);

        System.out.println("1 centigrado a kelvin es" + kelvin);

        /*
         * ºF = ºC x 1.8 + 32 formula para convertir grados centigrados a fahrenheit K =
         * ºC + 273.15
         */
        byte horasTrabajadas = 8;
        byte pago = 10; 
        int multiplicacionV = horasTrabajadas * pago;
        System.out.println(multiplicacionV);
        
        /*
        * datos primitivos
        * Los unicos que llevan letra al final son long, float y double
         
        byte: Sirve para representar un valor numerico de 8 bits (-128 al 127) 
        short:Sirve para representar un valor numerico de 16 bits (-32,768 al 32767)
        int: de tipo entero (sirve para representar un valor numerico de 32 bits (-(-2147483648 al 2147483647)
        )
        long: Sirve para representar un valor numerico ((-9223372036854775808 al 9223372036854775807)
        )y se le agrega una l al final
        float: Sirve para representar un valor numerico de 23 bits (numeros decimales)al final lleva una f
        double: Sirve para representar un valor numerico de 64 bits (numeros decimales) al final lleva una letra d
        boolean:Sirve para representar valores booleanos (0 y  1 o true or false)1 bit
        char: Sirve para representar un caracter de 16 bits, entre comillas simples.*/
        
        //conversion casting o casteo
        double num=1.61; 
        int numInt = (int) num; 
        long numLong = (long) num;

        System.out.println("double: " + num);
        System.out.println("int: " + numInt);
        System.out.println("long: " + numLong);

        //string
        //Aqui se hace el cambio de string
        String cantidad = "15";
        String precio = "115.20";

        //Aqui se hace el cambio a tipo int
        int cantEntero = Integer.parseInt(cantidad);  
        double precioDouble = Double.parseDouble(precio);

        //se imprime aquí
        System.out.println("El valor total de la compra es: " + (cantEntero * precioDouble));

        int edad = 30;
        double estatura = 1.61;
         

        String edadString = String.valueOf (edad);
        String estaturaString = String.valueOf (estatura); 
        //y ahi mismo te da todos los valores que puedes utilizar para hacer conversion 

        System.out.println("Edad: " + edadString + "Estatura: " + estaturaString);
        
        int numero1 = 5;
        int numero2 = 7;
        int numero3 =12;
        
        int suma = numero1 + numero2 + numero3; //operador +, esperamos un 24
        int resta = numero1 - numero2 - numero3; //esperamos -14
        int multiplicación = numero1 * numero2 * numero3; //operador *, esperamos 420
        int división = numero2 / numero1; //operador /, esperamos 1,4
        int modulo = numero2 % numero1; //operador %, esperamos un 2
        int incremento = ++numero3;
        int decremento= --numero2;
        
        System.out.println("La suma es: "+ suma);
        System.out.println("La resta es: "+ resta);
        System.out.println("La multiplicación es: "+ multiplicación);
        System.out.println("La división es: "+ división);
        System.out.println("La modulo es: "+ modulo);
        System.out.println("El incremento es: "+ incremento);
        System.out.println("El decremento: "+ decremento);
        
        //Ejercicio de masa corporal
        Scanner pesosc = new Scanner(System.in);
        System.out.println ("Ingresa tu peso");
        float peso = pesosc.nextFloat();
        Scanner alturasc= new Scanner(System.in);
        System.out.println ("Ingresa tu altura");
        float altura = alturasc.nextFloat();

        float IMC = peso / (altura * altura);

        System.out.println("El indice de masa corporal es: " + IMC);
        

            if (IMC < 16) {
                System.out.println("Criterio de ingreso");
            } else if (IMC >= 16 && IMC < 17) {
                System.out.println("Infrapeso");
            } else if (IMC >= 17 && IMC < 18.5) {
                System.out.println("Bajo peso");
            } else if (IMC >= 18.5 && IMC < 25) {
                System.out.println("Peso normal");
            } else if (IMC >= 25 && IMC < 30) {
                System.out.println("sobrepeso");
            } else if (IMC >= 30 && IMC < 35) {
                System.out.println("Obesidad premorbida");
            } else if (IMC >= 35 && IMC < 40) {
                System.out.println("Obesidad morbida");
            } else {
                System.out.println("Obesidad hipermorbida");
            }
            float num1 = 3;
            float num2 = 2;
            float num3 = 2;
            float num4 = 5;
            float sumaf = num1 + num2;
            float multiplicaciónf = num3 * num4;
            float divisiónf = sumaf / multiplicaciónf;

            System.out.println(sumaf);
            System.out.println(multiplicaciónf);
            System.out.println(divisiónf);
            
            }
}
