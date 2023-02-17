/*
Que encontramos en el arbol de DOM?

- Node: Es la unidad más básica dentro del documento. Puede ser una etiqueta,
un texto dentro de una etiqueta o comentario, etc.

<title> NODO
Manipulación del DOM // Es un nodo, pero es hijo del title
</title>

- Document: También es un nodo, del tipo documento, es el nodo raiz a partir del cual
se desarrollan o generan todos los demas nodos.

- Element: son todos aquellos definidos por etiquedas <div>, <img>, <h1>, <p></p>

- Attributes: Nodos que dan información asociada al tipo de elemento.
Nota extra: type="number" como descripción del atributo

- Comentario: Comentarios y otros elementos que estan dentro del HTML, son considerados nodos.

*/

/*Cómo leer nodos de mi Document Object Model (DOM)

Métodos tradicionales (que se usan en versiones antigüas de JS)

- document.getElementById (botonSuma)
- document.getElementByTagName (<button></button>)
- document.getElementByClassName (boton) De este lado, es para agrupar en HTML todos los elementos en común

Utilizar Query Selectors 

Los objetos tienen propiedades que contienen tipos de datos

*/

// var elementoID = document.getElementById( "botonResta" );
// console.log( elementoID );

// var elementoEtiqueta = document.getElementsByTagName( "button" );
// console.log( elementoEtiqueta );
// console.log( "Este es el primer elemento de mi colección de botones", elementoEtiqueta[ 0 ] );

// var elementoClassName = document.getElementsByClassName( "botones" );
// console.log( elementoClassName );
//class es para todos los divs
//id es sólo para uno en específico, o para diferenciar un componente de otros
//es recomendable que solo exista 1 elemento en getElement para una mejor práctica


/*
Métodos recientes
Métodos para traer la información pero de forma más sencilla.

- document.querySelector(#botones)
- document.querySelectorAll(.botones)

Traer un elemento por Id o por clase
*/

// var unElemento = document.querySelector( "#input1" );
// console.log( unElemento );

// var variosElementos = document.querySelectorAll(".botones");
// console.log( variosElementos );

//Palabras reservadas de Js son let, var, const, function

/* 
Creación de nodos
*/

//Creación de una etiqueta del tipo imagen
const imagenPerrito = document.createElement( "img" );

//Creamos atributos a la etiqueta
imagenPerrito.src = "https://www.petdarling.com/wp-content/uploads/2021/01/cachorros.jpg";
imagenPerrito.alt = "Foto de perrito tierno"
imagenPerrito.style.width = "150px";
imagenPerrito.style.borderRadius = "40px";

var textoPerrito = document.createElement( "p" );
textoPerrito = "Este es mi perrito";


//poner elementos o nodos en el html
document.body.append( imagenPerrito );

//Actualizar nodos //parentElementBefore //appendChild

//1er paso: Identificar el nodo que quiero cambiar
//2do paso: Modificar el nodo (inner)

var resultadoQueCambia = document.getElementById( "resultado" );

resultadoQueCambia.innerHTML = "Saludos, cambie el texto"

//construir nuestra calculadora
var input1 = document.getElementById( "input1" );
var input2 = document.getElementById( "input2" );

var botonSuma = document.getElementById( "botonSuma" );
var botonResta = document.getElementById( "botonResta" );
var botonMultiplicacion = document.getElementById( "botonMultiplicacion" );
var botonDivision = document.getElementById( "botonDivision" );

var resultado = document.getElementById( "resultado" );

//Construimos las funciones de nuestra calculadora
function suma() {
    let valor1 = parseInt(input1.value); //pido num1
    let valor2 = parseInt( input2.value ); //pido num2
    let suma = valor1 + valor2; //calculo la suma
    resultado.innerHTML = suma; //pongo el resultado en su lugar
}

function resta() {
    let valor3 = parseInt( input1.value ); //pido num1
    let valor4 = parseInt( input2.value );
    let resta = valor3 - valor4;
    resultado.innerHTML = resta;
}

function multiplicacion() {
    let valor5 = parseInt( input1.value );
    let valor6 = parseInt( input2.value );
    let multiplicacion = valor5 * valor6;
    resultado.innerHTML = multiplicacion;
}

function division() {
    let valor7 = parseInt( input1.value );
    let valor8 = parseInt( input2.value );
    let divison = valor7 / valor8;
    resultado.innerHTML = divison;
}

/*cómo se crea un evento(addEventListener)
    - node.addEventListener("evento a escuchar", lo que quiero que haga cuando se escuche)
    - addEventListener (palabra reservada para usar el evento)
    - evento escuchar (click, mouseover, etc.)
    - lo que quiero que haga (la llamada de la función)
*/

botonSuma.addEventListener( "click", suma );
botonResta.addEventListener( "click", resta );
botonMultiplicacion.addEventListener( "click", multiplicacion );
botonDivision.addEventListener( "click", division );


/* Manipulación del DOM
    - Métodos para acceder a elementos
        //ul - lista no organizada
        // li - es la lista
    - Métodos para crear elementos
        - document.createElement(etiqueta)
        - document.createTextNode(texto) - Investigar 
            - 

    - Métodos para insertar elementos
        - parentElemento.append.
        - parentElement.insertBefore
        - parentElement.insertAdjacentElement

    - Métodos para modificar elementos
        - node.outerHTML (Leer o referenciar el elemento)
        - node.innerHTML (modificar el elemento)

*/

/*Eventos 
Función que se ejecuta en tiempo y forma
Investigar eventos de HTML
onclick, onmouseover, on...
Modularización = tener todo dividido

*/

//Primer paso: Definir con que voy a interactuar (almaceno en una variable)
const textoAModificar = document.querySelector("#h1")

//Creo una funcion que cambia de color, segun el color que le paso como parametro
function cambiarColor(color){
    textoAModificar.style.color = color;
}