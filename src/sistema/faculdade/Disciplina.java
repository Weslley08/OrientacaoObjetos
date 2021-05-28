package sistema.faculdade;

public class Disciplina {
	private String nome;
	private int codigo, cargaHoraria;
	
	
	//construtor
	public Disciplina() {
		
	}
	
	
	public Disciplina(String nome, int codigo, int cargaHoraria) {		
		this.nome = nome;
		this.codigo = codigo;
		this.cargaHoraria = cargaHoraria;
	}

	//getters e setters
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCargaHoraria() {
		return cargaHoraria;
	}


	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}


	public int getCodigo() {
		return codigo;
	}	
	
	
	
	
}
