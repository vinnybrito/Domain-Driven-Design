package Checkpoint_03;

public class Professor extends Pessoa {
	private String disciplinas[];
	
	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public Professor() {}
	
	public Professor(String nome, String ra, String disciplinas[]){
		super(nome, ra);
		this.disciplinas = disciplinas;
	}

}
