//console.log( "Hola desde NPM..." );
// example.js
const parrotSay = require('parrotsay-api')

parrotSay('yaaay')
.then(console.log)
.catch(console.error)