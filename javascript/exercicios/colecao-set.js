// Não permite entradas duplicadas de elementos

const itens = new Set(); // OU
const itens2 = new Set(['item1', 'item2', 'item3'])

itens.add('itema')
itens.add('itemb')
itens.add('itemc')
itens.add('itema') // nao adicionou pois ja existe na coleção

console.log(itens)
console.log('')
console.log(itens2)