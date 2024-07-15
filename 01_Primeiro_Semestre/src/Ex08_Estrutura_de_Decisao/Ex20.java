package Ex08_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex20 {
	
	/* 
		20. Uma escola com cursos em regime semestral realiza duas
	   	avaliações durante o semestre e calcula a média do aluno, da
	   	seguinte maneira:

		MEDIA = (P1 + 2.P2) / 3

	   	Fazer um programa para entrar via teclado com o valor da
	   	primeira nota (P1) e o programa deverá calcular quanto
    	o aluno precisa tirar na segunda nota minimamente (P2) para
    	ser aprovado, sabendo que a média de aprovação é igual a cinco.
    */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor da dua primeira prova: ");
		double p1 = scanner.nextDouble();
		
		double resultado = (15 - p1) / 2;
		
		System.out.printf("\nVocê precisa de %.1f na próxima prova para passar de ano.", resultado);
		
		scanner.close();
	}

}
