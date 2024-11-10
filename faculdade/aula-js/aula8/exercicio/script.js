function saudacaoDoDia(hora){
    let saudacao;
if(12>= hora >= 5){
    saudacao="bom dia";
}else if(18>= hora > 12){
    saudacao= "boa tarde";
}else{saudacao="boa noite"};
return`${saudacao}, seja bem vindo`;
}

console.log(saudacaoDoDia(17));

const numero= 1e1;
console.log(typeof numero, numero);