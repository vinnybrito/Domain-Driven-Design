package entrada_processamento_saida;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double a, b, h;
		
		String menu;
		
		System.out.printf(" 1– Triângulo \n 2– Quadrado \n 3– Retângulo \n 4– Círculo \n 5– Fim do processo \n Selecione uma das opções: ");
		menu = ler.nextLine();
		
		if (menu.equals("1")) {
			System.out.printf("Digite o valor da base do triângulo: ");
			b = ler.nextDouble();
			System.out.printf("Digite o valor da altura do triângulo: ");
			h = ler.nextDouble();
			
			a = (b * h) / 2;
			
			System.out.printf("A área do triângulo é: %.2f", a);
			
		}else if (menu.equals("2")) {
			System.out.printf("Digite o valor da aresta do quadrado: ");
			b = ler.nextDouble();
			
			a = b * b;
			
			System.out.printf("A área do quadrado é: %.2f", a);	
			
		}else if (menu.equals("3")) {
			System.out.printf("Digite o valor da base do retângulo: ");
			b = ler.nextDouble();
			System.out.printf("Digite o valor da altura do retângulo: ");
			h = ler.nextDouble();
			
			a = b * h;
			
			System.out.printf("A área do retângulo é: %.2f", a);
			
		}else if (menu.equals("4")) {
			System.out.printf("Digite o valor do raio: ");
			b = ler.nextDouble();
			
			a = 3.14 * (b * b);
			
			System.out.printf("O valor aproximado da área do círculo é: %.2f", a);
			
		}else if (menu.equals("5")) {
			System.out.printf("Fim do processo.");
		}else {
			System.out.printf("Não foi possivel idêntificar sua escolha.");
		}
	}

}
