function Pessoa(nome, idade){
    this.nome = nome;
    this.idade = idade;
}

Pessoa.prototype.saudacao = function(){
    console.log(`Olá, meu nome é ${this.nome} e tenho ${this.idade} anos.`);
};


const pessoa1 = new Pessoa('Ana', 30);
const pessoa2 = new Pessoa('João', 25);

pessoa1.saudacao();
pessoa2.saudacao();