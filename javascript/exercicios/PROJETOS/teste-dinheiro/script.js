var gasto = 0
var dinheiro = 30


function comprar() {
    var dinheirotxt = window.document.getElementById('carteira')
    if (dinheiro <= 0) {
        return
    } else {
        gasto++
    }
    let dinheiro2 = 30 - gasto
    if (dinheiro2 <= -1) {
        alert('voce nao tem dinhero suficiente')
    } else
    dinheirotxt.innerHTML = `<h2 id="carteira">Carteira: ${dinheiro2} </h2>`  
}