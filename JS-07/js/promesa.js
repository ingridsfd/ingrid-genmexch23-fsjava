const myURL = document.URL.toString();
//se pide la dirección URL
const promesa = fetch( myURL );
//permite controlar lo que ocurra
promesa.then( resultado => console.log( resultado ), e => console.log( `error callback ${ e }` ) );
//aquí hacemos un request, una petición de un recurso
//protocolo de estado
