//var nombre = "Ingrid";
//var edad = 25;
//var tengoMascotas = true;
//var tengoTrabajo = false;
//var tengosueldo = undefined;

let nombre = "Ingrid";
let edad = 25;
let tengoMascotas = true;
let tengoTrabajo = false;
//let tengosueldo= undefined;

//Conseguir el num de horas totales trabajadas y;
//costes por horas
function horas() {
    let horasTrabajadas = parseInt( prompt( "¿Cuantas horas trabajaste?" ) );
    let coste = parseInt( prompt( "¿Coste por horas?" ) );
    document.write( "Total = " + ( horasTrabajadas * coste ) );
}

//1. suma 3 + 2;
//2. multiplica 2 * 5;
// resultado de 1. entre resultado de 2.;
function operacion( a, b, c, d ) {
    let suma = a + b;
    let mul = d * c;
    let res = suma / mul;
    return res
}
console.log( operacion( 3, 2, 2, 5 ) );

//IMC
function imc() {
    let peso = parseInt( prompt( "Cual es tu peso en Lb?" ) );
    let estatura = parseInt( prompt( "cual es tu estatura en Cm?" ) );
    peso = peso * 0.4535
    estatura = estatura / 100;
    let imc = peso / ( estatura ** 2 );
    if ( imc < 16 ) {
        console.log( "Criterio de ingreso" );
    } else if ( imc >= 16 && imc <= 16.9 ) {
        console.log( "Infrapeso" );
    } else if ( imc >= 17 && imc <= 18.4 ) {
        console.log( "Bajo peso" );
    } else if ( imc >= 18.5 && imc <= 24.9 ) {
        console.log( "Peso normal" );
    } else if ( imc >= 25 && imc <= 29.9 ) {
        console.log( "Sobrepeso" );
    } else if ( imc >= 30 && imc <= 34.9 ) {
        console.log( "Obesidad premórbida" );
    } else if ( imc >= 40 && imc <= 45 ) {
        console.log( "Obesidad mórbida" );
    } else if ( imc > 45 ) {
        console.log( "Obesidad hipermórbida" );
    }
}
