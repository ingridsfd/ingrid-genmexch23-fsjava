//un objeto es una construcción abstracta con propiedades y atributos.
class operacionesAritmeticas{
    //constructor por default va dentro de una clase
    //instancia divida en 3: 1) declaración de un objeto, declaration of the object
    //2) creación del objeto, creation of the object y 3)petición, la llamada, calling the function 
    numero0 = 0;
    numero1 = 0;

    constructor(valor0, valor1) { //El constructor es una función
        this.numero0 = valor0;
        this.numero1 = valor1;
    }

    sumar(a,b) {
    //este método se enfoca en una sola función
        //it serves only for what is made
        //return a + b;
        return this.numero0 + this.numero1;
    }
}

let obj4 = new operacionesAritmeticas( 8, 6 );
console.log( obj4.sumar() );



let obj3 = new operacionesAritmeticas();
obj3.numero0 = 8;
obj3.numero1 = 5;
console.log( obj3.sumar( obj3.numero0, obj3.numero1 ) );

let obj2 = new operacionesAritmeticas();
console.log( obj2.sumar( 5, 6 ) );


let obj1; //instance
obj1 = new operacionesAritmeticas(); //instance
console.log( obj1.numero0 ); //function call

//constructor es un método: permite inicializar los atributos
//función que me va a permitir a crear los miembros de datos