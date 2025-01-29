const numero = document.getElementById('numero');

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

// Deu certo = then
promessa.then((retorno)=>{
    numero.innerHTML=retorno;
    numero.classList.remove('erro');
    numero.classList.add('ok');
})

// Deu errado = catch
promessa.catch((retorno)=>{
    numero.innerHTML=retorno;
    numero.classList.add('erro');
    numero.classList.remove('ok');
})