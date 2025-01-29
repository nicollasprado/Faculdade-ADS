const saudacao = (nome) => alert(`Olá ${nome}`)

const processaEntradaUsuario = (callback) => {
    const nome = prompt('Digite seu Nome')
    callback(nome) // Chama a função 'nome' depois de obter o resultado do prompt
}

const callback = (evento) => alert(`aconteceu um evento ${evento.type}`)

window.addEventListener('click', callback)

processaEntradaUsuario(saudacao)