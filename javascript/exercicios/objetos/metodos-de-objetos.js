const arrayDeArrays = [
    ['abc', 2],
    ['def', 4]
];

// fromEntries = retorna um objeto criado por meio de uma entrada de chave-valor
const objeto = Object.fromEntries(arrayDeArrays);
console.log(typeof objeto, objeto)

const objetosEntrada = {
    'abc': 2,
    'def': 4
}


// entries = retorna um array por meio de um objeto
const objeto2 = Object.entries(objetosEntrada);
console.log(typeof objeto2, objeto2)


// Criação de arrays por meio de itens de um objeto
const obj = {
    100: 'a',
    25: 'b',
    5: 'c'
}

const keys = Object.keys(obj); // Transforma as propriedades, keys (100, 25, 5) em um array
const values = Object.values(obj); // Transforma os values (a, b, c) em um array

console.log(keys)
console.log('')
console.log(values)