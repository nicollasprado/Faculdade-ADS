function somar() {
    var n1bruto = window.document.getElementById('in1')
    var n1 = Number.parseInt(n1bruto.value)
    var n2bruto = window.document.getElementById('in2')
    var n2 = Number.parseInt(n2bruto.value)
    var resultado = window.document.getElementById('res')

    let soma = n1 + n2
    resultado.innerHTML = `<h1 id="res">Seu Resultado É: ${soma}</h1>`
}

function subtrair() {
    var n1bruto = window.document.getElementById('in1')
    var n1 = Number.parseInt(n1bruto.value)
    var n2bruto = window.document.getElementById('in2')
    var n2 = Number.parseInt(n2bruto.value)
    var resultado = window.document.getElementById('res')

    let subtracao = n1 - n2
    resultado.innerHTML = `<h1 id="res">Seu Resultado É: ${subtracao}</h1>`
}

function multiplicar() {
    var n1bruto = window.document.getElementById('in1')
    var n1 = Number.parseInt(n1bruto.value)
    var n2bruto = window.document.getElementById('in2')
    var n2 = Number.parseInt(n2bruto.value)
    var resultado = window.document.getElementById('res')

    let multiplicacao = n1 * n2
    resultado.innerHTML = `<h1 id="res">Seu Resultado É: ${multiplicacao}</h1>`
}

function dividir() {
    var n1bruto = window.document.getElementById('in1')
    var n1 = Number.parseInt(n1bruto.value)
    var n2bruto = window.document.getElementById('in2')
    var n2 = Number.parseInt(n2bruto.value)
    var resultado = window.document.getElementById('res')

    let divisao = n1 / n2
    resultado.innerHTML = `<h1 id="res">Seu Resultado É: ${divisao}</h1>`
}

function potencia() {
    var n1bruto = window.document.getElementById('in1')
    var n1 = Number.parseInt(n1bruto.value)
    var n2bruto = window.document.getElementById('in2')
    var n2 = Number.parseInt(n2bruto.value)
    var resultado = window.document.getElementById('res')

    let potencia = n1 ** n2
    resultado.innerHTML = `<h1 id="res">Seu Resultado É: ${potencia}</h1>`
}