// Forma Padrão, mostra ambos
const jogador1 = {Nome:"Pedro", Força:2, Magia:100}
const jogador2 = {Nome:"João", Força:5, Armadura:50}
const jogador3 = {jogador1,jogador2}

console.log(jogador3)

// Operador Spread, mostra o ultimo juntando suas especificidades

const jogador6 = {...jogador1,...jogador2}

console.log(jogador6)

// Outra Utilização

const soma = (v1, v2, v3)=> {
    return v1 + v2 + v3
}

let valores = [1,5,4]
console.log(soma(valores)) //falha pois está utilizando soma([1,5,4])

console.log(soma(...valores)) //o spread espalha os valores nas posições do parentese

// Utilização no HTML   IMPORTANTE

// const objs1 = document.getElementsByClassName('div') = Mostra os elementos como HTMLCollection
// const objs2 = [...document.getElementsByClassName('div')] = Dá para utilizar mais funções de Array

