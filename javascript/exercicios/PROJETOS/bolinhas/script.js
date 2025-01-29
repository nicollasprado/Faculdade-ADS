const campo = document.getElementById('campo');
const btnAdd = document.getElementById('btnAdd');
const inputBolinhas = document.getElementById('bolinhasAdd')

let larguraCampo = campo.offsetWidth;
let alturaCampo = campo.offsetHeight;
let bolas = [];
let numBolas = 0;

class Bolinha{
    constructor(par_cor, par_arrayBolas, par_campo){
        this.cor = par_cor;
        this.velocidadeX = Math.floor(Math.random()*5)+1;
        this.velocidadeY = Math.floor(Math.random()*5)+1;
        this.tamanho = Math.floor(Math.random()*5)+1;
        this.eixoX = Math.floor(Math.random()*(larguraCampo - this.tamanho));
        this.eixoY = Math.floor(Math.random()*(alturaCampo - this.tamanho));
        this.direcaoX = (Math.random()*10) > 5 ? 1 : -1;
        this.direcaoY = (Math.random()*10) > 5 ? 1 : -1;
        this.campo = par_campo;
        this.arrayBolas = par_arrayBolas;
        this.id = Date.now()+'_'+ Math.floor(Math.random()*1000000000000)
        this.criar()
        this.controle = setInterval(this.controlar, 10);
        this.bolinha = document.getElementById(this.id)
    }
    info(){
        console.log(`Cor: ${this.cor}`);
        console.log(`Velocidade: ${this.velocidade}`);
        console.log(`Tamanho: ${this.tamanho}`);
        console.log(`Posição X: ${this.eixoX}`);
        console.log(`Posição Y: ${this.eixoY}`);
        console.log(`Direção X: ${this.direcaoX}`);
        console.log(`Direção Y: ${this.direcaoY}`);
        console.log(`ID: ${this.id}`);
    }
    criar(){
        let bolinhaOBJ = document.createElement('p')
        bolinhaOBJ = document.createElement('p')
        bolinhaOBJ.classList.add('bolinha')
        bolinhaOBJ.style.color = this.cor;
        bolinhaOBJ.innerText = 'O'
        campo.appendChild(bolinhaOBJ)
    }
    posicaoNoArray(){}
    controlar(){}
    /*setVelocidade(retorno_velocidade){
        this.velocidade = retorno_velocidade
    };
    setTamanho(retorno_tamanho){
        this.tamanho = retorno_tamanho;
    };
    setX(retorno_eixoX){
        this.eixoX = retorno_eixoX;
    };
    setY(retorno_eixoY){
        this.eixoY = retorno_eixoY;
    };
    setCor(retorno_cor){
        this.cor = retorno_cor;
    };*/
};


// geração de cor
function gerarCor(){
    let cor = Math.round(Math.random()*1000000);
    cor = `#${cor}`;
    return cor;
}

// Adição das bolinhas
btnAdd.addEventListener('click', ()=>{
    let qtdBolinhas = inputBolinhas.value
    for(let qtd = 0; qtd < qtdBolinhas; qtd++){
        let novaBolinha = new Bolinha(gerarCor())
        bolas.push('bola')
        novaBolinha.criar()
        console.log(novaBolinha.info())
    }
    console.log(bolas)

})

// redimensionamento do campo
window.addEventListener('resize', ()=>{
    let larguraCampo = campo.offsetWidth;
    let alturaCampo = campo.offsetHeight;
})