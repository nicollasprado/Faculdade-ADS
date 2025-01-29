
// Matrizes -> array dentro de um array
// Temos indices para controlar diversos niveis do array

let cores = ['azul', 'verde', 'vermelho', ['claro', 'escuro']]
const nomes = ['pedro', 'jose', 'carlos', cores]

console.log(nomes)
console.log('')
console.log(nomes[3])
console.log('')
console.log(nomes[3][2])
console.log('')
console.log(nomes[3][3][1])

/*
nomes.push('cleber') // adiciona no final
nomes.pop() // remove o ultimo elemento
nomes.unshift('jefferson') // adiciona no inicio
nomes.shift() // remove o primeiro elemento
*/

// é possivel adicionar qualquer coisa nas posições do array