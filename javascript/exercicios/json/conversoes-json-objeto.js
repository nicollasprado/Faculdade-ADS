const pessoa = {
    nome:'pedro',
    canal:'pedro games',
    curso:'javascript',
    aulas:{
        aula1:'introducao',
        aula2:'variaveis',
        aula3:'condicionais',
    }
}

// transformar isso ^^^ em string json
// Objeto para string json = stringify
const str_json = JSON.stringify(pessoa)

// String json para objeto
const obj_json = JSON.parse(str_json)

console.log(pessoa); // Objeto
console.log('');
console.log(str_json); // String json, usada para enviar para API
console.log('');
console.log(obj_json) // Objeto