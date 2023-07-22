package A02_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		// 24. Faça um algoritmo que leia o nome, o sexo e o estado civil de
		// uma pessoa. Caso sexo seja “F” e estado civil seja “CASADA”, 
		// solicitar o tempo de casada (anos).
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = read.next();
		
		System.out.print("Digite o seu sexo (M/F): ");
		String sexo = read.next();
		
		System.out.print("Digite o seu Estado Civil (Casado(a), Solteiro(a): ");
		String estadoCivil = read.next();
		
		if ((sexo.equalsIgnoreCase("F")) && (estadoCivil.equalsIgnoreCase("CASADA"))) {
			
			System.out.print("Digite quantos anos você está casada: ");
			int idadeC = read.nextInt();
			
			System.out.printf("Muito obrigado, %s. Você está casada há %d anos!", nome, idadeC);
		}
			
		else {
			System.out.printf("Muito obrigado %s.", nome);
		}
	}

}
