package entrada_processamento_saida;

import java.util.Scanner;

public class Ex32DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int v1, v2;
		
		System.out.printf("Digite o primeiro valor: ");
		v1 = ler.nextInt();
		
		do {
		System.out.printf("Digite um segundo valor, que seja maior que o primeiro: ");
		v2 = ler.nextInt();
		}while (v2 < v1);
		
		System.out.printf("Obrigado");

	}

}
