function salvar(){
   const tarefa = document.getElementById("tarefa").value;
   if (tarefa.trim() !== ""){

       const novatarefa = document.createElement("li");
           novatarefa.textContent = tarefa;

       const listaTarefas = document.getElementById("listadetarefas");

       const botaoconcluido = document.createElement("button");
           botaoconcluido.textContent = ("concluido");
           botaoconcluido.onclick = function(){novatarefa.style.textDecoration = "line-through";};
           novatarefa.appendChild(botaoconcluido);

       const botaoremover= document.createElement("button");
           botaoremover.textContent = ("remover");
           botaoremover.onclick = function(){listaTarefas.removeChild(novatarefa);};
           novatarefa.appendChild(botaoremover);

           listaTarefas.appendChild(novatarefa);

           document.getElementById("tarefa").value = "";
   }else{alert("escreva algo!!!!!!!!");}
}