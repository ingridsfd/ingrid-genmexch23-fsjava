//Métodos arrays como objetos javascript:
let lista = [ 12, 5, 80, 34, 7 ];

lista.sort(
    function ( valor1, valor2 ) {
        return valor1 > valor2;
    }
);
console.log( lista );
//va a tomar el valor que se está comparando 
//return nos da una función para guardarlo y entregarlo después

lista.sort();//ordena alfabeticamente, cronologicamente sin importar que tan acompañado estén los dígitos
console.log( lista );


lista.reverse(); //pone el orden del array alrevés
console.log(lista)


lista.splice( 2, 0, 100, 200, 300 ); //splice con inserción
console.log( lista );

let remover = lista.splice( 1, 2 ); //Muestra tal cual, la posición del array que le indicas
console.log( remover );
console.log( lista );


lista.shift();//removió el primero de la lista
console.log( lista );

lista.pop(); //quitó el último de la lista 
console.log( lista );


lista.push( 100, 89, 90 ); //sí puede agregar 1 o más elementos. Modifica el arreglo original
console.log( lista );

let masE = lista.concat( 100, 200, 300 ); //me ayuda agregar más de un elemento al final de la lista, manda un arreglo nuevo
console.log( masE );


lista.push( 100 );
console.log( lista ); //el push siempre agrega un elemento al final de la lista

let msj = lista.join( "-" );
console.log( msj );



let listaNueva = lista.slice( 1, 3 );
console.log( listaNueva ); //muestra "hasta el 3, pero no muestra el 3"
/*Explicacion for*/
//console.log(lista.length);
for ( let i = 0; i < lista.length; i++ ) {
    console.log( "--> " + lista[ i ] );
}
console.log( lista );