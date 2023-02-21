//polimorfismo
//Object.prototype

class Persona{
    constructor(nombre, apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    //atributos get - set accesores
    set nombre(nombre) { //permite acceder al atributo; asignarle un valor
        this._nombre = nombre; //nombre del parámetro
    }

    get nombre() { //para obtener el método
        return this._nombre; 
    }
    set apellido(apellido) {
        this._apellido = apellido;
    }
    get apellido() {
        return this._apellido;
    }
    /*nombreCompleto() {
        return this._nombre + ' ' + this._apellido;
    }*/

    //sobreescritura. Re-definir el método. Que se pone en una clase padre y clase hija.
    nombreCompleto(){
        return this._nombre + ' ' + this._apellido;
    }
    //sobreescribir el metodo de la clase Padre Object
    toString(){
        return this.nombreCompleto();
    }  //mismo método pero utilizado en diferentes contextos u objetos
    
}

//Esto es herencia
class Empleado extends Persona{
    constructor(nombre, apellido, departamento) { //super nos permite acceder a la clase que se extiende para obtener esos atributos
        super(nombre, apellido) //con super se accede a la clase padre
        this._departamento = departamento;
    }
    set departamento(departamento) {
        this._departamento = departamento;
    }

    get departamento() { //get siempre retorna
        return this._departamento;
    }
    //sobreescritura
    nombreCompleto() {
        return super.nombreCompleto() + ' ' + this._departamento;
    }
}



//let persona1 = new Persona( 'Arturo', 'Gomez' );
//console.log(persona1.nombre);
//console.log( persona1.nombreCompleto() ); //Arturo Gomez
let persona1 = new Persona( 'Arturo', 'Chavez' );
console.log( persona1.toString() );

let empleado1 = new Empleado( 'Janet', 'Jackson', "Supervisor" );
console.log( empleado1 );
//console.log(empleado1.nombre);
console.log(empleado1.nombreCompleto());
console.log( empleado1.toString() );


//let persona3 = new Persona( 'Johnny', 'Depp' );
//reasignar el valor
// persona3.nombre = 'Juan'; //regresa persona3.nombre Juan
// console.log( persona3.nombre ); //Aquí estamos llamando al método

// persona3.apellido = 'Jimenez';
// console.log( persona3.apellido );

//hoisting, llamar a la variable antes de definirla
//en la POO, no se puede llamar a la clase antes de definir la clase

//atributos privados de la clase
//instanciamos
// let persona1 = new Persona( 'Juan', 'Perez' );
// console.log( persona1 );

// let persona2 = new Persona( 'Ingrid', 'Diaz' )
// console.log( persona2 );