const contato={
    nome:"",
    fone: "",
    setNome: function(nom) {this.nome=nom;},
    getNome:function(){return this.nome;},
    setFone:function(fon){this.fone = fon;},
    getFone: function(){return this.fone;}
};

const btao= document.getElementById("salvar");

btao.addEventListener("click", function(){
contato.setNome(document.getElementById("nome").value);
contato.setFone(document.getElementById("telefone").value);

const divresposta= document.getElementById("resposta");
const paragrafo= document.createElement("p");
    paragrafo.textContent= "contato salvo";
    divresposta.appendChild(paragrafo);
});

const mstr= document.getElementById("mostrar");
mstr.addEventListener("click", function(){
    const divdmostrar= document.getElementById("dmostrar");
    const paragrafo= document.createElement("p");
    paragrafo.textContent="nome: "+contato.getNome()+" telefone "+contato.getFone();

    divdmostrar.appendChild(paragrafo);
});