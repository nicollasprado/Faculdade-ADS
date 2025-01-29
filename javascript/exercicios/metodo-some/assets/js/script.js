// Array
const idades = [12, 19, 17, 39, 19, 12];
const array = document.getElementById('array')
const arraytxt = document.getElementById('produtos');

idades.map((elemento)=>{
    produtoelemento = document.createElement('p');
    produtoelemento.innerText = elemento;
    array.appendChild(produtoelemento);
})

// Verificar
// No Método SOME, caso ao menos um dos elementos for válido ele retorna TRUE

const btnverificar = document.getElementById('btnverificar');
const resTxt = document.getElementById('resultadotxt')

btnverificar.addEventListener('click', ()=> {
    idades.some((elemento, indice, array)=> {
        if(true) {
            resTxt.innerHTML = `O elemento <strong>${elemento}</strong>, que está na Posição: ${indice} é menor que 18</p>`
        }
        return elemento<18
    })
})