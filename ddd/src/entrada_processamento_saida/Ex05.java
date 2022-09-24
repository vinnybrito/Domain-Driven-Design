package entrada_processamento_saida;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int c,f; 
		
		System.out.printf("Digite o valor da temperatura em graus Celsius: ");
		c = ler.nextInt();
		
		f = ((c * 9) / 5) + 32;
		
		System.out.printf("O valor da temperatura de graus Celsus para Fahrenheit é: %d", f);
		
	}

}
