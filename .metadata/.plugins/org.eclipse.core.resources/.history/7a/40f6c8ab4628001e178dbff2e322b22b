package A02_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		// 15. A partir de três valores que serão digitados, verificar
		// se formam ou não um triângulo. Em caso positivo, exibir sua 
		// classificação: “Isósceles, escaleno ou eqüilátero”. Um triângulo
		// escaleno possui todos os lados diferentes, o isósceles, dois lados
		// iguais e o eqüilátero, todos os lados iguais. Para existir 
		// triângulo é necessário que a soma de dois lados quaisquer seja
		// maior que o outro, isto, para os três lados.
		
		System.out.print("Digite o primeiro valor: ");
		double v1 = read.nextDouble();
		
		System.out.print("Digite o segundo valor: ");
		double v2 = read.nextDouble();
		
		System.out.print("Digite o terceiro valor: ");
		double v3 = read.nextDouble();
		
		if ((v1 + v2 > v3) && (v1 + v3 > v2) && (v2 + v3 > v1)) {
			System.out.print("É um triângulo!");
			
			if ((v1 == v2) && (v1 == v3)) {
				System.out.printf("\nTriângulo Eqüilatero.");
			}
			
			else if ((v1 != v2) && (v1 != v3)) {
				System.out.printf("\nTriângulo Escaleno.");
			}
			
			else {
				System.out.printf("\nTriângulo Isósceles");
			}	
		}
		
		else {
			System.out.printf("\nNão é um Triângulo.");
		}

	}

}
