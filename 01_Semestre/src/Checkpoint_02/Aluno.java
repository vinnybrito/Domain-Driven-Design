package Checkpoint_02;

public class Aluno {
	private int id;
	private String rm;
	private String nome;
	private Curso curso;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRm() {
		return rm;
	}
	public void setRm(String rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	Aluno() {}
	
	Aluno(int id, String rm, String nome, Curso curso) {
		this.id = id;
		this.rm = rm;
		this.nome = nome;
		this.curso = curso;
	}
	
	public String exibirDadosAluno() {
		return ("\nNome: " + this.nome + 
			   " ID: " + this.id + " - " + 
			   " RM: " + this.rm);
	}
	
	public String exibirCurso() {
		return ("\nID Curso: " + this.curso.getId() + " - " + 
	           " Nome Curso: " + this.curso.getNome());
	}
	
}
