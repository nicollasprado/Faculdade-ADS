// Forma de trabalhar com HERANÇA em CLASSES

const animal = {
    som: 'um som de aniaml',
    tipo: 'animal',
    emitirSom: function(){
        console.log(this.som)
    }
}

const gato = {
    tipo: 'gato',
    som: 'miau'
}

Object.setPrototypeOf(gato, animal);
gato.emitirSom()

const animalRaivoso = {
    tipo: 'AnimalRaivoso',
    somForte: function(){
        console.log(this.som.toUpperCase())
    }
}

Object.setPrototypeOf(gato, animalRaivoso);
gato.somForte()