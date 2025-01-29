// O STATIC torna um valor igual para todas as instâncias(filhos) da classe
// Ele define o membro(metodo ou atributo) a classe e nao as instancias

class Npc {
    static alerta=false;
    constructor(par_energia){
        this.energia=par_energia;
    }
    info=function(){
        console.log(`Energia: ${this.energia}`);
        console.log(`Alerta: ${Npc.alerta?'Sim':'Não'}`);
    }
    static alertar=function(){ // Função para o PAI e não para os FILHOS
        Npc.alerta = true;
    }
}

const npc1 = new Npc(10);
const npc2 = new Npc(45);
const npc3 = new Npc(100);

Npc.alertar()

npc1.info()
npc2.info()
npc3.info()