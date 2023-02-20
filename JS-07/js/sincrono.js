//JavaScript sincrono
// alert( "cohoret 23" );
// console.log( "Hola, buen día" );
// alert( "Día del gatito" );
// console.log( "adios" );

//JavaScript asíncrono pero mala práctica
// setTimeout(
//     function () {
//         console.log( "Hola mundo, con retraso" );
//     }, 1000
// )
// console.log( "sorpresa" );


//función flecha asíncrona, buena práctica
const myCallback = () => console.log( "Hola mundo con retraso" );
setTimeout( myCallback, 0 );
console.log( "sorpresa" );