package entrada_processamento_saida;

import java.util.Scanner;

public class Ex31DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int v;
		
		do {
			System.out.printf("Digite um valor positivo: ");
			v = ler.nextInt();
		}while(v <= 0);
			
		System.out.printf("Obrigado.");

	}

}
