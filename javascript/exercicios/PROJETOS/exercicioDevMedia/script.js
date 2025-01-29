const inputUsuario = document.getElementById('inputUsuario');
const inputSenha = document.getElementById('inputSenha');
const btnLogar = document.getElementById('btnLogar');

// Dados Armazenado
const usuarioCorreto = 1234;
const senhaCorreta = 9999;

// Testes Lógicos
const testarUsuario=() =>{
    if(inputUsuario.value == undefined || null){
        alert('Digite um Usuario Válido!');
    }else if(inputUsuario.value != usuarioCorreto){
        alert('Usuário Incorreto!');
    }else {
        return true;
    }
}

const testarSenha=() =>{
    if(inputSenha.value == undefined || null){
        alert('Digite uma Senha Válida!');
    }else if(inputSenha.value != senhaCorreta){
        alert('Senha Incorreta!');
    }else {
        return true;
    }
}

const testeGeral=()=>{
    if(testarUsuario() && testarSenha() == true) {
        alert('Acesso Permitido!');
    }
}

// Evento Clicar no Botão
btnLogar.addEventListener('click', ()=>{
    testeGeral();
})