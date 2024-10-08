function salvar()
    {const tarefa = document.getElementById("tarefa").value;

     const novatarefa = document.createElement("li");
        novatarefa.textContent = tarefa;

     const botaoconcluido = document.createElement("button");
        botaoconcluido.textContent("concluido");
        botaoconcluido.onclick = function(){novatarefa.style.textDecoration = "line-through";};
        novatarefa.appendChild(botaoconcluido);

     const botaoremover= document.createElement("button");
        botaoremover.textContent("remover");
        botaoremover.onclick = function(){listaTarefas.removeChild(novatarefa);};
        novatarefa.appendChild(botaoremover);

     const listaTarefas = document.getElementById("listadetarefas");
        listaTarefas.appendChild(novatarefa);

     document.getElementById("tarefa").value = "";
    }
