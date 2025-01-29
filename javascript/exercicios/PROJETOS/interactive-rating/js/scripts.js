const btn = [...document.querySelectorAll('.nota-botao')]
const btnsubmit = document.getElementById('btn-submit')
//const elementos = Array.from(btn)
console.log(btn)
btn.map((el) => {
    el.addEventListener("click", (evento)=>{
        let btnclicados = [...document.querySelectorAll('.destaque')]
        let el = evento.target
        if(btnclicados.length === 1) {
            let btnclicado = document.querySelector('.destaque')
            btnclicado.classList.remove('destaque')
            el.classList.add('destaque')
        }
        el.classList.add('destaque')
    })
})
