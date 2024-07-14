package A02_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex24 {
	
	// 24. Faça um algoritmo que leia o nome, o sexo e o estado civil de
	// uma pessoa. Caso sexo seja “F” e estado civil seja “CASADA”, 
	// solicitar o tempo de casada (anos).

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = scanner.next();
		
		System.out.print("Digite o seu sexo (M/F): ");
		String sexo = scanner.next();
		
		System.out.print("\nDigite o seu Estado Civil \n1 - Casado(a), \n2 - Solteiro(a) \nResposta: ");
		int estadoCivil = scanner.nextInt();
		
		if (sexo.toUpperCase().equals("F") && (estadoCivil == 1)) {
			System.out.print("Digite há quantos anos você está casada: ");
			int idade = scanner.nextInt();
			
			System.out.printf("Muito obrigado, %s. Você está casada há %d anos!", nome, idade);
		} else {
			System.out.printf("Muito obrigado %s.", nome);
		}

		scanner.close();
	}

}
