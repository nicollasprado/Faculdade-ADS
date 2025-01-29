const stri = "Teste"

console.log(stri)

const funcao1 = (entrada) => {
    const retorno = entrada + " é massa"
    return retorno
}

const retornoFuncao1 = funcao1(stri)

if(stri.length > 4){
    console.log(retornoFuncao1)
}else{
    console.log('nao deu para executar a funcao1')
}