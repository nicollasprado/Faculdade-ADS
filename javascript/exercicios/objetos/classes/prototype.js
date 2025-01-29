// Serve para adicionar uma propriedade ou um metodo a um objeto (principalmente metodo)

const Nave = function(par_energia){
    this.energia=par_energia;
    this.disparos=100;
}

const n1 = new Nave(100)

/* Nave.vidas = 3 Não funciona*/
Nave.prototype.vidas= 3
Nave.prototype.disparar=function() {
    if(this.disparos <= 0){
        console.log('Sem munição');
    }else {
        this.disparos--
    }
}

n1.disparar();
n1.disparar();
n1.disparar();

console.log(n1.energia)
console.log(n1.disparos)
console.log(n1.vidas)