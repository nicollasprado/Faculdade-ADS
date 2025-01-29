class Pessoa {
    constructor(pnome){ // Automaticamente chamado quando instânciamos um novo objeto dessa classe
        this.nome=pnome
        // this.nome="adriano"
    }
}

let p1 = new Pessoa('pedro') // () faz ligação direta com o construtor da classe
// O NEW instancia um novo objeto da classe chamada
let p2 = new Pessoa('Caio')
let p3 = new Pessoa('Joao')

console.log(p1.nome)
console.log(p2.nome)
console.log(p3.nome)