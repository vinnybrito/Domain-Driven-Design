package entrada_processamento_saida;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n, r, a;
		
		System.out.printf("Digite um valor qualquer: ");
		n = ler.nextInt();
		
		r = n % 2;
		
		if (r == 0) {
			a = n + 5;
			System.out.printf("A soma do número par, mais o valor cinco corresponde á %d.", a);
		}else {
			a = n + 8;
			System.out.printf("A soma do número impar, mais o valor oito corresponde á %d.", a);
		}
	}

}
