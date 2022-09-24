package entrada_processamento_saida;

import java.util.Scanner;

public class Ex38DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int r = 0, i=1;
		
		do {
			r = r + i;			
			i++;
		}while(i<=100);
		
		System.out.printf("Valor total é: %d", r);

	}

}
