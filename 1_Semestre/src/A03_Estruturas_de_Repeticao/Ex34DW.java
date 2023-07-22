package A03_Estruturas_de_Repeticao;
import java.util.Scanner;

public class Ex34DW {

	public static void main(String[] args) {
		// 34. Exibir a tabuada do número cinco no intervalo de um a dez.
		// (DO WHILE)

		Scanner read = new Scanner(System.in);
		
		int n = 5, i = 0, r;
		
		do {
			
			r = n * i;		
			System.out.printf("\n%d X %d = %d", n, i, r);
			i += 1;
			
		} while (i <= 10);
		
	}

}
