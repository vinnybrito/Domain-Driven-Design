package Ex61_Heranca;

public class ContaCorrente extends Conta{
	private double checkEspecial;

	public double getCheckEspecial() {
		return checkEspecial;
	}

	public void setCheckEspecial(double checkEspecial) {
		this.checkEspecial = checkEspecial;
	}
	
	ContaCorrente() {}
	
	ContaCorrente(String agencia, String numero, double checkEspecial) {
		super(agencia, numero);
		this.checkEspecial = checkEspecial;
	}
	
	public String mostrarContaCorrente() {
		return "\nConta Corrente - Agência: " + this.agencia +
			   " - Número: " + this.numero +
			   " - Saldo: " + this.saldo +
			   " - Check-Especial: " + this.checkEspecial;
	}
	
}
