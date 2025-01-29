// Coleção tipo CHAVE VALOR

let mapa = new Map();

mapa.set('curso', 'Javascript');
mapa.set(10, 'HTML');
mapa.set(1, 100);
mapa.set('joao', 100);

console.log(mapa)

if(mapa.has('curso')) {
    console.log('Existe na coleção')
}else {
    console.log('A chave não existe na coleção')
}

let busca = 'joao';
let res = '';
if(mapa.has(busca)) {
    res = `Chave encontrada! Valor: ` + mapa.get(busca);
}else {
    res = 'Chave não encontrada na coleção!'
}
res+=`; Tamanho da coleção: ${mapa.size}`;
console.log(res)

mapa.forEach((elem)=>{
    console.log(`Eu sou o elemento: ${elem}`)
})