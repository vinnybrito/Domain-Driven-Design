package Ex62_Heranca;

public class PessoaJuridica extends Pessoa {
	private String CNPJ;

	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
	PessoaJuridica() {}
	
	PessoaJuridica(String nome, String sobrenome, int idade, String CNPJ) {
		super(nome, sobrenome, idade);
		this.CNPJ = CNPJ;
	}
	
}
