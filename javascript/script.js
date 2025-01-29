var num = [1, 9, 5, 3]
num.push(2)

/*
for (let final=0; final < num.length ; final++) {
    console.log(num[final])
}
*/

/* for (let final in num) {
    console.log(`A posição ${final} tem valor ${num[final]}`)
}
*/

var onde = num.indexOf(9)

console.log(`O valor está na posição ${onde}`)

// console.log(`${num} tem ${num.length} elementos`)