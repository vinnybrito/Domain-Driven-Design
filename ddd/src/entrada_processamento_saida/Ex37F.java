package entrada_processamento_saida;

import java.util.Scanner;

public class Ex37F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int r,i,j;
		
		for(j = 1; j <= 20; j++) {
			for(i = 1; i <= 10; i++) {
				r = j * i;
				
				System.out.printf("\n%d X %d = %d",j, i, r);	
			}
			System.out.printf("\nDigite qualquer tecla para continuar...");
			ler.nextLine();
		}
	}

}
