package entrada_processamento_saida;

import java.util.Scanner;

public class Ex37W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int r, i, j = 1;
		
		while(j <= 20) {
			i = 1;
			while(i <= 10) {
				r = j * i;				
				System.out.printf("\n%d X %d = %d",j, i, r);
				i++;	
			}
			j++;
			System.out.printf("\nDigite qualquer tecla para continuar...");
			ler.nextLine();
		}

	}

}
