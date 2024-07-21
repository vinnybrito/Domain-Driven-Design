package Ex62_Heranca;

public class PessoaFisica extends Pessoa {
	private String CPF;

	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	
	PessoaFisica() {}
	
	PessoaFisica(String nome, String sobrenome, int idade, String CPF) {
		super(nome, sobrenome, idade);
		this.CPF = CPF;
	}
	
}
