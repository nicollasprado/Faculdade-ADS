const olhos = document.getElementById('olhos')

let posx = 0;
let posy = 0

window.addEventListener('mousemove', (evento)=>{
    posx = evento.clientX;
    posy = evento.clientY
    console.log(posx, posy)
    const rotacao = Math.atan2(posx, posy)* 180/Math.PI
    olhos.style.transform="rotate("+rotacao+"deg)"
})