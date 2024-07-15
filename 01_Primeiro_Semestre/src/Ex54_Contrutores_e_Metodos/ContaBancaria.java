package Ex54_Contrutores_e_Metodos;

public class ContaBancaria {
	public String agencia;
	public String numero;
	public double saldo;
	
	ContaBancaria() {}
	
	ContaBancaria(String agencia, String numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
}
