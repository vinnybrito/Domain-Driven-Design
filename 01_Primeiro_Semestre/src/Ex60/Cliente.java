package Ex60;

public class Cliente {
    private int id;
    private String nome;
    private int idade;
    private ContaBancaria conta;
    
    public Cliente() {}
   
    public Cliente(int id, String nome, int idade, ContaBancaria conta) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.conta = conta;
    }
   
    public String ExibirDadosClienteConta() {
        return "ID: " + this.id + " - Nome: " + this.nome + 
        	   "\nAgência: " + this.conta.getAgencia() + 
        	   " - Número: " + this.conta.getNumero() + 
        	   " - Saldo: " + this.conta.getSaldo() + 
        	   " - Limite: " + this.conta.getLimite();
    }

    
	//---------------- GETTERS AND SETTERS ---------------- //	
   
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
