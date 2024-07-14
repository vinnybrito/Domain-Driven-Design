package A02_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex21 {
	
	/*
	 	21. Entrar via teclado com dois valores quaisquer. Após a
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

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int result, option;
		boolean running = true;
		
		System.out.print("\n\nDigite o primeiro valor: ");
		int v1 = scanner.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int v2 = scanner.nextInt();
		
		while (running) {
			
			System.out.print("\n\n.......:: Menu ::.......");
			System.out.print("\n1- Multiplicação" +
			         		 "\n2- Adição" +
			         		 "\n3- Divisão" +
			         		 "\n4- Subtração" +
					 		 "\n5- Fim do Processo");
			System.out.print("\n\nSelecione uma opção: ");
			option = scanner.nextInt();
			
			switch (option) {
				case 1:
					System.out.printf("\nResultado: %d", result = v1 * v2);
					break;
				case 2:
					System.out.printf("\nResultado: %d", result = v1 + v2);
					break;
				case 3:
					if ((v1 == 0) || (v2 == 0))
						System.out.print("Não é possível realizar a divisão com zero.");
					else
						System.out.printf("\nResultado: %d", result = v1 / v2);
					break;
				case 4:
					System.out.printf("\nResultado: %d", result = v1 - v2);
					break;
				case 5:
					running = false;
					break;
				default:
					System.out.printf("\nNúmero inválido");
			}
		}
		
		System.out.printf("\nFim do processo.");
		
		scanner.close();
	}

}
