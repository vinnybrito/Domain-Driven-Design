package Ex31_Ex47_Lacos_de_Repeticao;

public class Ex38DW {
	
	// 38 - Exibir a soma dos números inteiros positivos do intervalo de um a cem.
	// (Use o DO WHILE)

	public static void main(String[] args) {
		int soma = 0, i = 1;
		
		do {
			if ((i % 2) == 0) 
				soma += i;
			i++;
		} while (i <= 100);
		
		System.out.printf("A soma dos valores positivos de 1 á 100 é %d", soma);
	}

}
