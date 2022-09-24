package entrada_processamento_saida;

import java.util.Scanner;

public class Ex40DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a = 1, b = 1, c = 1, d = b + a + c, i = 1;
		
		
		do {
		    System.out.println(a);
			d = b + a + c;
			a = b;
		    b = c;
		    c = d;
	    	i++;
		}while(i <= 20);

	}

}
