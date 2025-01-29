const frutas = ['Pera', 'maçã', 'banana']
frutas.map((el,i) => {
    console.log(`Fruta: ${el}; Posição: ${i} `)
})


const frutas2 = ['Pera', 'maçã', 'banana']
let x = frutas2.map((el,i) => {
        return `Fruta ${el} é boa`
})

console.log(x)


// por algum motivo nao funcionou
const frutashtml = document.getElementsByClassName("d")
frutashtml.map((obj) => {
    console.log(obj)
})