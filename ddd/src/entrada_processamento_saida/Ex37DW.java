package entrada_processamento_saida;

import java.util.Scanner;

public class Ex37DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int r, i, j = 1;
		
		do {
			i = 1;
			do {
				r = j * i;				
				System.out.printf("\n%d X %d = %d",j,i,r);
				i++;	
			}while(i <= 10);
			j++;
			System.out.printf("\nDigite qualquer tecla para continuar...");
			ler.nextLine();
		}while(j <= 20);

	}

}
