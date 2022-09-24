package entrada_processamento_saida;

import java.util.Scanner;

public class Ex35W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int v, r, i;
		
		System.out.printf("Digite o valor que será multiplicado: ");
		v = ler.nextInt();
		
		while (v < 0) {
			System.out.printf("Números negativos não são permitidos. Digite novamente: ");
			v = ler.nextInt();
		}i = 1;
		
		while (i < 11) {
			r = v * i;
			System.out.printf("\n%d X %d = %d", v, i, r);
			i = i + 1;
		}

	}

}
