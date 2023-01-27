let miVariable = 34;
let miArreglo = []; //declaración literal
let miArreglo01 = new Array(); //por instancia
//un arreglo: es una variable que guarda varios elementos del mismo número

let miArreglo02 = [31, 32, 33, 34]; 
console.log("dato de miArreglo en el indice 0 - " + miArreglo02[0]);
console.log("dato de miArreglo en el indice 1 - " + miArreglo02[1]);
console.log("dato de miArreglo en el indice 2 - " + miArreglo02[2]);
console.log("dato de miArreglo en el indice 3 - " + miArreglo02[3]);
console.log("el tamaño o numero de elementos del arreglo02 es: " + miArreglo02.length);

let miArreglo03 = ["Hola", "que", "tal"];
console.log(miArreglo03[0]);
console.log(miArreglo03[1]);
console.log(miArreglo03[2]);
console.log("el tamaño del arreglo03 es: " + miArreglo03.length);

let miArreglo04 = [{nombre:"Ingrid"},{apellido:"Fernandez"},{edad:"25"}];
console.log("Elemento del arreglo de tipo objeto miArreglo04 " + miArreglo04[0].nombre);
//un objeto es una variable que contiene una estructura para almacenar varios tipos de datos
//tiene un identidicador = propiedad - elemento
//y tiene su valor = sea carácter, número o booleano
console.log("Elemento del arreglo de tipo objeto miArreglo04 " + miArreglo04[1].apellido);
console.log("Elemento del arreglo de tipo objeto miArreglo04 " + miArreglo04[2].edad);
console.log("el tamaño del arreglo04 es: " + miArreglo04.length);

let nuevoArreglo00 = [3, 6, 1, 4];
console.log("Mi arreglo ordenado con sort es: " + nuevoArreglo00.sort()); //método que ordena en ascendente;
console.log("Mi arreglo ordenado con pop es: " + nuevoArreglo00.pop()); //método que entrega el valor más alto; quita el último elemento de un array y te lo da
console.log("Mi arreglo ordenado con push es: " + nuevoArreglo00.push(10)); //vuelve a agregar el elemento quitado
console.log("Mi arreglo ordenado con sort es: " + nuevoArreglo00.reverse()); //aquíya se quita el 6, y ordena al revés

