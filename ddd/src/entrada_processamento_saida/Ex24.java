package entrada_processamento_saida;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int age;
		
		String nome, sex, ec;
		
		System.out.printf("Insira o seu nome: ");
		nome = ler.next();
		
		System.out.printf("Insira o seu sexo (Masculino = m / Feminino= f): ");
		sex = ler.next();
		
		System.out.printf(" 1- Solteiro(a) \n 2- Casado(a) \n 3- Viuvo(a) \n Insira o seu estado civil: ");
		ec = ler.next();
		
		if ((sex.equals("f")) && (ec.equals("2"))) {
			
			System.out.printf("Por favor, insira há quanto tempo você está casada: ");
			age = ler.nextInt();
			
			System.out.printf("Muito obrigado, %s. ", nome);
		}else {
			System.out.printf("Muito obrigado %s.", nome);
		}

	}

}
