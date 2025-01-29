// bind = liga o this a uma nova funcao criada quando é chamado
// Torna o valor de this o objeto fornecido
function thisBind(){
    console.log(this);
}

const obj = {exemplo: 'exemplo'};

thisBind = thisBind.bind(obj)
thisBind()

// call() e apply() tem uma sintaxe identica;
// A diferença é que call() aceita uma lista de argumentos
// Ja o apply() aceita um array de argumento

// call
const obj1 = {exemplo1: 'exemplo1', mostrarThis: function thisCall() {
    console.log(this)
}}

obj1.mostrarThis()

const obj2 = {exemplo2: 'exemplo2', balao: 'balao', numero: 2} // aceita lista de argumentos

obj1.mostrarThis.call(obj2)

// apply
const obj3 = {exemplo3: 'exemplo3', mostrarThis: function thisCall(a, b, c) {
    console.log(this)
}}

obj3.mostrarThis()

const obj4 = {exemplo4: 'exemplo4', estouro: 'estouro', numero: 6}

obj1.mostrarThis.call(obj4, 1, 2, 3) // aceita array