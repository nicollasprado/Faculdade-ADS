// Array
const numeros = [3,6,9,12];
const array = document.getElementById('array');
const arraytxt = document.getElementById('produtos');

numeros.map((elemento)=>{
    produtoelemento = document.createElement('p');
    produtoelemento.innerText = elemento;
    array.appendChild(produtoelemento);
})

// Verificar
// No Método REDUCE, soma o valor anterior com o atual até sobrar apenas um elemento - reduzindo o array.

const btnReduzir = document.getElementById('btnreduzir');
const resTxt = document.getElementById('resultadotxt');
let anterior = [];
let atual = [];

btnReduzir.addEventListener('click', ()=> {
    resTxt.innerText = numeros.reduce((elanterior, elemento, indice, array)=>{
        anterior.push(elanterior);
        atual.push(elemento);
        return elemento+elanterior;
    })
    resTxt.innerHTML += `<br>Valor Anterior: ${anterior}<br> + <br> Valor Atual: ${atual}`;
})