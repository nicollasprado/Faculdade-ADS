class Carro{
    constructor(pnome, ptipo){
        this.nome=pnome;
        if(ptipo == 1){
            this.tipo='Esportivo';
            this.velmax=300;
        }else if(ptipo == 2){
            this.tipo='SUV';
            this.velmax=180;
        }else if(ptipo == 3){
            this.tipo='Passeio';
            this.velmax=120;
        }else {
            this.tipo='Militar';
            this.velmax=160;
        }
    }
    getNome(){
        return this.nome;
    }
    getTipo(){
        return this.tipo;
    }
    getVelMax(){
        return this.velmax;
    }
    getInfo(){
        return [this.nome, this.tipo, this.velmax];
    }
    setNome(nome){
        return this.nome=nome;
    }
    setTipo(tipo){
        return this.tipo=tipo;
    }
    setVelMax(velmax){
        return this.velmax=velmax;
    }
    info(){
        console.log(`Nome: ${this.nome}`);
        console.log(`Tipo: ${this.tipo}`);
        console.log(`V.Máxima: ${this.velmax}`);
        console.log('------------------------');
    }
}

let c1 = new Carro('McLaren', 1);
let c2 = new Carro('SW4', 2);
let c3 = new Carro('Ural', 3);

c1.setNome('Buggati');
console.log(c1.getNome());
//c1.info();
//console.log(c1.Array())
//console.log(c1.Array()[0])

