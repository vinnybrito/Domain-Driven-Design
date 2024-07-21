package Ex31_Ex47_Lacos_de_Repeticao;

public class Ex34W {
	
	// 34. Exibir a tabuada do número cinco no intervalo de um a dez. (WHILE)

	public static void main(String[] args) {
		int i = 1;
		
		while (i <= 10) {
			int resultado = 5 * i;
			System.out.printf("\n5 X %d = %d", i, resultado);
			i++;
		}
	}

}
