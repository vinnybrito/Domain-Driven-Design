package Ex31_Ex47_Lacos_de_Repeticao;

import java.util.Scanner;

public class Ex33DW {
	
	// 33. Entrar via teclado com o sexo de determinado usuário,
	// aceitar somente “F” ou “M” como respostas válidas. (DO WHILE)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String sexo;
		
        do {
            System.out.print("Digite o seu sexo (f/m): ");
            sexo = scanner.next().toUpperCase();
            
            if (!sexo.equals("F") && !sexo.equals("M"))
                System.out.println("Sexo inválido. Digite novamente: ");
            
        } while (!sexo.equals("F") && !sexo.equals("M"));

		System.out.print("Sexo registrado com sucesso!");
		
		scanner.close();
	}

}
