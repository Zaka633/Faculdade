const novoElemento = document.createElement("div");
novoElemento.textContent="este é um novo elemnto";
novoElemento.classList.add("classe-exemplo");
novoElemento.style.color = "blue";
const container= document.getElementById("container");
container.appendChild(novoElemento);
const elementoARemover = document.querySelector(".classe-exemplo");
        container.removeChild(elementoARemover);
        const addelemento = document.getElementById("addelemento");
    