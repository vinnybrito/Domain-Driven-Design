package A03_Estruturas_de_Repeticao;

import java.util.Scanner;

public class Ex33DW {

	public static void main(String[] args) {
		// 33. Entrar via teclado com o sexo de determinado usuário,
		// aceitar somente “F” ou “M” como respostas válidas. (DO WHILE)
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite o seu sexo (F/M): ");
		String gender = read.next().toUpperCase();
		
		do {
			
			System.out.print("Digite o seu sexo (F/M): ");
			gender = read.next().toUpperCase();
			
		} while ((!gender.equals("M")) && (!gender.equals("F")));
		
		System.out.print("Sexo registrado com sucesso!");

	}

}
