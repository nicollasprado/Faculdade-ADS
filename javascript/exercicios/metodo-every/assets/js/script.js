// Array
const idades = [22, 19, 27, 39, 12];
const array = document.getElementById('array')
const arraytxt = document.getElementById('produtos');

idades.map((elemento)=>{
    produtoelemento = document.createElement('p');
    produtoelemento.innerText = elemento;
    array.appendChild(produtoelemento);
})

// Verificar
// No Método EVERY, todos elementos do Array devem ser válidos para retornar TRUE

const btnverificar = document.getElementById('btnverificar');
const resTxt = document.getElementById('resultadotxt')

/*
btnverificar.addEventListener('click', ()=> {
    resTxt.innerText = 'Array Não Conforme'
    const retorno = idades.every((elemento, indice, array)=>{
        return elemento>= 18
    })
    if(retorno /*==true ) {
        resTxt.innerText = 'Array Conforme'
    }
    console.log(retorno)
})
*/

btnverificar.addEventListener('click', ()=> {
    const retorno = idades.every((elemento, indice, array)=>{
        if(elemento<18) {
            resTxt.innerHTML = `<p>Array Não Conforme, elemento diferente na posição: <strong>${indice}</strong </p>`
        }
        return elemento>= 18
    })
    if(retorno /* ==true */) {
        resTxt.innerText = 'Array Conforme'
    }
})