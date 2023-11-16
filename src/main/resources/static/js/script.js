function toggleMenu() {
	let navigation = document.querySelector('.navigation');
	let toggle = document.querySelector('.toggle');
	navigation.classList.toggle('active');
	toggle.classList.toggle('active');
}

//o toggle vai adicionar e remover a classe a cada clique
function giro1() {
	document.getElementById("seta1").classList.toggle('giro');
}
function giro2() {
	document.getElementById("seta2").classList.toggle('giro');
}
function giro3() {
	document.getElementById("seta3").classList.toggle('giro');
}
function giro4() {
	document.getElementById("seta4").classList.toggle('giro');
}
function giro5() {
	document.getElementById("seta5").classList.toggle('giro');
}
function giro6() {
	document.getElementById("seta6").classList.toggle('giro');
}

/* Cadastro */
function mostrarSenha() {
	var senha = document.querySelector('#inputSenha')
	if (senha.type === "password") {
		senha.type = "text"
	} else if (senha.type === "text") {
		senha.type = "password";
	}
}

const formataCPF = event => {
	let input = event.target;
	input.value = cpf(input.value);
};

const cpf = value => {
	if (!value) return "";
	value = value.replace(/\D/g, '');
	value = value.replace(/(\d{3})(\d)/, "$1.$2");
	value = value.replace(/(\d{3})(\d)/, "$1.$2");
	value = value.replace(/(\d{3})(\d{2})$/, "$1-$2");
	return value;
};

const formataTEL = event => {
	let input = event.target;
	input.value = telefone(input.value);
};

const telefone = value => {
	if (!value) return "";
	value = value.replace(/\D/g, '');
	value = value.replace(/(\d{2})(\d)/, "($1) $2");
	value = value.replace(/(\d)(\d{4})$/, "$1-$2");
	return value;
};

document.addEventListener('DOMContentLoaded', function() {
	let cpfInput = document.getElementById('inputCpfEdit');
	cpfInput.readOnly = true;
});
