let nome = document.querySelector("#nome")
let sobrenome = document.querySelector("#sobrenome")
let email = document.querySelector("#email")
let opiniao = document.querySelector("#opiniao")
let nomeOK = false
let sobrenomeOK = false
let emailOK = false
let opiniaoOK = false


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

function validaSobrenome() {
    let txtSobrenome = document.querySelector("#txtSobrenome")
    if (sobrenome.value.length < 3 || sobrenome.value == nome.value ){
        txtSobrenome.innerHTML ="Sobrenome inválido"    
        txtSobrenome.style.color = "red"
    }else{
        txtSobrenome.innerHTML = "Sobrenome Válido"
        txtSobrenome.style.color = "green" 
        sobrenomeOK = true
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

function validaOpiniao() {
    let txtOpiniao = document.querySelector("#txtOpiniao")
    if (opiniao.value.length >=10){
        txtOpiniao.innerHTML ="Texto excede limite, digite no máximo 100 caracteres"    
        txtOpiniao.style.color = "red" 
        txtOpiniao.style.display = "block"  
    }else{
        txtOpiniao.style.display = "none"
        opiniaoOK = true
    }
}

function enviar(){
    if (nomeOK == true && sobrenomeOK == true && emailOK == true && opiniaoOK == true){
        alert ("Formulário enviado com sucesso !")
    } else{
        alert ("Preencha corretamento o formulário antes de enviar !")
    }
}
