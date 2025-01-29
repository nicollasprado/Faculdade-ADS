// Comunicação entre cliente e servidor

var http = require('http');

// Lista = qual porta de rede vai abrir

let porta = 8081;
http.createServer(function(requisicao, resposta){
    // End = envia mensagem
    resposta.end('Ola')
}).listen(porta);

console.log(`O servidor está ativo! \n Porta aberta: ${porta}`)