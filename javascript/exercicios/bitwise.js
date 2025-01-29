let n1 = 11
let n2 = 10

/* 11 = 00001011 e 
   10 = 00001010
   res = 00001010 = 10
*/
let res = n1 & n2

console.log(res)



let res2 = n1 | n2

/* 11 = 00001011 e 
   10 = 00001010
   res = 00001011 = 10
*/

console.log(res2)


let res3 = n1 ^ n2 //onde tem equivalencia retorna 0
/* 11 = 00001011 e 
   10 = 00001010
        00000001 = 1
*/

console.log(res3)


let res4 = n2 << 1 //desvia um pitch para esquerda, dobrando o valor

/* 10 = 00001010
        00010100 = 10
*/

console.log(res4)

let res5 = n2 >> 1 //desvia um pitch para direita, divindo pela metade o valor
/* 10 = 00001010
        00000101 = 5
*/

console.log(res5)