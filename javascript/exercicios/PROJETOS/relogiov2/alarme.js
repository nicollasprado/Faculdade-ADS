const inputAlarme = document.getElementById('inputAlarme');
const alarmeTxt = document.getElementById('alarmeTxt');
const btnAtivar = document.getElementById('btnAtivar');
const btnParar = document.getElementById('btnParar');
const alarmeSom = new Audio('alarme.mp3');
alarmeSom.loop= -1;

// Horários
let timestamp_atual = undefined; 
let timestamp_alarme = undefined; // ts atual + o tempo do alarme
let alarme_ativado = false;
let alarme_tocando = false;

// Testa se o som está tocando
function testarSom(){
    if(alarme_tocando){
        alarmeSom.play();
    }else{
        alarmeSom.pause();
        alarmeSom.currentTime = 0;
    }
}

// Teste caso a hora/minuto/segundo tenha um 0 antes
let horaTestada = undefined;
let minutoTestado = undefined;
let segundoTestado = undefined;
function testar0(hora, minuto, segundo){
    horaTestada = hora< 10 ? '0'+hora : hora;
    minutoTestado = minuto < 10 ? '0'+minuto : minuto;
    segundoTestado = segundo < 10 ? '0'+segundo : segundo;
}

// Testa se já tem um alarme em andamento
function testarFuncionamento(){
    if(alarme_ativado){
        alert('Um Alarme já foi Definido!');
    }else{
        alarmeTxt.innerText = `${horaTestada}:${minutoTestado}:${segundoTestado}`;
        getDelay();
        alertaFunc()
            .then((retorno)=>{
                inputAlarme.value = '';
                alarmeTxt.innerText = '';
                alarme_ativado = false;
                alarme_tocando = true;
                testarSom();
                alert(retorno);
    })
            .catch((retorno)=>{
                alert(retorno);
            });
        return alarme_ativado = true;
    }
}

// Evento ao clicar no botao
btnAtivar.addEventListener('click', ()=>{
    timestamp_atual = Date.now();
    timestamp_alarme = timestamp_atual + (inputAlarme.value * 1000);
    const data_alarme = new Date(timestamp_alarme);
    let horas = data_alarme.getHours();
    let minutos = data_alarme.getMinutes();
    let segundos = data_alarme.getSeconds();
    testar0(horas, minutos, segundos);
    testarFuncionamento();
})


// Armazenamento do delay para o Alarme
let delay = undefined;
function getDelay(){
    delay = inputAlarme.value*1000;
}

// Função Alertar
const alertaFunc=()=>{
const alerta = new Promise((res_ok, res_falha)=>{
    let tempo = delay;
    setTimeout(()=>{
            res_ok('O alarme chegou a 0');
            res_falha('Algo deu Errado!');
    },tempo)
})
return alerta;
}

// Funcionamento botão parar
btnParar.addEventListener('click', ()=>{
    alarme_tocando = false;
    testarSom();
})