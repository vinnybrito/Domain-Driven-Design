package entrada_processamento_saida;

import java.util.Scanner;

public class Ex36DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int x, a, b, r;
		
		do {
		System.out.printf("Digite um valor positivo a ser multiplicado: ");
		x = ler.nextInt();
		}while (x < 0);
		
		System.out.printf("Digite a quantidade minima de vezes que esse valor vai ser multiplicado: ");
		a = ler.nextInt();
		
		do {
		System.out.printf("Digite a quantidade máxima de vezes que esse valor vai ser multiplicado: ");
		b = ler.nextInt();
		}while (a > b);
		
		do {
			r = x * b;
			System.out.printf("\n%d X %d = %d", x, b, r);
			b = b - 1;
		}while (b >= a);

	}

}
