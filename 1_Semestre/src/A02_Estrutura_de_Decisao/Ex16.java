package A02_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		// 16. Verificar se três valores quaisquer (A, B, C) 
		// que serão digitados formam ou não um triângulo retângulo.
		// Lembre-se que o quadrado da hipotenusa é igual a
		// soma dos quadrados dos catetos.
		
		System.out.print("Digite o valor do 1º Cateto: ");
		int co = read.nextInt();
		
		System.out.print("Digite o valor do 2º Cateto: ");
		int ca = read.nextInt();
		
		System.out.print("Digite o valor da Hipotenusa: ");
		int h = read.nextInt();
		
		if ((h * h) == (ca * ca) + (co * co)) {
			System.out.printf("É um triângulo retângulo.");
		}
		
		else {
			System.out.print("Não é um triângulo retângulo!");
		}
		
	}

}
