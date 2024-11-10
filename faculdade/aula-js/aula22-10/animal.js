class Animal{
    constructor(tipo){
        this.tipo = tipo;
    }

    emitirSom(){
        console.log(`O ${this.tipo} faz um som.`);
    }
}
class Gato extends Animal{
    constructor(nome){
        super('gato');
        this.nome = nome;
    }
    miar(){
        console.log(`${this.nome} está miando. `);
    }
}

const meuGato = new Gato('Bolinha');
meuGato.emitirSom();
meuGato.miar();