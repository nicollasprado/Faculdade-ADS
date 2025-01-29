const promise1 = () => new Promise((resolve)=>{
    setTimeout(()=> resolve('promise 1 resolvida!'), 3000)
})

const promise2 = () => new Promise((resolve)=>{
    setTimeout(()=> resolve('promise 2 resolvida!'), 2000)
})

const promise3 = () => new Promise((resolve)=>{
    setTimeout(()=> resolve('promise 3 resolvida!'), 1000)
})

console.log('Carregando...')

// async = indica que algum codigo da funcao é assincrona
const resolvedorDePromisesAsync = async () => {
    console.log('carregando resultado 1...')
    const resultado1 = await promise1();
    console.log('Promise 1 carregada!');
    console.log('Carregando resultado 2...')
    const resultado2 = await promise2();
    console.log('Promise 2 carregada!')
    console.log('Carregando promise 3')
    const resultado3 = await promise3();
    console.log('Promise 3 carregada!')
    console.log('Todos resultado foram carregados!')

    console.log(`Mensagens: \n${resultado1} \n${resultado2} \n${resultado3}`)
}

resolvedorDePromisesAsync()