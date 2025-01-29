const funcao1 = ()=>{
    console.log('eu sou a funcao1');
    const valor = true;
    try{
        if(valor){
            throw new Error('O valor tem que ser false!') // Instancia o erro, força isso a ser um erro
        }
    }catch(error){
        throw error; // throw lança o erro para outra funcao
    }
}

const funcao2 = ()=>{
    console.log('eu sou a funcao2');
        adasdzc;
}

const main = ()=>{
    try{
        funcao1();
        funcao2();
    }catch(error){
        console.error(error);
    }
    console.log('passou por aqui');
}

main()