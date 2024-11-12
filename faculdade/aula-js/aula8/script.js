const pessoa = {  nome : "joão",
                  idade: 30,
                //getNome: function(){return this.nome;},
                //getIdade: function(){return this.idade;}                
                };

                for(let chave in pessoa){
                    alert(chave+ ":"+ pessoa[chave]);
                }

function cumprimento(pessoa){

    return `Olá, meu nome é "${pessoa.getNome()}" 
e eu tenho '${pessoa.getIdade()}' 
anos`
}

const mensagem = cumprimento(pessoa);
//alert(mensagem);

let mensagem1 = ``;
mensagem1+="Isso é a primeira parte. ";
mensagem1+="E aqui está a segunda parte.";
alert(mensagem1);