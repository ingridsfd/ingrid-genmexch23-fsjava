//Sistema 1:
//1. Calcular el sueldo base del empleado respecto 
//a la cantidad de días trabajados (Lun-Sab)
let salario = 428;
let jornada = 6;
let salarioSemanal = (jornada * salario);
//resultado 2568
console.log(salarioSemanal);

//2. Ejemplo de días de vacaciones
let vacaciones = 7;
let proporcional = 5 * vacaciones;
console.log(proporcional);

//3. Calcular la prima dominical en caso de que el empleado labore en domingo
let primDom = (salario * 0.29) + salario;
console.log(primDom);

//4. Calcular el pago de horas extras en caso de ser necesario
let extraHour = 80;
let totalExtra = 5 * extraHour;
console.log(totalExtra);

//5. Calcular el pago del bono de productividad con impuestos
let sConImp = salario * 1.12;
let impXdia = sConImp * 31;
let bono = impXdia * 1.15;
console.log(bono);

//6. Calcular el sueldo total antes de impuestos de forma mensual y quincenal
//mensual:
let dias = 31;
let salarioMen = salario * dias;
console.log(salarioMen);

//quincenal
let diasQ = 15;
let salarioQuin = salario * diasQ;
console.log(salarioQuin);

//7. Calcular el sueldo total después de impuestos de forma mensual y quincenal
//mensual:
let salarioImpMen = sConImp * 31;
console.log(salarioImpMen);

//quincenal: 
let salarioImpQuin = sConImp * 15;
console.log(salarioImpQuin);

//Sistema 2:
//1. Calcular el costo total de “muñecas” y “payasos” vendidos por pedido
let costoM = 159;
let cantidadMun = 15;
let costoP = 220;
let cantidadP = 17;
let costoCanM = costoM * cantidadMun;
let costoCanP = costoP * cantidadP;
let sumaCostosCantidad = costoCanM + costoCanP
console.log(sumaCostosCantidad);

//2. Calcular el peso total del pedido
let pesoM = 200;
let pesoP = 135;
let totalPesoM = cantidadMun * pesoM;
let totalPesoP = cantidadP * pesoP;
let sumaPesosTotales = totalPesoM + totalPesoP;
console.log(sumaPesosTotales);
//conversion a kg
let convertKg = sumaPesosTotales / 1000;
console.log(convertKg);

//3. Calcular la cantidad de paquetes a enviar por pedido
//poner en el máximo de 2kg payasos y muñecas



//4. Calcular el descuento por promoción de la paquetería
let precioPesoTotal = convertKg * sumaPesosTotales ;
let descuento = precioPesoTotal * 1.10;
console.log(descuento);