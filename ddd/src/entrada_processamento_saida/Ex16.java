package entrada_processamento_saida;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int h, ca, co;
		
		System.out.printf("Digite o valor da Hipotenusa: ");
		h = ler.nextInt();
		
		System.out.printf("Digite o valor do primeiro cateto: ");
		ca = ler.nextInt();
		
		System.out.printf("Digite o valor do segundo cateto: ");
		co = ler.nextInt();
	
		if ((h * h) == (ca * ca) + (co * co)) {
			System.out.printf("É um triângulo retângulo.");
		}else {
			System.out.printf("Não é um triângulo retângulo.");
		}

	}

}
