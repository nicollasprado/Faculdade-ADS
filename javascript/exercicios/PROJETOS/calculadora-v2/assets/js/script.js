const btnSomar = document.getElementById('btnSoma')
const btnSub = document.getElementById('btnSub')
const btnMult = document.getElementById('btnMult')
const btnDiv = document.getElementById('btnDiv')
const res = document.getElementById('inputnumres')

const funcoes = [
    ()=>{
        const valores=[
            document.getElementById('inputnum1').value, 
            document.getElementById('inputnum2').value
        ]
        res.value = Number(valores[0])+Number(valores[1])
    },
    ()=>{
        const valores=[
            document.getElementById('inputnum1').value, 
            document.getElementById('inputnum2').value
        ]
        res.value = Number(valores[0])-Number(valores[1])
    },
    ()=>{
        const valores=[
            document.getElementById('inputnum1').value, 
            document.getElementById('inputnum2').value
        ]
        res.value = Number(valores[0])*Number(valores[1])
    },
    ()=>{
        const valores=[
            document.getElementById('inputnum1').value, 
            document.getElementById('inputnum2').value
        ]
        res.value = Number(valores[0])/Number(valores[1])
    }
]

btnSomar.addEventListener('click', ()=> {funcoes[0]()})
btnSub.addEventListener('click', ()=>{funcoes[1]()})
btnMult.addEventListener('click', funcoes[2])
btnDiv.addEventListener('click', funcoes[3])