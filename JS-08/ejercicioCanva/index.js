const avivinar = document.querySelector(".adivina");
const avivinar1 = document.querySelector(".adivina1");

class JuegoAdivinarNumero {
    constructor() {
      this.numeroSecreto = 25; //Math.floor(Math.random() * 100) + 1;  // Número secreto aleatorio entre 1 y 100
      this.numeroSolicitado = false;  // El usuario ya introdujo un numero?
    }
    esNumero(valor) {
      return !isNaN(parseFloat(valor)) && isFinite(valor);     // Método para comprobar si un valor es un número
    }
    pedirNumero() {     // Método para solicitar un número al usuario
      if (!this.numeroSolicitado) {
        this.numeroSolicitado = true;
        let numero = prompt("Introduce un número del 1 al 100:");
        
        while (!this.esNumero(numero) || numero < 1 || numero > 100) { // Mientras el valor introducido no sea un número o no esté entre 1 y 100, sigue solicitando un número
          alert("Debe introducir un número del 1 al 100.");
          numero = prompt("Introduce un número del 1 al 100:");
        }
          return parseInt(numero);         // Devuelve el número introducido por el usuario como un entero
      } else {
        return null;         // Devuelve null si ya se ha solicitado un número
      }
    }
    comprobarNumero(numero) {
        
      if (numero === this.numeroSecreto) { // Si el número es correcto, se imprime un mensaje de felicitación y se muestran los números introducidos
        avivinar.innerHTML = `<h2>Felicidades, adivinaste el número secreto es ${this.numeroSecreto}.</h2>`
      } else if(numero !== this.numeroSecreto){
          avivinar1.innerHTML = `<h2>El número secreto es incorrecto, vuelve a intentarlo.</h2>`
          let juego = new JuegoAdivinarNumero();
          juego.jugar();
      }
    }  
    jugar() {
      let numero = this.pedirNumero();
      if (numero !== null) {
        this.comprobarNumero(numero);
      }
    }
  }
  
  let juego = new JuegoAdivinarNumero();
juego.jugar();
  
/*
const adivinado = document.querySelector(".adivina");

class Numero {
    constructor(numero){
        this.numero = numero;
        this.VariableNumeroAleatorio;
    }
    adivinar(){
        if(VariableNumeroAleatorio == this.numero){
            adivinado.innerHTML = "<h2>Adivinaste</h2>";
        }
        else if(this.numero > numero){
            adivinado.innerHTML = "<h2>Es menor que eso</h2>";
        }
        else if(this.numero < numero){
            adivinado.innerHTML = "<h2>Es mayor que eso</h2>";
        }
        else{
            adivinado.innerHTML = "<h2>Esta fuera del rango</h2>";
        }
    }
    validar(valor) {
        return !isNaN(parseFloat(valor)) && isFinite(valor);
    }
    rango(){
        while(this.esnumero <= 1 || this.esnumero >= 100){
        }
    }
    generarAleatorio(){
        let VariableNumeroAleatorio = Math.floor(Math.random() * 100) + 1
    }
}

let valorDelUsuairo = new Numero(20);
//let numeroAdiv = parseIint(prompt("Adivina el numero del 1 al 100 : "));
*/