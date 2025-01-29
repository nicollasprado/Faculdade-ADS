class CarroPadrao{
    constructor(){
        if(this.constructor === CarroPadrao){ // torna a classe abstrata
            throw new TypeError('Esta classe não pode ser instanciada')
        }
        if(this.ligar === undefined){
            throw new TypeError('É obrigatório implementar o método ligar')
        }
        if(this.desligar === undefined){
            throw new TypeError('É obrigatório implementar o método desligar')
        }
        this.rodas = 4;
        this.portas = 4;
        this.ligado = false;
    }
}

class Carro extends CarroPadrao{
    constructor(par_tipo, parEstagioTurbo){
        super()
        this.turbo = new Turbo(parEstagioTurbo);
        if(par_tipo == 1){
            this.velMax = 120;
            this.nome = 'Normal';
        }else if(par_tipo == 2){
            this.velMax = 150;
            this.nome = 'Esportivo';
        }else if(par_tipo == 3){
            this.velMax == 200;
            this.nome = 'Corrida';
        }
        this.velMax += this.turbo.potencia;
    }
    info(){
        console.log(`Nome: ${this.nome}`)
        console.log(`VelMax: ${this.velMax}`)
        console.log(`Turbo: ${this.turbo.potencia}`)
        console.log(`Rodas: ${this.rodas}`)
        console.log(`Portas: ${this.portas}`)
        console.log(`Ligado? ${this.ligado}`)
        console.log('----------')
    }
    ligar(){
        this.ligado = true;
    }
    desligar(){
        this.ligado = false;
    }
}

class Turbo{
    constructor(estagio){
        if(estagio == 0){
            this.potencia=0;
        }else if(estagio == 1){
            this.potencia=50;
        }else if(estagio == 2){
            this.potencia=75;
        }else if(estagio == 3){
            this.potencia=100;
        }
    }
}

class CarroEspecial extends Carro{
    constructor(parEstagioTurbo){
        super(4, parEstagioTurbo);
        this.nome = 'Carro Especial';
        this.velMax = 300+this.turbo.potencia;
    }
    /*
    info(){ 
        super.info() // para pegar a funcao do pai
    }
    */
   info(){
    console.log(`Carro Especial: ${this.nome}`)
    console.log(`Velocidade Absurda de: ${this.velMax}`)
    console.log(`Turbo: ${this.turbo.potencia}`)
    console.log(`Rodas: ${this.rodas}`)
    console.log(`Portas: ${this.portas}`)
    console.log(`Ligado? ${this.ligado}`)
    console.log('----------')
   }
}

const c1 = new Carro(2, 0);
const c2 = new Carro(1, 3);
const c3 = new CarroEspecial(1);
// const c4 = new CarroPadrao();

c1.info();
c2.info();
c3.info();