const destino = {
    a: 1,
    b: 2
}

const origem = {
    b: 4,
    c: 5
}

// Object.assign(target, source)
const destinoRetornado = Object.assign(destino, origem); 
// Retorna a juncao dos dois parametros, podendo alterar o target também
// Geralmente utilizado para gerar uma cópia
console.log(destinoRetornado, destino)

// Cópia de objetos
const obj = {
    a: 1
};

const copia = Object.assign({}, obj) // Origem está sendo copiada para um objeto vazio, criando uma cópia


// Mesclagem de objetos
const o1 = {a: 1};
const o2 = {b: 2};
const o3 = {c: 3};

const mesclagem = Object.assign(o1, o2, o3); 
// Concatenação de objetos e gerar um objeto novo
// o1 vai receber os conteudos dos outros objetos

console.log(mesclagem, o1)

// Maneira segura
const mesclagemSEGURA = Object.assign( {}, o1, o2, o3); 
// O objeto vazio que recebe o valor dos outros