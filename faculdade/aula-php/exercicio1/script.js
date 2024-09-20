function toggleSenha() {
    var senhaInput = document.getElementById('senha');
    var icon = document.getElementById('icon');
    if (senhaInput.type === 'password') {
        senhaInput.type = 'text';
        icon.src = 'Oaberto.png';
        icon.alt = 'Ocultar Senha';
    } else {
        senhaInput.type = 'password';
        icon.src = 'Ofechado.png'; 
        icon.alt = 'Mostrar Senha';
    }
}