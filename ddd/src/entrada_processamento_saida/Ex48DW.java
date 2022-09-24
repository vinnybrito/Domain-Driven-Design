package entrada_processamento_saida;

import java.util.Scanner;

public class Ex48DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n, t, i;
		
		do {
		System.out.printf("Digite um valor qualquer: ");
		n = ler.nextInt();
		}while (n < 0);
		
		t = n + 20;
	
		i = n;
		
		do{
			
			n = i + 1;
			
			System.out.println(n);
			
			i++;
		}while (n < t);
	}

}
