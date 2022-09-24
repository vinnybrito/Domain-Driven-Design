
package entrada_processamento_saida;

import java.util.Scanner;

public class Ex31W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int v;
		
		System.out.printf("Digite um valor positivo: ");
		v = ler.nextInt();
		
		while (v < 0) {
			System.out.printf("O valor digitado é negativo.\nPor favor, digite novamente: ");
			v = ler.nextInt();
		}System.out.printf("Obrigado.");

	}

}
