package entrada_processamento_saida;

import java.util.Scanner;

public class Ex35DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int v, r, i;
		
		do {
		System.out.printf("Digite um valor positivo que será multiplicado: ");
		v = ler.nextInt();
		}while (v < 0);
		
		i = 1;
		
		do {
			r = v * i;
			System.out.printf("\n%d X %d = %d", v, i, r);
			i = i + 1;
		}while (i < 11);

	}

}
