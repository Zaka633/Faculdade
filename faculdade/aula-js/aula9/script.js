butt.addEventListener("click", function(){
    const nome = document.getElementById("nome").value;
    const email = document.getElementById("email").value;  
    const pessoa = {
        nome,
        email
    };
    const jsonUsuario = JSON.stringify(pessoa);
    localStorage.setItem("JSONsalvo", jsonUsuario);
    const resultadoDiv = document.getElementById("resultado");
    resultadoDiv.innerHTML=`<p> Usuário em JSON: ${jsonUsuario}</p>`;
    });

    btrecuperar.addEventListener("click", function(){    
    const strRecuperada = localStorage.getItem("JSONsalvo");
    const objetoJS = JSON.parse(strRecuperada);
    for(let chave in objetoJS){
    console.log(chave+":"+objetoJS[chave])};
if(strRecuperada === null){

    alert("não tem nada recuperado seu corno!")
    
    }else{
        const recuperadoDiv = document.getElementById("recuperado");
    recuperadoDiv.innerHTML=`<p> Usuário Recuperado em JSON: ${strRecuperada}</p>`;
    }
});

limpar.addEventListener("click", function(){
const limpar= localStorage.clear();
});



    

