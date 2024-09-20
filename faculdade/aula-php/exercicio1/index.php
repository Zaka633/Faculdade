<?php

    $idade = $_GET['idade'];
    $nome =  $_GET['nome'];
    $date1 = new DateTime();
    $idade2= DateTime::createFromFormat('Y-m-d', $idade);
    if ($idade2 === false) {
        echo "Data de nascimento inválida.";
        exit;
    }
    
 
    $date2 = $idade2;
    $date3 = $date1 ->diff($date2)->y ;


     


    echo "<h1> Resultado </h1>";
    echo "<p> 
                <h2> Olá $nome Seja bem-vindo.
                você tem $date3 anos de idade.
                
                </h2> 
            
            </p>  ";

    echo "<h2> Bora fuder tudo.</h2>";
    echo "<a href='index.html'>voltar</a>"
 
?> 
