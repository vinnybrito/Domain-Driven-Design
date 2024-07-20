package Ex31_Ex47_Lacos_de_Repeticao;

import java.util.Scanner;

public class Ex47W {
	
	// 47 - Crie um programa que solicite ao usuário que digite um número positivo. 
	// Verifique se o número digitado é válido (maior ou igual a zero). Em seguida, 
	// calcule o produto de todos os números de 1 até o número digitado e exiba o 
	// resultado. Após cada cálculo, pergunte ao usuário se deseja executar o programa 
	// novamente. Caso a resposta seja inválida, solicite que o usuário digite novamente.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String resposta = "S";
        int i;

        while (resposta.toUpperCase().equals("S")) {	
        	int fatorial = 1;
        	
            System.out.print("\nDigite o número (positivo) que você quer calcular o fatorial: ");
            int x = scanner.nextInt();

            while (x < 0) {
                System.out.println("O valor deve ser positivo. Digite novamente: ");
                x = scanner.nextInt();
            }
            
            if (x == 0) {
                System.out.println("0! = 1");
            } else {
            	i = x;
            	while (i > 0) {
            		fatorial = fatorial * i;
            		i--;
            	}
                System.out.println(x + "! = " + fatorial);
            }

            System.out.print("\nDeseja calcular novamente?\n(Sim = S / Não = N): ");
            resposta = scanner.next();

            while ((!resposta.toUpperCase().equals("S")) && (!resposta.toUpperCase().equals("N"))) {
                System.out.print("\nFavor responder com S para SIM ou N para NÃO: ");
                resposta = scanner.next();
            }
        }

        System.out.println("\nFim do programa!");
        
        scanner.close();
	}

}
