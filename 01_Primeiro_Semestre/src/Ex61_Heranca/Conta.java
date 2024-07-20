package Ex61_Heranca;

public class Conta {
	protected String agencia;
	protected String numero;
	protected double saldo;
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	Conta() {
		this.saldo = 0.0;
	}
	
	Conta(String agencia, String numero) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0.0;
	}
	
}
