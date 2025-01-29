function parimpar(valor) {
    if (valor%2 == 0) {
        return 'Par'
    } else {
        return 'Ímpar'
    }
}
console.log(parimpar(21))



function soma(n1=0, n2=0) {
    return n1 + n2
}
console.log(soma(1, 3))



var teste = function(x) {
    return x*2
}
console.log(teste(5))



let amigo = {
    nome: 'Adriano',
    sexo: 'M',
    peso: 70.6,
    engordar(kg=0){
        console.log('engordou!')
        this.peso += kg
    }
}

amigo.engordar(5)
console.log(`Meu amigo ${amigo.nome} pesa ${amigo.peso}kg`)


// Função Anônima

const t = function(v1=0, v2=0) {
    return v1+v2
}

console.log(t(5,10))

// Função Anônima Construtor
// Utiliza o new

const f = new Function("v1=0","v2=0","return v1+v2")

console.log(f(35,25))

// Arrow Function (funções lambdas -> funções anonimas)

const arrow=(v1,v2) => {return v1+v2}

console.log(arrow(50,30))

// Com apenas 1 parametro

const arrow2=v3 => {return ++v3}

console.log(arrow2(10))

// Não é obrigatorio usar chaves se for de baixa complexidade

const arrow3=v4 => v4+10

console.log(arrow3(3))



// Função Geradora
function* sabores() {
    yield 'Frango'
    yield 'Carne com Queijo Qualho'
    yield 'Calabresa'
}
const itc = sabores()
console.log(itc.next().value)
console.log(itc.next().value)
console.log(itc.next().value)
console.log(itc.next().value)


function* contador() {
    let numero = 0
    while(numero < 100){
        yield ++numero
        if (numero > 10)
        break
    }
}
const itcc = contador()
for (numerofinal of itcc) {
    console.log(numerofinal)
}