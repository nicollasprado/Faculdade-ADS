const numero = document.getElementById('numero');
const btnPromessa = document.getElementById('btnPromessa');

btnPromessa.addEventListener('click', (evento)=>{
    numero.innerHTML = 'Processando...';
    promessaFunc()
        .then((retorno)=>{
            numero.innerHTML=retorno;
            numero.classList.remove('erro');
            numero.classList.add('ok');
        })
        .catch((retorno)=>{
            numero.innerHTML=retorno;
            numero.classList.add('erro');
            numero.classList.remove('ok');
        })
})

const promessaFunc=()=>{
const promessa = new Promise((res_ok, res_erro)=>{
    let resultado = true;
    let tempo = 3000; // 3s
    setTimeout(()=>{
        if(resultado){
            res_ok('Deu Certo!');
        }else{
            res_erro('Deu Errado!');
        }
    },tempo)
})
return promessa;
}

numero.innerHTML = 'Esperando...';