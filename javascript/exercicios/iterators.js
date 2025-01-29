const valores = [1, 5, 8, 9, 15];
const valores_it = valores[Symbol.iterator]();

console.log(valores);
console.log(valores_it.next());
console.log(valores_it.next());
console.log(valores_it.next());
console.log(valores_it.next());
console.log(valores_it.next());
console.log(valores_it.next());

/* Coleções Iteráveis:
Arrays
String
Map
Sets
*/