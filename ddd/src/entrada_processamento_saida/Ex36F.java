package entrada_processamento_saida;

import java.util.Scanner;

public class Ex36F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int x, a, b, r, i;
		
		System.out.printf("Digite o valor a ser multiplicado: ");
		x = ler.nextInt();
		
		while (x < 0) {
			System.out.printf("Valores negativos não são permitidos.\nDigite novamente: ");
			x = ler.nextInt();
		}
		System.out.printf("Digite a quantidade minima de vezes que esse valor vai ser multiplicado: ");
		a = ler.nextInt();
		
		System.out.printf("Digite a quantidade máxima de vezes que esse valor vai ser multiplicado: ");
		b = ler.nextInt();
		
		while (b <= a) {
			System.out.printf("O valor precisa ser maior que o primeiro. Digite novamente: ");
			b = ler.nextInt();
		}
		for(i=b; i>=a; i--) {
			r = x * i;
			System.out.printf("\n%d X %d = %d",x,i,r);
		}
		
		
		
	}

}
