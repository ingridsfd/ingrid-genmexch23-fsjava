/* Exercise w3schools.com
Create a loop that runs as long as i is less than 10.*/

let i = 0;
while (i < 10) {
console.log(i);
i++
}

/* Exercise #1
Part 1
There are three people waiting for the bank. Their names, in order, are Sofia, David, and Juan. 
Create an array that has these three names in order.*/
//let nombre = ["sofia","david", "juan"];
let nombre = [ "david", "juan", "sara", "juan" ];

/*Part 2
Two more people get added to the back of the line - Sara and Augustin. 
The first person in line is called to the teller. What does the queue look like?*/
let nombres2 = [ "david", "juan", "sara", "agustin" ];


/*Part 3
It turns out David was saving a spot for his friend Renata. She shows up and goes behind him in the line. 
One more person (Elena) shows up and goes to the end of the line. What does the queue look like?*/
let nombres3 = [ "david", "renata", "juan", "sara", "agustin", "elena" ];

/* Exercise 2 
Write a JavaScript program to construct the following pattern, using a nested for loop.
*  
* *  
* * *  
* * * *  
* * * * * */

function anidado(){
    for (let i = 1; i <= 5; i++) { //bucle exterior itera 5 veces, empezando desde 1
    let asterisco = ''; //cadena vacía para almacenar cada fila de asteriscos
    for (let j = 1; j <= i; j++) { //el bucle interior itera 'i' veces, empezando desde 1
      asterisco += '* '; //agrega un asterisco seguido de un espacio a la cadena de la fila
    }
    // imprime la cadena de la fila en una nueva línea
  }
}
console.log(anidado()); 

/* Exercise #3
Write while loops to do the following:

– Repeatedly print the value of the variable xValue, decreasing it by 0.5 each time,
as long as xValue remains positive.*/
let x = 10;
while ( x > 0 ) {
    console.log( x );
    x = 0.5;
}

/*- Print all the odd numbers between 1 - 100.*/
let y = 1;
while (y <= 100) {
    console.log( y );
    y += 2;
}

/*- Write a method with a while loop to print 1 through n in square brackets. 
For example, if n = 6 print [1] [2] [3] [4] [5] [6]*/
let n = 0;
while ( n <= 6 ) {
    console.log("[" + n + "]" );
}

/*- Write a method with a while loop that computes the sum of first n positive integers: 
sum = 1 + 2 + 3 + … + n
Examples:
n = 5 sum = 15
n = 19 sum = 190*/

/*
let num = 10;
let suma = 0;
while (num > 0)
{
    suma += num;
    num--;
}
console.log("n = 10" + " sum = " + suma);*/

/* function sumaDeLosPrimeros5EnterosPositivos() {
    let suma = 0; // Declarar la variable suma y establecer su valor inicial en 0
    let i = 1;  // Declarar la variable i y establecer su valor inicial en 1
    while (i <= 19) {
    suma += i; // Agregar el valor actual de i a la variable suma
    i++;
    }
    return suma; // Devolver el valor de suma al final del bucle
}

  console.log(sumaDeLosPrimeros5EnterosPositivos()); // Imprimir el resultado*/ 