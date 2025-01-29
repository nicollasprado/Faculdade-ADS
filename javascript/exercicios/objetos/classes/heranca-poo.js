class Carro { // Classe PAI / BASE
    constructor(par_nome, par_portas){
        this.nome=par_nome;
        this.portas=par_portas;
        this.ligado=false;
        this.velocidade=0;
        this.cor=undefined;
    }
    ligar=function(){
        return this.ligado=true;
    }
    desligar=function(){
        return this.ligado=false;
    }
    setCor(par_cor){
        return this.cor=par_cor
    }
    setVelocidade(par_velocidade){
        if(this.ligado){
            return this.velocidade=par_velocidade+' km/h';
        }else {
            return this.velocidade='O carro está desligado';
        }
    }
}

// extends = define que é uma herança

class SUV extends Carro{ // Classe FILHO
    constructor(par_nome, par_portas, par_assentos, par_capacidade){
        // Super = invoca o construtor da classe PAI / BASE
        super(par_nome, par_portas);
        this.capacidade=par_capacidade+'kg';
        this.assentos=par_assentos;
    }
}

const c1=new Carro('carro1', 4);
c1.setCor('azul');
c1.setVelocidade(5);
let infoc1 = [c1.nome, c1.portas, c1.cor, c1.velocidade, c1.ligado?'Sim':'Não'];

const c2 = new SUV('SW4', 4, 7, 60,);
c2.setCor('preto');
c2.ligar();
c2.setVelocidade(10);
let infoc2 = [c2.nome, c2.portas, c2.cor, c2.velocidade, c2.ligado?'Sim':'Não'];

console.log(infoc1);
console.log('');
console.log(`Nome: ${infoc1[0]}\nPortas: ${infoc1[1]}\nCor: ${infoc1[2]}\nVelocidade: ${infoc1[3]}\nLigado? ${infoc1[4]}`);
console.log('');
console.log(infoc2);
console.log('');
console.log(`Nome: ${infoc2[0]}\nPortas: ${infoc2[1]}\nCor: ${infoc2[2]}\nVelocidade: ${infoc2[3]}\nLigado? ${infoc2[4]}`);