package Ex54;

public class Cliente {
	public int id;
	public String nome;
	public int idade;
	public String email;
	public ContaBancaria conta;
	
	Cliente(){
		
	}
	
	Cliente(int id, String nome, int idade, String email, ContaBancaria conta){
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta;
	}
	
	public void atualizarEmail(String novoEmail) {
		this.email = novoEmail;
	}
	
	public String exibirNomeIdade() {
		return("\nNome: " + this.nome + "\nIdade: " + this.idade);
	}
	
	public String exibirDadosConta() {
		return("\nAgencia: " + this.conta.agencia + "\nNumero: " + this.conta.numero + "\nSaldo: " + this.conta.saldo);
	}
}
