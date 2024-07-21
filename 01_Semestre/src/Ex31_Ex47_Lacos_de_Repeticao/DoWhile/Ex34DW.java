package Ex31_Ex47_Lacos_de_Repeticao;

public class Ex34DW {
	
	// 34. Exibir a tabuada do número cinco no intervalo de um a dez. (DO WHILE)

	public static void main(String[] args) {
		
		int i = 1;
		
		do {
			int resultado = 5 * i;
			System.out.printf("\n5 X %d = %d", i, resultado);
			i++;
		} while (i <= 10);
	
	}

}
