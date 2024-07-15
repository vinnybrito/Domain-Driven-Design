package Ex08_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex15 {
	
	/* 15. A partir de três valores que serão digitados, verificar
	   se formam ou não um triângulo. Em caso positivo, exibir sua 
	   classificação: “Isósceles, escaleno ou eqüilátero”. Um triângulo
	   escaleno possui todos os lados diferentes, o isósceles, dois lados
	   iguais e o eqüilátero, todos os lados iguais. Para existir 
	   triângulo é necessário que a soma de dois lados quaisquer seja
	   maior que o outro, isto, para os três lados. */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		double v1 = scanner.nextDouble();
		
		System.out.print("Digite o segundo valor: ");
		double v2 = scanner.nextDouble();
		
		System.out.print("Digite o terceiro valor: ");
		double v3 = scanner.nextDouble();
		
		if ((v1 + v2 > v3) && (v2 + v3 > v1) && (v1 + v3 > v2)) {
			System.out.println("Os valores digitados formam um Triângulo:");
			
			if ((v1 == v2) && (v1 == v3))
				System.out.println("Eqüilatero.");
			else if ((v1 != v2) && (v1 != v3))
				System.out.println("Escaleno.");
			else
				System.out.println("Isósceles.");
		} else {
			System.out.println("Os valore digitados não formam Triângulo");
		}
		
		scanner.close();
	}

}
