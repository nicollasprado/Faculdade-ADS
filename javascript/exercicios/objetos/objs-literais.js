// Não possui objetos independentes

const Pessoa={
    nome:'Bruno',
    getNome:function(){
        return this.nome
    },
    setNome:function(nome){
        this.nome=nome
    }
}

const p2 = Pessoa
const p3 = Pessoa

p2.nome = 'Isaque'
p3['nome']= 'Luiz'
Pessoa.setNome('Bernardo')

console.log(Pessoa.nome)
console.log(p2.getNome())
console.log(p3.nome)