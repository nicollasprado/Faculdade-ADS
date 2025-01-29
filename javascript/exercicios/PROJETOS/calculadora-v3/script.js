const teclas = [...document.querySelectorAll('.tecla')];
const teclasSimbolo = [...document.querySelectorAll('.teclaSimbolo')]
const displayTxt = document.getElementById('display');

let decimal = false;

// Função para amostragem no display
function criar(tecla, tipo){
    let novoNumero = document.createElement('p');
    if(displayTxt.firstElementChild.innerHTML == "0"){
        displayTxt.removeChild(displayTxt.firstElementChild);
        displayTxt.appendChild(novoNumero);
        novoNumero.innerText = tecla.innerText;
    }else if(tecla.innerHTML == "."){
        if(!decimal){
            decimal = true;
            displayTxt.appendChild(novoNumero);
            novoNumero.innerText = tecla.innerHTML;
        }
    }else{
        displayTxt.appendChild(novoNumero);
        novoNumero.innerText = tecla.innerHTML;
    }
    if(tipo == 'operador') {
        novoNumero.setAttribute('class', 'operador');
    }
}

// Teste Lógico, tem alguma tecla de operação clicada?
function testeTeclaSimbolo(tecla){
    let clicadas = [...document.querySelectorAll('.operador')];
    if(clicadas.length == 1){
        let clicada = document.querySelector('.operador');
        displayTxt.removeChild(clicada);
        criar(tecla, 'operador');
    }else{
        criar(tecla, 'operador');
    }
}

// Log da tecla clicada e envio para a funcao de criação
teclas.forEach((tecla)=>{
    tecla.addEventListener('click', ()=>{
        criar(tecla);
    })
})

// Log da tecla clicada e envio para a funcao de teste logico
teclasSimbolo.forEach((tecla)=>{
    tecla.addEventListener('click', ()=>{
        testeTeclaSimbolo(tecla);
        decimal = false;
    })
})

// Teste para a teclaC, o ponto ja foi excluido?
function testeTeclaC(){
    let array = []
    displayTxt.childNodes.forEach((cada)=>{
        array.push(cada)
    })
    console.log(array)
    let filtro = array.filter(valor => valor.innerHTML == ".")
    console.log(filtro)
    switch(filtro.length){
        case 0:
            decimal = false;
            break
        case 1:
            decimal = true;
            break
    }
}

// Evento ao clicar nas teclas de Funções
// Tecla C funcionalidades
const teclaC = document.getElementById('teclaC');
teclaC.addEventListener('click', ()=>{
    let ultimoNum = displayTxt.lastChild;
    if(displayTxt.childElementCount == 1){
        displayTxt.innerHTML = '<p>0</p>';
    }else {
        displayTxt.removeChild(ultimoNum);
    }
    testeTeclaC();
})

const teclaCE = document.getElementById('teclaCE');
teclaCE.addEventListener('click', ()=>{
    displayTxt.innerHTML = '<p>0</p>';
    decimal = false;
})

// Evento Resultado
const teclaIgual = document.getElementById('teclaIgual')
teclaIgual.addEventListener('click', ()=>{
    let filhos = displayTxt.childNodes;
    let restxt = "";
    filhos.forEach((filho)=>{
        restxt+=filho.innerText;
    })
    let novotxt = restxt.replace("undefinedundefined", "");
    let res = eval(novotxt);
    displayTxt.innerHTML = `<p>${res}</p>`;
    decimal = false;
})

const teclaCopy = document.getElementById('teclaCopy');
teclaCopy.addEventListener('click', ()=>{
    navigator.clipboard.writeText(displayTxt.innerText);
})