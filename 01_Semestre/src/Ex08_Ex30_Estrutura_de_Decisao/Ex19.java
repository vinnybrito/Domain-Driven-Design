package Ex08_Ex30_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex19 {
	
	/* 
		19. Uma escola com cursos em regime semestral, realiza duas
		avaliações durante o semestre e calcula a média do aluno,
		da seguinte maneira:

		MEDIA = (P1 + 2.P2) / 3

		Fazer um programa para entrar via teclado com os valores das
		notas (P1 e P2) e calcular a média. Exibir a situação final do
		aluno (“Aprovado ou Reprovado”), sabendo que a média de aprovação
		é igual a cinco.
	*/

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Digite o valor da primeira nota: ");
		double p1 = scanner.nextDouble();
		
		System.out.printf("Digite o valor da segunda nota: ");
		double p2 = scanner.nextDouble();
		
		double media = (p1 + (2 * p2)) / 3;
		
		if (media >= 5)
			System.out.printf("Aprovado.");
		else
			System.out.printf("Reprovado.");
	
		scanner.close();
	}

}
