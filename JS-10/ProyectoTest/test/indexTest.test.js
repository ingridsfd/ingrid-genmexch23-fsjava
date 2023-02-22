//prueba efectiva
const indexTest = require( "../calculadora/index.js" );
test( 'test suma', () => {
    //second
    const r = indexTest.suma( 3, 2 );
    expect( r ).toBe( 5 );

} )