package sistema.faculdade;

public class Aluno {
	public String nome, dataNascimento, email, endereco;
	public int matricula, codDisciplina;
	public char sexo;

	// construtor vazio
	/*public Aluno() {
	}*/

	public Aluno(String nomeDigitado, String dataNascDigitada, String emailDigitado, String enderecoDigitado,
			int matriculaDigitada, int codDisciplinaDigitada, char sexoDigitado) {
		this.nome = nomeDigitado;
		this.dataNascimento = dataNascDigitada;
		this.email = emailDigitado;
		this.endereco = enderecoDigitado;
		this.matricula = matriculaDigitada;
		this.codDisciplina = codDisciplinaDigitada;
		this.sexo = sexoDigitado;
	}
		
	public String pegarNome() {
		return this.nome;
	}
	
	public String pegarDado(String nomeDado) {
		String dadoPesquisado="";
		if(nomeDado.equalsIgnoreCase("nome")) {
			dadoPesquisado = "Nome do aluno: " +this.nome;
		}else if(nomeDado.equalsIgnoreCase("mat")) {
			dadoPesquisado = String.valueOf("Matrícula do aluno: " +this.matricula);
		}
		return dadoPesquisado;
	}
	
}




/*
 * public = qualquer classe de qualquer pacote desse sistema consegue enxergar o
 * elemento (global) 
 * protected = qualquer classe do mesmo pacote consegue
 * enxergar o elemento 
 * private = apenas os métodos da própria classe conseguem
 * enxergar o elemento
 */
