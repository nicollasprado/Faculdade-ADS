function aluno(nome, nota) {
    this.nome = nome // this.nome é uma variavel que declarada para a função aluno recebe o valor do parametro nome
    this.nota = nota

    this.dados = function() {
        setTimeout(() => {
            console.log(this.nome)
            console.log(this.nota)
        }, 2000)
    }

    this.dados=() => {
        console.log(this.nome)
        console.log(this.nota)
    }
}
const inicio = new aluno('Bruno',100)
const inicio2 = new aluno('Pedro', 78)
inicio.dados()
inicio2.dados()