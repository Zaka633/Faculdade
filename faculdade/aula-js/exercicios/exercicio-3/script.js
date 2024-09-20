const calcularfin = document.getElementById("calcularfin");
const btao = document.getElementById("btao");

btao.addEventListener("click", function() {
        const vlrsalario = document.getElementById("vlrsalario").value;
        const vlrfinanc = document.getElementById("vlrfinac").value;

        console.log(vlrsalario)
        console.log(vlrfinanc)


        if( vlrfinanc -= 5* vlrsalario){  calcularfin.appendChild("financiamento concedido")
        calcularfin.appendChild("Obrigado por nos consultar")}

        else{calcularfin.appendChild("financiamento negado")
        calcularfin.appendChild("Obrigado por nos consultar")
};


    });






