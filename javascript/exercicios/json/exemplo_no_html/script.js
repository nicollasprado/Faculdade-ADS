const obj_pessoas = [
    {
        "nome" : "Pedro",
        "idade" : 23,
        "esta_trabalhando" : false,
        "hobbies" : ["programar", "estudar"],
        "detalhes_estudos" : {
            "curso" : "javascript",
            "professor" : "matheus"
        },
        "horas_estudo" : 8
    },
    {
        "nome" : "Lucas",
        "idade" : 19,
        "esta_trabalhando" : true,
        "hobbies" : ["programar", "academia"],
        "detalhes_estudos" : {
            "curso" : "php",
            "professor" : "matheus"
        },
        "horas_estudo" : 9.5
    }
]

// Conversão
const json_pessoas = JSON.stringify(obj_pessoas);
const json_p_objeto = JSON.parse(json_pessoas);

json_p_objeto.map((pessoa) =>{
    console.log(pessoa.nome)
})

console.log(json_pessoas);
console.log('');
console.log(typeof json_pessoas)