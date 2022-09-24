package entrada_processamento_saida;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, r;
		
		System.out.printf("Digite um valor: ");
		n = ler.nextInt();
		
		r = n % 2;
		
		if (r == 1) {
			r = n * 3;
			System.out.printf("O valor digitado é um número negativo. O triplo de tal valor corresponde á %d.", r);
		}else {
			r = n * 2;
			System.out.printf("O valor digitado é um número positivo. O dobro de tal valor corresponde á %d.", r);
		}

	}

}
