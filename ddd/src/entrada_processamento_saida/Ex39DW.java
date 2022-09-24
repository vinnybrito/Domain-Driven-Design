package entrada_processamento_saida;

import java.util.Scanner;

public class Ex39DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a = 0, b = 1, i = 1, s;
		
		do {
			s = a + b;
			System.out.println(b);
			a = b;
			b = s;
			i = i + 1;
		}while (i <= 30);

	}

}
