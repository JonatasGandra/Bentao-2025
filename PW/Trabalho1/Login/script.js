const user = document.querySelector('#usuario')
const senha = document.querySelector('#senha')
const erroLogin = document.querySelector('#erro')
const login = document.querySelector('#login')

login.addEventListener('click', fazerLogin)

user.addEventListener('focus', function() {
    user.style.borderColor = 'transparent';
    senha.style.borderColor = 'transparent';
    erroLogin.innerHTML = '';

  });
  
  senha.addEventListener('focus', function() {
    senha.style.borderColor = 'transparent';
    user.style.borderColor = 'transparent';
    erroLogin.innerHTML = '';

  });
  

function fazerLogin() {
    if (user.value == 'arrudaleo' && senha.value == 'leolindo') {
        window.location.href = 'file:///C:/Users/jonat/Documents/MeusProjetos2025/Bentao-2025/PW/Trabalho1/main/index..html';

    } else {
        erroLogin.innerHTML = 'preencha os campos corretamente';
        user.style.borderColor = 'red';
        senha.style.borderColor = 'red';

    }
}

