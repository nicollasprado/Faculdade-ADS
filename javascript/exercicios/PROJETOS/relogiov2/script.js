const contador = document.getElementById('contador');

// Testes lógicos
function testes(horas, minutos, segundos){
    horas = horas < 10 ? '0'+horas : horas;
    minutos = minutos < 10 ? '0'+minutos : minutos;
    segundos = segundos < 10 ? '0'+segundos : segundos; 
    contador.innerHTML = `${horas}:${minutos}:${segundos}`;
}

// Função para armazenamento dos dados
const contar=()=>{
    const data = new Date();
    let horas = data.getHours();
    let minutos = data.getMinutes();
    let segundos = data.getSeconds();
    testes(horas, minutos, segundos);
}

// Intervalo
const atualizacao=setInterval(contar,1000);