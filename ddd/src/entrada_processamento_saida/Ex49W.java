package entrada_processamento_saida;

import java.util.Scanner;

public class Ex49W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int inicial, fim, s, i, t;
		
		System.out.printf("Digite o valor inicial: ");
		inicial = ler.nextInt();
		
		System.out.printf("Digite o valor final: ");
		fim = ler.nextInt();

		s = 0;
		i = 1;
		
		while (inicial <= fim) {
			s = s + inicial;
			inicial++;
		}
		System.out.print(s);
	}

}
