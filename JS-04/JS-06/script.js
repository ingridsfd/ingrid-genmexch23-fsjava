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
var botonSuma = document.getElementById( "botonResta" );
var botonSuma = document.getElementById( "botonMultiplicacion" );
var botonSuma = document.getElementById( "botonDivision" );

var resultado = document.getElementById( "resultado" );