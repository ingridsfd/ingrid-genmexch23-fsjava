let texto = "Hola Mundo";


/*if ( texto.includes( "z" ) ) {
    console.log("---> L");
}*/
//sólo imprime si es verdadero

let palabra = texto.split( " " );
console.log( palabra[ 0 ] + " / " + palabra[ 1 ] );
//.split( ) identifica espacios en blanco y pasa a caracteres

/*let palabra = texto.substring(5,7);
console.log(palabra); //Se toma como subcadenas*/

/*let palabra = texto.substr(-5);
console.log( palabra );*/ //toma tal cual el índice



/*let mensaje = texto.toUpperCase();
console.log( mensaje );*/

/*
for (let i = 0; i < texto.length; i++) {
    mensaje += texto[ i ] + " ";
}

//string es un objeto
//cualquier cadena de caracteres es un arreglo
//y también un objeto tipo string

mensaje = mensaje.trim();
console.log( mensaje );
*/
