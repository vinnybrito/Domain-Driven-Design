package Ex61_Heranca;

public class ContaPoupanca extends Conta {
	private double rentabilidade;

	public double getRentabilidade() {
		return rentabilidade;
	}

	public void setRentabilidade(double rentabilidade) {
		this.rentabilidade = rentabilidade;
	}
	
	ContaPoupanca() {}
	
	ContaPoupanca(String agencia, String numero, double rentabilidade) {
		super(agencia, numero);
		this.rentabilidade = rentabilidade;
	}
	
	public String mostrarContaPoupanca() {
		return "\nConta Poupança - Agência: " + this.agencia +
			   " - Número: " + this.numero +
			   " - Saldo: " + this.saldo +
			   " - Rentabilidade: " + this.rentabilidade;
	}
	
}
