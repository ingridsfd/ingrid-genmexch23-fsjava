division( 88, 10 );
funcionAnonima();
//Las funciones anónimas no convienen porque no permiten variables globales. Primero tiene que estar la variable y hasta lo último la llamada de la función.

//Para pensar a futuro
agregarCarritoCompra();
borrarCarrito();
agregarProducto();
pagar();

function suma( a, b ) {
    let sum1 = a + b
    console.log( sum1 );
}


/*Por que son importantes las funciones?
    - Nos permite reutilizar codigo en lugar de escribirlo varias veces. Podemos llamar nuestra funcion en distintos lugares de nuestro programa, y así lo usamos cuando lo necesitamos sin necesidad de escribirlo de nuevo.
    - Nos permite modularizar nuestro codigo, esto es, dividir nuestra aplicacion en partes mas pequeñas e independientes. Así mejoramos el entendimiento y comprensión del código.
    - Mantienen su propio espacio, y las variable que se encuentran dentro de una funcion no se pueden acceder fuera de ella (scope).
    - Por que podemos probar pequeñas partes de nuestro programa de forma aislada. (Debugging)*/

/* Cosas imporantes para crear funciones:
    - Nombre descriptivo y evoque al funcionamiento
    - Datos de entrada (parametros)
    - Procesos o instrucciones a ejecutar
    - Salida (return)

*/

/*Las palabras reservadas son: var, let, const, function, return*/

function agregarCarritoCompra() {
    //Lo que hace mi función
}

//invocar una función
agregarCarritoCompra();

//función anónima
let x = function () {
    let valor1 = 5;
    let valor2 = 7;
    let suma = valor1 + valor2;
    console.log( "Esta es una función anónima: ", suma );
}

x();

//Hoisting es llamar a una función o variable antes de llamarla.
//Scope alcance global, podemos llamar a las funciones desde cualquier parte del código.
//Variables globales. Conforme utilizamos las funciones, las mandamos a llamar.
//Variables locales. Que sólo están disponibles dentro de la función.

//funcion division
function div( par1, par2 ) {
    let result = par1 / par2;
    console.log( result );
}

/* Tipos de funciones:
- Funciones directas - nombre (comunes)
- Funciones anonimas - viven pegadas a una variable o constante
- Funciones como métodos (para específicar que hace mi objeto)
- Funciones como constructores (para construir o crear un objeto)

*/

// Funciones flecha. Sintáxis:
const suma = ( a, b ) => a + b;
console.log( suma );

//funcion flecha con más lineas de codigo
const sumarYMult = ( a, b ) => {
    const sum = a + b;
    const result = sum * 2;
    console.log( result );
}

/*
Una expresión de función flecha (anteriormente, y ahora conocida 
    incorrectamente como función de flecha gruesa) tiene una sintaxis más 
    corta en comparación con las expresiones de función normal 
Es una serie de nuevas funciones que se agregan al lenguaje de 
programación JavaScript en la sexta edición del estándar ECMAScript, ES6 
para abreviar.

Las funciones arrow tienen algunas características que las diferencian 
de otras funciones y las hacen útiles en diferentes situaciones. Algunos 
de los usos más comunes de las funciones arrow son:
Sintaxis más concisa: La sintaxis de las funciones arrow es más corta y 
sencilla que la sintaxis de las funciones normales, lo que las hace más fáciles de leer y escribir.
Alcance de las variables: Las funciones arrow comparten el mismo alcance 
de las variables que la función que las contiene, lo que significa que pueden acceder a las variables del ámbito externo sin tener que utilizar la palabra clave "var" o "let".
Uso en callbacks: Las funciones arrow son especialmente útiles cuando se 
utilizan como argumentos para otras funciones, especialmente en el contexto de callbacks. Debido a su sintaxis más concisa, las funciones arrow pueden hacer que el código sea más legible y fácil de entender en estos casos.
Sin embargo, también hay algunas limitaciones a tener en cuenta al usar 
funciones arrow. Por ejemplo, no se pueden utilizar como funciones 
constructoras, ya que no se pueden invocar con la palabra clave "new".
Además, no tienen su propio objeto "this", lo que significa que no se pueden 
usar para definir métodos de objetos.
*/

/*
Return
La sentencia return finaliza la ejecucion de la funcion, y especifica un 
valor para ser devuelto a quien llama a la funcion. O lo que es lo mismo, 
usamos return para finalizar y tambien para poder asignar el resultado a 
una variable.
Return, ponmelo en este espacio de memoria virtual porque lo voy a usar 
después.
Return se usa cuando necesitas sacar un valor de la función o simplemente utilizarlo después. 

SI NO USAMOS EL RETURN, LA FUNCION NUNCA TERMINA, Y SI QUEREMOS USAR EL RESULTADO 
PARA ALGO DESPUES, NO SE PODRA PORQUE SE ESTA ASIGNANDO A NADA.
En cuanto uso de memoria es importante señalarles el return.
*/

function areaCuadrado() {
    let lado = 5;
    let area = lado * lado;
    console.log( "El area de mi cuadrado es: " + area );
}

areaCuadrado();

let resultadoFun = areaCuadrado();

console.log( "El reusltado de mi función cuadrado es: ", resultadoFun );