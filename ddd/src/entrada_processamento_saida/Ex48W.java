package entrada_processamento_saida;

import java.util.Scanner;

public class Ex48W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, t, i;
		
		
		System.out.printf("Digite um valor qualquer: ");
		n = ler.nextInt();
		
		t = n + 20;
		
		while (n < 0) {
			System.out.printf("O número digitado precisa ser positivo.\nDigite novamente: ");
			n = ler.nextInt();		
		}
	
		i = n;
		
		while (n < t){
			
			n = i + 1;
			
			System.out.println(n);
			
			i++;
		}

	}

}
