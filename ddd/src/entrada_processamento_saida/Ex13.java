package entrada_processamento_saida;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int v1, v2, v3;
		
		System.out.printf("Digite o primeiro valor: ");
		v1 = ler.nextInt();
		
		System.out.printf("Digite o segundo valor: ");
		v2 = ler.nextInt();
		
		System.out.printf("Digite o terceiro valor: ");
		v3 = ler.nextInt();
		
	if ((v1 > v2) && (v1 > v3)) {
		System.out.printf("O primeiro valor é o maior.");
	}else if ((v2 > v1) && (v2 > v3)) {
		System.out.printf("O segundo valor é o maior.");
	}else {
		System.out.printf("O terceiro valor é o maior.");
	}
			}

		
			
	}


