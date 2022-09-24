package entrada_processamento_saida;

import java.util.Scanner;

public class Ex33W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String sex;
		
		System.out.printf("Insira o seu sexo (Masculino = m / Feminino = f): ");
		sex = ler.next();
	
		while ((!sex.equals("m")) && (!sex.equals("f"))) {
			System.out.printf("Sexo incorreto. Insira novamente: ");
			sex = ler.next();
		}System.out.printf("Obrigado");

	}

}
