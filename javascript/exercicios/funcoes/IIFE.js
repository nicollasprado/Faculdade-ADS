// Immediately Invoked Function Expression


// Não afeta o que está fora da função
// Útil para trabalhar com uma variavel privada

/* Sintaxe

(Function () {
    código
})()

*/

// exemplo

const resultado = (function () {
    const meuNome = "Nicollas"
    return meuNome
})()

console.log(resultado)

const arrow = (()=>{
    const num = 19;
    return num
})()

console.log(arrow)