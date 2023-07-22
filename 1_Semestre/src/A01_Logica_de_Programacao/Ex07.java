package A01_Logica_de_Programacao;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		// 7-) Entrar via teclado com o valor de cinco produtos.
		// Após as entradas, digitar um valor referente ao pagamento
		// da somatória destes valores. Calcular e exibir o troco que
		// deverá ser devolvido.
		
		System.out.print("1º Produto: ");
		double p1 = read.nextDouble();
		
		System.out.print("2º Produto: ");
		double p2 = read.nextDouble();
		
		System.out.print("3º Produto: ");
		double p3 = read.nextDouble();
		
		System.out.print("4º Produto: ");
		double p4 = read.nextDouble();
		
		System.out.print("5º Produto: ");
		double p5 = read.nextDouble();
		
		System.out.print("Pagamento: ");
		double pgt = read.nextDouble();
		
		double troco = pgt - (p1 + p2 + p3 + p4 + p5);
		
		System.out.printf("\nTroco: %.2f", troco);
		
	}

}
