/* LIVE CODE 1 - EJERCICIO 1*/
//1. Construye una función que reciba por parámetros un string y un array de string
//2.La función debe retornar un arreglo de strings con los strings que sean de mayor longitud que el string recibido por parámetros.

//Parametro 1
let str = '';
//Parámetro 2
let myArray = ['insecto', 'bootcamp', 'mangos', 'reptil', 'mosca', 'escritorio'];
function bigWords( str, myArray ) {
    //inicializar variable resultante que por lo general se le nombra result
    const result = [];
    //Primero que recorra cada elemento del array
    for ( let i = 0; i < myArray.length; i++ ) {
        //Aquí le decimos que nos haga la comparación
        if ( myArray[ i ].length > str.length ) {
            //aquí regresamos a la cadena cuando terminó de comparar
            //con método push
            result.push( myArray[ i ] );
        }
    }
    //retornar resultado ya con push agregado
    return result;
    
}
console.log( bigWords('bocina', myArray )  );
//console.log ---> Output - ['insecto', 'bootcamp', 'escritorio']

/* LIVE CODE 1 - EJERCICIO 2*/
const array = ['insecto', 'bootcamp', 'escritorio'];
function printArray( array ) {
    // Crear etiquetas li y elementos dentro del arreglo
    let ul = document.createElement( 'ul' );
    // recorrer el array de strings
    for ( let i = 0; i < array.length; i++ ) {
        // crear un elemento li con createElement
        let li = document.createElement( "li" );
        // asignar el contenido del string al elemento li con innerText
        li.innerText = array[ i ];
        // añadir el elemento li al elemento ul con appendChild
        ul.appendChild( li );
    }
    document.body.appendChild( lista );
} 

//Output --> <li>insecto</li> <li>bootcamp</li> <li>escritorio</li> 