package Ex31_Ex47_Lacos_de_Repeticao;

import java.util.Scanner;

public class Ex45DW {
	
	/*
	 45. Entrar via teclado com “N” valores quaisquer. O valor “N” 
	 (que representa a quantidade de números) será digitado, deverá
	 ser positivo, mas menor que vinte. Caso a quantidade não satisfaça
	 a restrição, enviar mensagem de erro e solicitar o valor novamente.
	 Após a digitação dos “N” valores, exibir:

		a) O maior valor;
		b) O menor valor;
		c) A soma dos valores;
		d) A média aritmética dos valores;
		e) A porcentagem de valores que são positivos;
		f) A porcentagem de valores negativos;
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int valor, maior = 0, menor = 0, soma = 0, positivo = 0, negativo = 0;
		
		System.out.print("Digite um valor qualquer: ");
		int n = scanner.nextInt();
		
		while ((n <= 0) || (n > 20)) {
			System.out.print("O valor precisa ser positivo e menor que 20.\nDigite novamente: ");
			n = scanner.nextInt();
		}
		
		int i = 1;
		
		do {
			System.out.print("Digite o " + i + "º valor: ");
			valor = scanner.nextInt();
			
			if (i == 1) {
				maior = valor;
				menor = valor;
			} else if (valor > maior) {
				maior = valor;
			} else if (valor < menor) {
				menor = valor;
			}
			
			if (valor > 0)
				positivo += 1;
			else
				negativo += 1;
			
			soma += valor;
			i++;
		} while (i <= n);
		
		double media = soma / n;
		int porcentagemPositivo = 100 * positivo / n;
		int porcentagemNegativo = 100 * negativo / n;
		
		System.out.print("\nO maior valor: " + maior);
		System.out.print("\nO menor valor: " + menor);
		System.out.print("\nA soma dos valores: " + soma);
		System.out.printf("\nA média aritmética dos valores: %.1f", media);
		System.out.print("\nA porcentagem de valores que são positivos: " + porcentagemPositivo + "%");
		System.out.print("\nA porcentagem de valores negativos: " + porcentagemNegativo + "%");
		
		scanner.close();
	}

}
