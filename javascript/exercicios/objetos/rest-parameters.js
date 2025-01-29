// ... = coleta os parametros e coloca-os em uma array
// Os outros parametros devem ser parametros normais

const somaInfinita3 = (...args) => args.reduce((valAntigo, valAtual) => valAntigo += valAtual);

console.log(`Array: ${somaInfinita3(1, 2, 3, 4, 5)}`);

// Exemplo Multiplicador
const multiplicaPeloPrimeiro = (multiplicador, ...args) => args.map((valor) => valor * multiplicador)

console.log(`Array: ${multiplicaPeloPrimeiro(2, 1, 2, 3, 4, 5)}`);