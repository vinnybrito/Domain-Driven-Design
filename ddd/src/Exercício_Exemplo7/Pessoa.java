package Exercício_Exemplo7;

public class Pessoa {
	public int id;
	public String nome;
	public Dependente dep;
	
	Pessoa(){
		
	}
	
	Pessoa(int id, String nome, Dependente dep){
		this.id = id;
		this.nome = nome;
		this.dep = dep;
	}
	
	public void transformarNomeMaiusculo() {
		this.nome = this.nome.toUpperCase();
	}
	
	public String exibirIdNome() {
		return ("Nome: " + this.nome + "-" + "Id: " + this.id);
	}
	
	public void mudarNome(String josé) {
		this.nome = josé;
	}
	
	public String exibirDependente() {
		return ("Nome: " + this.dep.nome + "-" + "Idade: " + this.dep.idade);
	}
}
