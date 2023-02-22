//prueba efectiva
//const indexTest = require( "../calculadora/index.js" ); // Este es el ECMA Script 5;
import { indexTest } from "../calculadora/index.js"; //Este es el ECMA Script 6;
test( 'test suma', () => {
    //second
    const r = indexTest.suma( 3, 2 );
    expect( r ).toBe( 5 );
} );

//en ecma6 es npm test, no hay que olvidar poner el module.exports.indexTest =
//o export const indexTest = {}
//en ecma5 es npm run test

test.todo( 'test resta' );
test.todo( 'test mult' );
test.todo( 'test division' );
