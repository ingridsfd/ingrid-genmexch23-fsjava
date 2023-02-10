// if ( condition ) {
//     // bloque de código
// }

let edad = parseInt( prompt( "Escribe tu edad" ) );

if ( edad <= 17) {
    document.write( "<h2>Tas chiquitin</h2>" );
} else if (edad === 18) {
    document.write( "Eres mayor de edad" );
} else if ( edad > 18 ) {
    document.write( "<h2>Tas ruco</h2>" );
} else {
document.write("<h2>Este no es un valor válido</h2>")
}
//importante: la prueba lógica que está dentro del if debe ser verdadero
