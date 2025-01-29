let aleatorio = Math.random()*100 // vezes 100 faz o valor ser entra 0 e 100
let inteiro = Math.floor(aleatorio)
let arredondado = Math.round(aleatorio)
let raizQuadrada = Math.sqrt(arredondado)
let elevado = Math.pow(arredondado, 2)

console.log(inteiro)
console.log(arredondado)
console.log(`A raiz quadrada de ${arredondado} é: ${raizQuadrada}`)
console.log(elevado)