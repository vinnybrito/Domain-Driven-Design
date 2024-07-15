package Ex08_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex22 {
	
	/* 22. Exibir o seguinte seletor de opções e em função de uma
	   escolha, solicitar os dados necessários para o cálculo da
	   respectiva área. Enviar mensagem de erro se o usuário escolher
	   uma opção inexistente.

       Encerrar o programa somente quando selecionada a opção de
       finalização. (Fazer esse exercício utilizando If..Else e/ou Case)

			1 – Triângulo
			2 – Quadrado
			3 – Retângulo
			4 – Círculo
			5 – Fim de processo		
	*/

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int option; 
		double base, altura, area;
		boolean running = true;
	
		while (running) {
			System.out.print("<<----- MENU ----->>");
			System.out.println("\n\n 1– Triângulo" +
					           "\n 2– Quadrado" +
					           "\n 3– Retângulo" +
					           "\n 4– Círculo" +
					           "\n 5– Fim do processo");       
			System.out.print("\nSelecione uma das opções: ");
			option = scanner.nextInt();
			
			switch (option) {
				case 1:
					System.out.printf("\nDigite o valor da base do triângulo: ");
					base = scanner.nextDouble();
					
					System.out.printf("\nDigite o valor da altura do triângulo: ");
					altura = scanner.nextDouble();
					
					System.out.printf("A área do triângulo é: %.2f", area = (base * altura) / 2);
					break;
				case 2:
					System.out.printf("Digite o valor da aresta do quadrado: ");
					double lado = scanner.nextDouble();
					
					System.out.printf("A área do quadrado é: %.2f", area = lado * lado);
					break;
				case 3:
					System.out.printf("Digite o valor da base do retângulo: ");
					base = scanner.nextDouble();
					
					System.out.printf("Digite o valor da altura do retângulo: ");
					altura = scanner.nextDouble();
					
					System.out.printf("A área do retângulo é: %.2f", area = base * altura);
					break;
				case 4:
					System.out.printf("Digite o valor do raio: ");
					base = scanner.nextDouble();
					
					System.out.printf("O valor aproximado da área do círculo é: %.2f", area = 3.14 * (base * base));
					break;
				case 5:
					running = false;
					break;
				default:
					System.out.printf("Não foi possivel idêntificar sua escolha.");
			}
		}
		
		System.out.printf("Fim do processo.");

		scanner.close();
	}

}
