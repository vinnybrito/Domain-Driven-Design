package Ex54;

public class ContaBancaria {
	public String agencia;
	public int numero;
	public double saldo;
	
	ContaBancaria(){
		
	}
	
	ContaBancaria(String agencia, int numero, double saldo){
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
}
