// Podemos manipular parametros por meio dele

// 1ª Forma
function somaInfinita(){
    // Transformação de objeto para array
    const arrayDeArguments = Array.from(arguments);
    let soma = 0;
    for(let i=0; i < arrayDeArguments.length; i++){
        soma = soma + arrayDeArguments[i];
    }
    return soma;
}

console.log(somaInfinita(1, 2, 3, 4, 5))
// Não é um array, é um iteravel
// Para utiliza-lo como array devemos transforma-lo

// 2ª Forma
function somaInfinita2(){
    // Transformação de objeto para array
    const arrayDeArguments = Array.from(arguments);
    return arrayDeArguments.reduce((valAntigo, valAtual) => valAntigo += valAtual)
}

console.log(somaInfinita2(1, 2, 3, 4, 5))

// Forma ao receber um array
const somaInfinita3 = (args) => args.reduce((valAntigo, valAtual) => valAntigo += valAtual);

console.log(`Array: ${somaInfinita3([1, 2, 3, 4, 5])}`)