package Ex62;

public class ContaBancaria {
	private String agencia;
	private String numero;
	private Double saldo;
	
	ContaBancaria() {}
	
	ContaBancaria(String agencia, String numero) {
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public void depositar(double valorDeposito) {
		this.saldo = valorDeposito;
	}
	
	public void sacar(double valorSaque) {
		this.saldo = saldo - valorSaque;
	}
	
	public void trasferir(double valorTrasf, Cliente destinatario) {
		destinatario.getConta().depositar(valorTrasf);;
	}
	
	public double consultarSaldo() {
		return saldo;
	}
	
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
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
}
