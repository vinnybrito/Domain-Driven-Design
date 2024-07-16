package Ex08_Ex30_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex26 {
	
	// 26. Encontrar o dobro de um número caso ele seja positivo
	// e o seu triplo caso seja negativo, imprimindo o resultado.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int valor = scanner.nextInt();
		
		int resultado;
		
		if ((valor % 2) == 0)
			System.out.printf("\nO dobro do valor é %d", resultado = valor * 2);
		else
			System.out.printf("\nO triplo do valor é %d", resultado = valor * 3);
		
		scanner.close();
	}

}
