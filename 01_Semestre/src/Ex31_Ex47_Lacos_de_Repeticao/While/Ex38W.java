package Ex31_Ex47_Lacos_de_Repeticao;

public class Ex38W {
	
	// 38 - Exibir a soma dos números inteiros positivos do intervalo de um a cem.
	// (Use o WHILE)

	public static void main(String[] args) {
		int soma = 0, i = 1;
		
		while (i <= 100) {
			if ((i % 2) == 0) 
				soma += i;
			i++;
		}
		
		System.out.printf("A soma dos valores positivos de 1 á 100 é %d", soma);
	}

}
