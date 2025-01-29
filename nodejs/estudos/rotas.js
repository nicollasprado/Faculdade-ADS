const express = require('express');
const app = express();

app.get('/', function(requisicao, resposta){
    resposta.send('Seja bem-vindo ao meu app!')
})

app.get('/sobre', function(req, res){
    res.send('pagina sobre')
})

app.get('/precos', function(req, res){
    res.send('tabela de preços')
})

app.listen(8081, function(){
    console.log(`Servidor rodando na porta 8081!`)
}); // deve ser a ultima linha sempre