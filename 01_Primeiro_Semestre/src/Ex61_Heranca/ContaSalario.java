package Ex61_Heranca;

public class ContaSalario extends Conta {
	
	public ContaSalario() {}
	 
	public ContaSalario(String agencia, String numero) {
		super(agencia, numero);
	}
	
	public String mostrarContaSalario() {
		return "Conta Salário - Agência: " + this.agencia +
			   " - Número: " + this.numero +
			   " - Saldo: " + this.saldo;
	}
	
}
