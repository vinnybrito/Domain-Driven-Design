package entrada_processamento_saida;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double v1, v2, r;
		
		String menu;
		
		System.out.printf("Digite o primeiro valor: ");
		v1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo valor: ");
		v2 = ler.nextDouble();
		
		System.out.printf(" \n 1– Multiplicação \n 2– Adição \n 3– Divisão \n 4– Subtração \n 5– Fim de processo \n Selecione uma das opções:  ");
		menu = ler.next();
		
		if (menu.equals("1")) {
			r = v1 * v2;
			System.out.printf("A multiplicação dos dois valores correspondem á %.2f", r);
		}else if (menu.equals("2")) {
			r = v1 + v2;
			System.out.printf("A soma dos dois valores correspondem á %.2f", r);
		}else if (menu.equals("3")) {
			if (v2 == 0) {
				System.out.printf("Não é possivel realizar a divisão com um denominador 0.");
			}else {
				r = v1 / v2;
				System.out.printf("A divisão dos dois valores correspondem á %.2f", r);
			}
		}else if (menu.equals("4")) {
			r = v1 - v2;
			System.out.printf("A subtração dos dois valores correspondem á %.2f", r);
		}else if (menu.equals("5")) {
			System.out.printf("Fim do processo.");
		}else {
			System.out.printf("Não foi possivel idêntificar sua escolha.");
		}

	}

}
