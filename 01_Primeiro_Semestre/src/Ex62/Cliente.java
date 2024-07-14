package Ex62;

public class Cliente {
	private int id;
	private String nome;
	private int idade;
	private ContaBancaria conta;
	
	Cliente () {}
	
	Cliente (int id, String nome, int idade, ContaBancaria conta) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.conta = conta;
	}
	
	public void showClientDetails(Cliente client) {		
		System.out.print(
				"\nID: " + client.getId() +
				"\nNome: " + client.getNome() +
				"\nAGÊNCIA: " + client.getConta().getAgencia() +
				"\nNÚMERO: " + client.getConta().getNumero() +
				"\nSALDO: " + client.getConta().consultarSaldo()
		);
	}
	
	public double showBalance() {
		return conta.consultarSaldo();
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public ContaBancaria getConta() {
		return conta;
	}
	
	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}
	
}
