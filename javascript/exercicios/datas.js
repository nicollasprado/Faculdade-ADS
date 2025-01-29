const data = new Date();
const horas = data.getHours()
const minutos = data.getMinutes()

console.log(`${horas}:${minutos}`)
console.log(Date.now())

/*
Extras:
getDate() = dia do mês
getDay() = dia da semana (número)
getMonth() = 0 -> janeiro, 11 -> dezembro
getTime() = Timestamp (milisegundos desde 1 de janeiro de 1970)
Date.now() = Timestamp (milisegundos desde 1 de janeiro de 1970)
getTimezoneOffset() = timezone da localidade
toDateString() = retorna somente a data
*/