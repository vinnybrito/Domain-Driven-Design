package Checkpoint_03;

public class Coordenador extends Pessoa{
	private String cursos[];
	
	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] disciplinas) {
		this.cursos = disciplinas;
	}
	
	public Coordenador() {}
	
	public Coordenador(String nome, String ra, String disciplinas[]){
		super(nome, ra);
		this.cursos = disciplinas;
	}

}
