package entrada_processamento_saida;

import java.util.Scanner;

public class Ex38W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int r = 0, i=1;
		
		while(i<=100) {
			r = r + i;			
			i++;
		}
		System.out.printf("Valor total é: %d", r);

	}

}
