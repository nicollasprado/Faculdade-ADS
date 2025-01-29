// Objeto que fica preso ao objeto global

const umaPromessa = new Promise((resolve, reject) => {
    let soma = 1 + 3;
    if(soma === 2){
        resolve('deu tudo certo')
    }else{
        reject('deu errado')
    }
})

console.log('esperando promise...');

// handlers, trabalha com os retornos
umaPromessa.then((resultado) => {
    console.log(`Valor do then: ${resultado}`) // resolve
}).catch((erro)=>{
    console.error(`Valor do catch: ${erro}`) // reject
}).finally(()=>{
    console.log('Eu sempre estarei presente')
})