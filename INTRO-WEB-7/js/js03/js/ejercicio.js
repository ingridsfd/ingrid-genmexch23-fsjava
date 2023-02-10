/*Crea un traductor para un día de la semana.
Tu programa debe leer una variable llamada "diaNumero" e 
imprimir (console.log) el día correspondiente de la semana,
 donde 0 es domingo y 6 es sábado.

Para cualesquiera otros valores, tu programa debe imprimir "Numero de día invalido".
Prueba tu programa para todos los valores de días de la semana.*/

let diaNum = parseInt( prompt( "Escoge un número del 0 al 6, plis: " ) )
//0 es domingo
//6 es sábado
//si no es del 0 al 6 regresa "número de día inválido
//prueba el pograma
if ( diaNum === 0 ) {
    document.write( "Es domingo" );
} else if ( diaNum === 1 ) {
    document.write( "Es lunes" );
} else if ( diaNum === 2 ) {
    document.write( "Es martes" );
} else if ( diaNum === 3 ) {
    document.write( "Es miércoles" );
} else if ( diaNum === 4 ) {
    document.write( "Es jueves" );
} else if ( diaNum === 5 ) {
    document.write( "Es viernes" );
} else if ( diaNum === 6 ) {
    document.write( "Es sábado" );
} else {
    document.write("Tu día de la semana no existe. Hmmm...")
}
let q = true;
let p = false;
if ( q && p ) console.log("true");

if ( q || p ) console.log( "false" );

// and &&
// or ||
// not !