package entrada_processamento_saida;

import java.util.Scanner;

public class Ex39F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a = 1,b = 1, c, i;
		
		for(i = 1; i <= 30; i++) {
			System.out.println(a);
			c = b + a;
		    a = b;
		    b = c;
		}

	}

}
