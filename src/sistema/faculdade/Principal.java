package sistema.faculdade;

public class Principal {

	public static void main(String[] args) {

		String aluno = "Leonardo";

		Aluno aluno01 = new Aluno(aluno, "13/06/73", "lelzinhobebe@hotmail.com", "rua 10", 467890, 23454, 'm');

		System.out.println("Nome do aluno mais sem vergonha da FG: " + aluno01.pegarNome());
		System.out.println(aluno01.pegarDado("mat"));
		Disciplina d1 = new Disciplina();
		Disciplina d2 = new Disciplina("Álgebra Linear", 666, 60);
		
		
		d1.setNome("Interface Homem-Máquina");
		
		System.out.println("Nome da disciplina d1: "+d1.getNome());
		System.out.println("Nome da disciplina d2: "+d2.getNome());
		
		Dados d = new Dados();
		d.cadastrarDisciplina(d2);
		
	}

}
