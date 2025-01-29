/* function somar(...valores) {    
    let quantidade = valores.length
    let res = 0
    for (let i=0; i<quantidade; i++) {
        res += valores[i]
    }
    return res
}

console.log(somar(1, 5, 9))
*/

function somar(...valores) {
    let res = 0
    for (i of valores) {
        res+= i
    }
    return res
}

console.log(somar(10,5,6))