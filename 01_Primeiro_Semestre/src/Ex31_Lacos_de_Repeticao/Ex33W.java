package Ex31_Lacos_de_Repeticao;

import java.util.Scanner;

public class Ex33W {
	
	// 33. Entrar via teclado com o sexo de determinado usuário,
	// aceitar somente “F” ou “M” como respostas válidas. (WHILE)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o seu sexo (f/m): ");
		String sexo = scanner.next();
		
		while(!sexo.toUpperCase().equals("F") && !sexo.toUpperCase().equals("M")) {
			System.out.print("Sexo inválido. Digite novamente: ");
			sexo = scanner.next();
		}

		System.out.print("Sexo registrado com sucesso!");
		
		scanner.close();
	}

}
