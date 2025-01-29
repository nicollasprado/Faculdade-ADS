var produtos = [...document.querySelectorAll('.produto')];
const btnadd = document.getElementById('adicionar');
const btnrmv = document.getElementById('remover');
const esquerda = document.getElementById('esquerda');
const direita = document.getElementById('direita');
const btnnovo = document.getElementById('criarnovo');
const btnexcluir = document.getElementById('excluir')
console.log(produtos);

btnnovo.addEventListener('click', () => {
    let nomeprod = document.getElementById('novo')
    let nomefinal = nomeprod.value
    if(nomefinal == 0) {
        return alert('Nenhum Nome Encontrado')
    } else {
    let novoelemento = document.createElement('p');
    esquerda.appendChild(novoelemento)
    let numprods = produtos.length
    novoelemento.setAttribute('id', `p${numprods+1}`)
    novoelemento.innerText = nomefinal
    novoelemento.setAttribute('class','produto')
    alert(`O Produto ${nomefinal} Foi Adicionado Com Sucesso!`)
    let novosprodutos = [...document.querySelectorAll('.produto')];
    novoelemento.addEventListener('click', (x) => {
            novoelemento.classList.toggle('destaque')
    })
}
})

produtos.map((elemento) => {
    elemento.addEventListener('click', (evento) => {
        const selecionado = evento.target;
        selecionado.classList.toggle('destaque');
    })
})

btnadd.addEventListener('click', () => {
    const prodselecionados = [...document.querySelectorAll('.destaque')];
    if(prodselecionados.length === 0) {
        return alert('Nenhum Produto Selecionado!');
    }else {
        prodselecionados.map((prodselec) => {
            direita.appendChild(prodselec)
        })
    }
})

btnrmv.addEventListener('click', () => {
    const prodselecionados = [...document.querySelectorAll('.destaque')];
    if(prodselecionados.length === 0) {
        return alert('Nenhum Produto Selecionado!');
    }else {
        prodselecionados.map((selecionado)=> {
            esquerda.appendChild(selecionado);
        })
    }
})

btnexcluir.addEventListener('click', (evento) => {
    const prodselecionados = [...document.querySelectorAll('.destaque')];
    const prodselecionado = document.querySelector('.destaque')
    const divisao = document.getElementById('exclusao')
    if(prodselecionados.length === 0) {
        return alert('Nenhum Produto Selecionado!')
    }else if(prodselecionados.length > 1) {
        return alert('Só é Possível Excluir um Produto por Vez!')
    }else if(divisao.children.length == 3){
        return
    }else{
        //input para confirmação
        var confirmar = document.createElement('input')
        confirmar.setAttribute('type', 'text')
        confirmar.setAttribute('id', 'confirmacaoexcl')
        confirmar.setAttribute('name', 'excl')
        confirmar.setAttribute('placeholder', 'digite o nome do produto')
        //botao confirmar
        var confbtn = document.createElement('button')
        confbtn.setAttribute('id', 'confirmacaoexcl')
        confbtn.setAttribute('class', 'confirmarbtn')
        confbtn.innerText='CONFIRMAR'
        divisao.appendChild(confirmar)
        divisao.appendChild(confbtn)
        divisao.classList.add('exclusao2')
        console.log(prodselecionado.innerText)

        confbtn.addEventListener('click', ()=> {
            let input = document.getElementById('confirmacaoexcl')
            let btnreverter = document.createElement('button')
            const prodselecionado = document.querySelector('.destaque')
            if  (input.value === prodselecionado.innerText) {
                prodselecionado.remove()
                divisao.removeChild(input)
                divisao.removeChild(confbtn)
                divisao.classList.remove('exclusao2')
                // Botão reverter
                btnreverter.innerText='Reverter'
                btnreverter.setAttribute('id', 'btnreverter')
                divisao.appendChild(btnreverter)
                btnreverter.addEventListener('click', ()=> {
                    esquerda.appendChild(prodselecionado)
                    divisao.removeChild(btnreverter)
                })
            } else {
                return alert('Nome do Produto Mal Digitado')
            }
        })
    }
})

/* OUTRA MANEIRA -> ('.produto:not(.destaque)')];

btnadd.addEventListener('click', () => {
    const prodselecionados = [...document.querySelectorAll('.destaque')];
    const prodnaoselecionados = [...document.querySelectorAll('.produto:not(.destaque)')];
        prodselecionados.map((prodselec) => {
            direita.appendChild(prodselec)
        })
        prodnaoselecionados.map((prodnaoselec) => {
            esquerda.appendChild(prodnaoselec) 
        })
})
*/