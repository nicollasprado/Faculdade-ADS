const funcao1 = ()=>{
    try {
        funcao2();
    }catch(error){
        throw error; // manda para a funcao main
    }
}

const funcao2 = ()=>{
    try {
        funcao3();
    }catch(error){
        throw error; // manda para a funcao 1
    }
}

const funcao3 = ()=>{
    try {
        throw new Error('Deu erro na funcao3')
    }catch(error){
        throw error; // manda para a funcao 2
    }
}

const main = ()=>{
    try{
        funcao1();
    }catch(error){
        console.error(error)
    }
    console.log('passou por aqui')
}
main()