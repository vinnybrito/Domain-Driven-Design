package Ex31_Ex47_Lacos_de_Repeticao;

public class Ex38F {
	
	// 38 - Exibir a soma dos números inteiros positivos do intervalo de um a cem.
	// (Use o FOR)

	public static void main(String[] args) {
		int soma = 0;
		
		for (int i = 1; i <= 100; i++) {
			if ((i % 2) == 0) 
				soma += i;	
		}
		
		System.out.printf("A soma dos valores positivos de 1 á 100 é %d", soma);
	}

}
