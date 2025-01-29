const numeros = [10, 5, 28, 13]

const FiltroMaisDez=(valor, indice, array)=> {
    if(valor >= 10) {
        return valor
    }
}

const maisdedez = numeros.filter(FiltroMaisDez)

console.log(maisdedez)