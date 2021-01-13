let nome = window.document.getElementById("nome")
let email = document.querySelector("#email")
let assunto = document.querySelector("#assunto")
let nomeOK = false
let emailOK = false
let assuntoOK = false
let mapa = document.querySelector("#mapa")

nome.style.width = "100%"
email.style.width = "100%"
assunto.style.width = "100%"

function validaNome() {
    let txtNome = document.querySelector("#txtNome")
    if (nome.value.length < 3 ){
        txtNome.innerHTML ="Nome inválido"    
        txtNome.style.color = "red"   
    }else{
        txtNome.innerHTML = "Nome Válido"
        txtNome.style.color = "green" 
        nomeOK = true  
    }
}

function validaEmail() {
    let txtEmail = document.querySelector("#txtEmail")
    if (email.value.indexOf ("@") == -1){
        txtEmail.innerHTML ="Email inválido"    
        txtEmail.style.color = "red"   
    }else{
        txtEmail.innerHTML = "Email Válido"
        txtEmail.style.color = "green"   
        emailOK=true
    }
}

function validaAssunto() {
    let txtAssunto = document.querySelector("#txtAssunto")
    if (assunto.value.length >=100){
        txtAssunto.innerHTML ="Texto excede limite, digite no máximo 100 caracteres"    
        txtAssunto.style.color = "red" 
        txtAssunto.style.display = "block"  
    }else{
        txtAssunto.style.display = "none"
        assuntoOK = true
    }
}

function enviar(){
    if (nomeOK == true && emailOK == true && assuntoOK == true){
        alert ("Formulário enviado com sucesso !")
    } else{
        alert ("Preencha corretamento o formulário antes de enviar !")
    }
}

function mapaZoom(){
    mapa.style.width = '1000px'
    mapa.style.heigth = '550px'
}

function mapaNormal(){
    mapa.style.width = '600px'
    mapa.style.heigth = '350px'
}