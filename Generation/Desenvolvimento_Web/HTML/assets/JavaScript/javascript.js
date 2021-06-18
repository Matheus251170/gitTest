let nome = document.querySelector("#nome");
let email = document.querySelector("#email");
let mensagem = document.querySelector("#mensagem");
let mapa = document.querySelector("#mapa");
let nomeOk = false;
let emailOk = false;
let mensagemOk = false;


function validaNome(){

    if(nome.value.length < 3){

        let msg = document.querySelector("#txtNome");

        msg.innerHTML = "Nome inválido!"
        msg.style.color = "red";
    }
    else{
        
        let msg = document.querySelector("#txtNome");
        msg.innerHTML = '';
        nomeOk = true;
    }
}


function validaEmail(){

    if(email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1){

        let msg = document.querySelector("#txtEmail");

        msg.innerHTML = "Email inválido!";
        msg.style.color = "red";
    }
    else{

        let msg = document.querySelector("#txtEmail");
        msg.innerHTML = '';
        emailOk = true;
    }
}

function validaMensagem(){

    let msg = document.querySelector("#txtMensagem");

    if(mensagem.value.length < 10){

        msg.innerHTML = "Insira um texto válido!";
        msg.style.color = "red";
        msg.style.display = "block";
    }
    else if(mensagem.value.length >= 250){

        msg.innerHTML = "texto muito grande! Limite máximo de 250 caracteres!";
        msg.style.color = "red";
        msg.style.display = "block";
    }
    else{
        msg.style.display = "none";
        
        mensagemOk = true;
    }
}


function enviar(){

    if(nomeOk == true && emailOk  == true && mensagemOk == true){

        alert("Formulário enivado com sucesso!");
    }
    else{
        alert("Preencha todos os campos!");
    }
}

function mapaZoom(){

    mapa.style.width = "800px";
    mapa.style.height = "600px";
}

function mapaNormal(){

    mapa.style.width = "450px";
    mapa.style.height = "300px";
}