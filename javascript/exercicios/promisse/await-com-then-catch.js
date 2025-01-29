const promise1 = () => new Promise((resolve)=>{
    setTimeout(()=> resolve('promise 1 resolvida!'), 3000);
});

const promise2 = () => new Promise((resolve, reject)=>{
    setTimeout(()=> reject('promise 2 deu errado!'), 2000);
});

console.log('Carregando promises...');

// async = indica que algum codigo da funcao é assincrona
const resolvedorDePromisesAsync = async () => {
    const resultado1 = await promise1().then((resultado)=>{
        console.log(resultado);
        return resultado;
    }).catch((erro)=>{
        console.log(erro)
        return erro;
    });
    const resultado2 = await promise2().then((resultado)=>{
        console.log(resultado);
        return resultado;
    }).catch((erro)=>{
        console.log(erro);
        return erro;
    });
    console.log(`Mensagens: \n${resultado1} \n${resultado2}`);
}

resolvedorDePromisesAsync();