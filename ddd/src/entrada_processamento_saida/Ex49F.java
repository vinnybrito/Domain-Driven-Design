package entrada_processamento_saida;

import java.util.Scanner;

public class Ex49F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int inicial, fim, s, i, t;
		
		System.out.printf("Digite o valor inicial: ");
		inicial = ler.nextInt();
		
		System.out.printf("Digite o valor final: ");
		fim = ler.nextInt();

		s = 0;
		i = 1;
		
		for (i=inicial; i <= fim; i++) {
			t = i + 0;
			s = s + t;
		}
		System.out.print(s);

	}

}
