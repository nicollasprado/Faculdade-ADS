const main = ()=>{
    try{ // O que imagino que pode dar erro
        codigo
    }catch(error){
        // stack = pilha de erros, de onde começou ao fim
        console.error(`Deu erro no código \nO erro foi: ${error}`)
    }finally{
        console.info('finally sempre é mostrado')
    }
}

main()