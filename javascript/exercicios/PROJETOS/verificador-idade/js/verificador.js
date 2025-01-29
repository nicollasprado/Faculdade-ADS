var data = new Date()
var anoatual = data.getFullYear()
var ano100 = anoatual - 100
var ano = window.document.getElementById('idata')
var sexo = window.document.getElementsByName('sexo')
var anonum = Number(ano.value)

function verificar() {
    if (anonum > anoatual) {
        alert('Preencha sua idade corretamente')
        return
    } else {
    var anofinal = anoatual - Number.parseInt(ano.value)
    var restxt = window.document.getElementById('resultadotxt')
    var resimg = window.document.getElementById('resultadoimg')
    if (sexo[0].checked) {
        var sexofinal = 'Homem'
    } else if (sexo[1].checked){
        var sexofinal = 'Mulher'
    } else {
        alert('Preencha o Campo de Sexo!')
        return
    }
    restxt.innerHTML = `<h2>Identificado: Você é ${sexofinal} e tem ${anofinal} anos!</h2>`
    if (anofinal > 0 && anofinal < 12) {
        resimg.src = 'imagens/crianca.jpg'
    } else if (anofinal >= 12 && anofinal < 18) {
        resimg.src = 'imagens/jovem.jpg'
    } else if (anofinal >= 18 && anofinal < 60 ) {
        resimg.src = 'imagens/adulto.jpg'
    } else if (anofinal >= 60) {
        resimg.src = 'imagens/idoso.jpg'
    }
    }
}