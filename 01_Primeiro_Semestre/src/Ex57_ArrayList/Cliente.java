package Ex57_ArrayList;

import java.util.ArrayList;

public class Cliente {
	private int id;
	private String nome;
	private int idade;
	private String email;
	private ContaBancaria conta;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ContaBancaria getConta() {
		return conta;
	}
	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}
	
	Cliente() {}
	
	Cliente(int id, String nome, int idade, String email, ContaBancaria conta) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta;
	}
	
	public int gerarId(ArrayList<Cliente> listaClientes) {
		if (listaClientes.size() != 0) 
    		return listaClientes.get(listaClientes.size()-1).getId() + 1;
        else 
        	return 1;
	}
	
    public String exibirCliente() {
        return("ID: " + this.id + 
        	   " - Nome: " + this.nome + 
        	   " - Idade: " + this.idade + 
        	   " - Email: " + this.email);
    }

	public void atualizarEmail(String novoEmail) {
		this.email = novoEmail;
	}
	
	public String exibirNomeIdade() {
		return "\n\nNome: " + this.getNome() + " - Idade: " + this.getIdade();
	}
	
	public String exibirDadosConta() {
		return "Agência: " + this.getConta().getAgencia() + 
				" - Número: " + this.getConta().getNumero() + 
				" - Saldo: " + this.getConta().getSaldo(); 
	}
	
	static public String exibirListaClientes(ArrayList<Cliente> listaCliente) {
        StringBuilder clientList = new StringBuilder();
        StringBuilder countList = new StringBuilder();
        
        for (Cliente client : listaCliente) {
        	clientList.append(client.exibirCliente()).append("\n");
        	
            if (client.getConta() != null) {
            	clientList.append(client.exibirDadosConta());
            }
        }
        
        return "\n" + clientList.toString();
    }
	
}
