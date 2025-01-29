// Método callback
const statusPantera = 'entediado';

function isPanteraFeliz(callback, erroCallback) {
    switch(statusPantera){
        case 'feliz':
            callback({
                mensagem: 'Feliz'
            });
            break;
        case 'entediado':
            erroCallback({
                mensagem: 'Entediado'
            });
            break;
        case 'triste':
            erroCallback({
                mensagem: 'triste'
            });
            break;
        default:
            erroCallback({
                mensagem: 'indefinido emocionalmente'
            });
    }
}

isPanteraFeliz(
    (response) => console.log(`Tudo certo. Pantera está ${response.mensagem}`),
    (error) => console.log(`Deu ruim... Pantera está ${error.mensagem}`)
)


// Tranformando em Promise
const statusTigre = 'feliz';

const isTigreFeliz = new Promise((resolve, reject)=>{
    switch(statusTigre){
        case 'feliz':
            resolve({
                mensagem: 'Feliz'
            });
            break;
        case 'entediado':
            reject({
                mensagem: 'Entediado'
            });
            break;
        case 'triste':
            reject({
                mensagem: 'triste'
            });
            break;
        default:
            reject({
                mensagem: 'indefinido emocionalmente'
            });
    }
}) 

isTigreFeliz.then((response)=>{
    return {mensagem: response.mensagem}
}).then((response)=>{
    return {mensagem: `Tigre está ${response.mensagem}`}
}).then((response)=>{
    console.log(`Deu certo. ${response.mensagem}!`)
})
.catch((error)=>{
    console.log(`Deu ruim... Tigre está ${error.mensagem}`)
})