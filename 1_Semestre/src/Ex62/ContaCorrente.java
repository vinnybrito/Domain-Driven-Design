package Ex62;

public class ContaCorrente extends Conta {
    private double chequeEspecial;
    
    ContaCorrente() {}
    
    ContaCorrente(String agencia, String numero, double chequeEspecial) {
        super(agencia, numero, chequeEspecial);
        this.chequeEspecial = chequeEspecial;
    }
    
	//---------------- GETTERS AND SETTERS ---------------- //

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
    
}
