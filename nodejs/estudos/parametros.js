// forma de tornar as rotas dinamicas
const express = require('express');
const app = express();

app.get('/', function(requisicao, resposta){
    resposta.send('Seja bem-vindo ao meu app!')
})

// o ":" cria um parametro
app.get('/ola/:nome/:cargo', function(req, res){
    // só pode utilizar o send uma vez
    res.send(`<h1>Ola ${req.params.nome}, seu cargo: ${req.params.cargo}</h1>`)
})

app.listen(8081, function(){
    console.log(`Servidor rodando na porta 8082!`)
}); // deve ser a ultima linha sempre