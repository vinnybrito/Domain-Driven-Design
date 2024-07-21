package Ex31_Ex47_Lacos_de_Repeticao;

public class Ex39DW {
	
	// 39 - Crie um programa que calcule e exiba os primeiros 30 números
	// da sequência de Fibonacci, começando com os valores: 1, 1, 2, 3, 5
	// (Use o DO WHILE)

	public static void main(String[] args) {		
		int a = -1, b = 1, currentValue, i = 1;
		
		do {
			currentValue = a + b;
			a = b;
			b = currentValue;
			
			if (i != 1)
				System.out.println(currentValue);
			i++;
		} while (i <= 31);
	}

}
