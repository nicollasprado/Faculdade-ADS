try {
    consolee.log('falso com try catch')
}catch(erro) {
    console.log('ERRO')
    console.log(`Mensagem de Erro: ${erro.message}`) //uma forma de achar o erro
}

// outra forma

try{
    num = 13;
    if(num >= 10){
        throw /* Excessão */ new Error('Valor Invalido, ele deve ser menor ou igual a 10') //manda a mensagem de erro pro catch
    }
    console.log(`Valor: ${num}`)
}catch(erro2) {
    console.log(erro2.message)
}finally { // executa tendo erro ou nao
    console.log('fim do tratamento')
}