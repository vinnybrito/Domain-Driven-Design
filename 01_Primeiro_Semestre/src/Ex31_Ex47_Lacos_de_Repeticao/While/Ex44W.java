package Ex31_Ex47_Lacos_de_Repeticao;

import java.util.Scanner;

public class Ex44W {
	
	/*
	 44. Entrar via teclado com dez valores positivos. Consistir a digitação
	 e enviar mensagem de erro, se necessário. Após a digitação, exibir:
	 
		a) O maior valor;
		b) A soma dos valores;
		c) A média aritmética dos valores;
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i = 1, valor, media, maior = 0, soma = 0;
		
		while (i < 11) {
			System.out.print("Digite o " + i + "º valor: ");
			valor = scanner.nextInt();
			
			while (valor < 0) {
				System.out.print("O " + i + "º valor precisa ser positivo: ");
				valor = scanner.nextInt();
			}
			
			if (i == 1)
				maior = valor;
			else if (valor > maior)
				maior = valor;
			
			soma = soma + valor;
			i++;
		}
		
		media = soma / (i - 1);

		System.out.println("O maior número é: " + maior);
		System.out.println("A soma dos valores é: " + soma);
		System.out.println("A média dos valores é: " + media);
		
		scanner.close();
	}

}
