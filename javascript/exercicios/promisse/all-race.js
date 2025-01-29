const promise1 = new Promise((resolve)=>{
    setTimeout(()=> resolve('promise 1 resolvida!'), 1000)
})

const promise2 = new Promise((resolve)=>{
    setTimeout(()=> resolve('promise 2 resolvida!'), 500)
})

const promise3 = new Promise((resolve)=>{
    setTimeout(()=> resolve('promise 3 resolvida!'), 1500)
})

// retorna tudo de todas promises quando todas forem resolvidas
Promise.all([promise1, promise2, promise3]).then((mensagens)=>{
    console.log(mensagens)
})

// pega a primeira resolvida
Promise.race([promise1, promise2, promise3]).then((mensagem)=>{
    console.log(mensagem)
})