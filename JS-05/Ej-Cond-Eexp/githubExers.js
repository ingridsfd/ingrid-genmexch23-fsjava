/*Exercise #1
You have a list of names: var names = ["Maria", "Antony", "Joy", "Juan"]*/
let names = [ "Maria", "Antony", "Joy", "Juan" ]

/*Part 1
Write a function to insert a name to the end of the list. 
Add your own name to the end of the list.*/

names.push( "Ingrii" );
console.log( names );

/* Part 2
Write a function that takes in a name and checks if 
the list has that name. It should return back a boolean - 
true/false.*/

//console.log(names.includes("Ingrid")); //da true

function check() {
    if(names.includes( "Ingrid" )) {
        return true;
    } else {
        return false;
    }
}

console.log( check() );
//también funciona con puro console.log(names.includes("Ingrid")); // true

/*Part 3
Write a function that takes in a list of names.
This function should compare the list taken into 
the names list you currently have. The function should 
pass back an array with the names that are in both lists.*/
let list1 = [ "Hannah", "Montanna", "Kyoko" ];
let list2 = [ "Hilary", "Hannah", "Hailey" ];

function duplicados() {
    let result = [];
    //asignamos una variable para preparar el nuevo arreglo
    for ( let i = 0; i < list1.length; i++ ) {
        //iteramos para cada elemento de los arreglos
        if ( list2.includes( list1[ i ] ) ) {
            //redactamos el método includes para comparar la lista1 y la lista2
            result.push( list1[ i ] );
            //empujamos al nuevo array que creamos en result
        }
    }
    //retornamos afuera de la iteración, NO ADENTRO 
    return result;
}

console.log( duplicados() ); //['Hannah']


/* Part 4
Write a function that takes in a list of names and 
returns a list of Integers with the length of the names 
in the same order as received. Hint use the push function*/
let list4 = [ "Hannah", "Montanna", "Kyoko" ];
let list5 = [ "Hilary", "Hannah", "Hailey" ];

function intList() {
    //crear la variable par el nuevo array
    let result1 = [];
    //crear el ciclo para la iteración de cada elemento
    for (let index = 0; index < list4.length; index++) {
        // método push
        result1.push( list4[index].length );
    }
    // retorna el resultado ordenado
    return result1;
}
console.log( intList() ); //[6,8,5]
/*
Exercise #2
What do the following expressions evaluate to?*/

console.log(false || (true && false)); //false
console.log(true || (11 + 12)); //true
console.log((31 + 22) || true); //53
console.log(true && (1 + 7)); //8
console.log(false && (3 + 4)); //false
console.log((1 + 2) && true); //true
console.log((32 * 4) >= 129); //false 
console.log(false !== !true); //false
console.log(true === 4); //false
console.log(false === (847 === '847')); //true
console.log(false === (887 == '887')); //false
console.log( ( !true || ( !( 100 / 5 ) === 20 ) || ( ( 328 / 4 ) === 82 ) ) || false ); //true

/*
Exercise #3
Write a function that logs whether a number is 
between 0 and 25 (inclusive), between 26 and 100 (inclusive), 
greater than 100, or less than 0.*/
let n = -25;
function comparison() {
    if ( n > 0 && n <= 25 ) {
        return "this number is between 0 and 25"
    } else if (n > 26 && n < 100){
        return "this number is between 26 and 100"
    } else if ( n > 100 ) {
        return "bigger than 100"
    } else if ( n < 0 ) {
        return "negative number"
    }
}
console.log( comparison() );
/*numberRange(25);   // '25 is between 0 and 25'
numberRange(75);   // '75 is between 26 and 100'
numberRange(125);  // '125 is greater than 100'
numberRange(-25);  // '-25 is less than 0'*/

/*Additional Exercises
What is shown on the console when f is console.log'd?*/

//var a;
//var b = null;
//var c = undefined;
//var d = 4;
//var e = 'five';
//var f = a || b || c || d || e;
//console.log(f); //4

