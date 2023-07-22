package Ex62;

public class Conta {
	private String agencia;
	private String numero;
	private double saldo;
	
	Conta() {
        this.agencia = "001";
        this.saldo = 0.0;
	}
	
	Conta(String agencia, String numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0;
	}
	
	//---------------- GETTERS AND SETTERS ---------------- //	

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
	
}
