//Exercise 1
let GPAacumulativo = 2.1;
let Unidadestotales = 120;

if ( GPAacumulativo > 2.0 ) {
    console.log( "¡Puede graduarse!" )
} else {
    console.log( "No tienes GPA suficiente ni Unidades totales suficientes" );
}

if ( Unidadestotales >= 120 ) {
    console.log("También puede graduarse")
} else {
    console.log("No tienes Unidades totales suficientes")
};

//Exercise 2
let cspProgCalificacion = 76;

    if ( cspProgCalificacion >= 75 ) {
        console.log( "¡Eres elegible para la graduación!" );
    } else {
        console.log( "Vas a repetir año, nimodo." )
    };

//Exercise 3
/*La posibilidad de acceder a cada caracter en una cadena 
nos permite lograr efectos interesantes. En el siguiente ejercicio agrega puntos entre
las letras de cada palabra, pero no entre las palabras*/

//let texto = "Hola Mundo";
//"H.o.l.a.M.u.n.d.o"

let texto = "Hola Mundo";
console.log(
    texto[ 0 ] + "." +
    texto[ 1 ] + "." +
    texto[ 2 ] + "." +
    texto[ 3 ] + "." +
    texto[ 4 ] + " " +
    texto[ 5 ] + "." +
    texto[ 6 ] + "." +
    texto[ 7 ] + "." +
    texto[ 8 ] + "." +
    texto[ 9 ]
);

