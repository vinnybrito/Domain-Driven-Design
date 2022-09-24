package entrada_processamento_saida;

import java.util.Scanner;

public class Ex34F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, i, r;
		
		n = 5;
		i = 1;
	
		for (i=1; i<=10; i++) { 
	            r = n * i;
	            System.out.printf("\n%d X %d = %d", n, i, r);	
		}

	}

}
