package A02_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		/* 21. Entrar via teclado com dois valores quaisquer. Após a
		   digitação, exibir um seletor de opções (“menu”) com as seguintes
		   opções: (Fazer esse exercício utilizando If..Else e/ou Case)

			1 – Multiplicação
			2 – Adição
			3 – Divisão
			4 – Subtração
			5 – Fim de processo (sair do programa)

		  Solicitar uma opção por parte do usuário, verificar se é ou não
		  uma opção válida (letras ou números) e processar a respectiva
		  operação. Enviar mensagem de erro se a opção escolhida não existir
		  no seletor.

          Encerrar o programa somente quando o usuário escolher a opção de
          finalização. Repare que a opção de número três é de divisão e o
          programa deverá enviar mensagem de erro, (somente nesta opção) se
          o denominador for zero. */
		
		Scanner read = new Scanner(System.in);
		
		int v1, v2, r, option;
		
		System.out.print("Digite o primeiro valor: ");
		v1 = read.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		v2 = read.nextInt();
		
		System.out.print("\nMenu: " +
						 "\n1- Multiplicação" +
				         "\n2- Adição" +
						 "\n3- Divisão" +
				         "\n4- Subtração" +
						 "\n5- Fim do Processo");
		
		System.out.print("\n\nSelecione uma opção: ");
		option = read.nextInt();
		
		if (option == 1) {
			r = v1 * v2;
			System.out.printf("\nResultado: %d", r);
		}
		
		else if (option == 2) {
			r = v1 + v2;
			System.out.printf("\nResultado: %d", r);
		}
		
		else if (option == 3) {
			
			if (v1 == 0) {
				System.out.print("Erro!");
			}
			
			else {
				r = v1 / v2;
				System.out.printf("\nResultado: %d", r);
			}
			
		}
		
		else if (option == 4) {
			r = v1 - v2;
			System.out.printf("\nResultado: %d", r);
		}
		
		else if (option == 5) {
			System.out.printf("\nFim do processo.");
		}
		
		else {
			System.out.printf("Erro!!!");
		}

	}

}
