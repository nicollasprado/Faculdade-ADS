// Wrapper vem de "que envolver"
// Mesmo conceito de criação de objeto
// Envolver valor(es) e retornar um objeto

// Criar uma String com wrapper function
const str1 = String('Teste01'); // executa a funcao
const str2 = new String('Teste02'); // instancia o objeto (new), nao usar isso com string!
console.log(`str1: ${str1} \n str2: ${str2}`);

console.log(`str1 dividida = ${str1.split('')} \n str2 dividida = ${str2.split('')}`);

const str2Convertido = str2.valueOf(); // valor primitivo
console.log(typeof str2Convertido);


// Criar um numero com wrapper function
const num1 = Number('1');
const num2 = new Number('2'); // nao usar com numeros!
console.log(`num1: ${num1} \n num2: ${num2}`);

console.log(`num1 com duas casas decimais = ${num1.toFixed(2)} \n num2 com tres casas decimais = ${num2.toFixed(3)}`);


// Criar um booleano com wf
const bool1 = Boolean(0); // 0 = false, outro numero = true
const bool2 = new Boolean(''); // vazio = false
console.log(`bool1: ${bool1} \n bool2: ${bool2}`);

console.log(`bool1.toString() = ${bool1.toString()} \n bool2.toString() = ${bool2.toString()}`)