const inputnome = document.getElementById('inputnome')
const inputsenha = document.getElementById('inputsenha')
const divres = document.getElementById('resultado')
const btnadd = document.getElementById('btnadd')

// Importante para entender Objetos Literais

function Pessoa(parnome, parsenha, parid){
    this.nome=parnome,
    this.senha=parsenha,
    this.id=parid,
    this.getNome=function(){
        return this.nome
    },
    this.getSenha=function(){
        return this.senha
    }
}

let usuarios = []

const addPessoa=()=>{
    divres.innerHTML='<h1>Usuários Cadastrados</h1>'
    usuarios.map((usu)=>{
    const NovoUsu = document.createElement('div')
    NovoUsu.setAttribute('class', 'pessoa')
    NovoUsu.innerHTML = `Nome: ${usu.getNome()}<br> Senha: ${usu.getSenha()}`
    divres.appendChild(NovoUsu)
  /* let NUnome = document.createElement('p')
    let NUsenha = document.createElement('p')
    NUnome.innerHTML = `Nome:  <strong>${usuario.nome}</strong>`
    NUsenha.innerHTML = `Senha:  <strong>${usuario.senha}</strong>`
    NovoUsu.appendChild(NUnome)
    NovoUsu.appendChild(NUsenha)
    divres.appendChild(NovoUsu)
    */
    })
}

btnadd.addEventListener('click', ()=>{
    let nome = inputnome.value
    let senha = inputsenha.value
    const usuario = new Pessoa(nome, senha)
    usuarios.push(usuario)
    nome=''
    senha=''
    inputnome.focus()
    console.log(usuarios)
    addPessoa()
})

/*
btnadd.addEventListener('click', ()=>{
    let nome = inputnome.value;
    let senha = inputsenha.value;
    let novousu = document.createElement('p')
    console.log(nome)
    console.log(senha)
    divres.appendChild(novousu)
})
*/