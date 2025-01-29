// Copiar = navigator.clipboard.write()

const teclaCopiar = document.getElementById('teclaCopiar');
teclaCopiar.addEventListener('click', ()=>{
    navigator.clipboard.writeText(Display.innerText);
})

// Colar = navigator.clipboard.read

const teclaColar = document.getElementById('teclaCopiar2');
teclaCopiar.addEventListener('click', ()=>{
    navigator.clipboard.readText(Display.innerText);
})

// Acessibilidade MOBILE em inputs
const input = document.querySelector('input')
teclaCopiar.addEventListener('click', ()=>{
    input.select()
    input.setSelectionRange(0,99999)
    navigator.clipboard.writeText(input.value);
})