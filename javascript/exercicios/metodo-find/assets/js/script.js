// Array
const produtos = ['Pao', 'Queijo', 'Mortadela'];
const array = document.getElementById('array')
const arraytxt = document.getElementById('produtos');

produtos.map((elemento)=>{
    produtoelemento = document.createElement('p');
    produtoelemento.innerText = elemento;
    array.appendChild(produtoelemento);
})

// Pesquisa
const input = document.getElementById('caixatxt');
const btnpesquisar = document.getElementById('btnpesquisar');

btnpesquisar.addEventListener('click', ()=> {
    const pesquisa = produtos.find((elemento, indice, array)=>{
        let resTxt = document.getElementById('resultadotxt');
        resTxt.innerText = 'Nenhum Produto Encontrado'
        if(elemento.toLowerCase() == input.value.toLowerCase()) {
            resTxt.innerHTML = `<p>Produto encontrado: <strong>${elemento}</strong> <br>Sua Posição: ${indice} </p>`;
            return elemento
        }
    })
    console.log(pesquisa)
})