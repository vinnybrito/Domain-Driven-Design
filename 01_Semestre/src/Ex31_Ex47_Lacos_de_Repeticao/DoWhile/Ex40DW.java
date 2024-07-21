package Ex31_Ex47_Lacos_de_Repeticao;

public class Ex40DW {
	
	// 40 - Crie um programa que calcule e exiba os primeiros 20 números
	// da sequência de Tribonacci, começando com os valores: 1, 1, 2, 4, 7, 13, 24, 44
	// (Use o DO WHILE)

	public static void main(String[] args) {
		int i = 1, a = -1, b = 1, c = 0, currentValue;
		
		do {
			currentValue = (a + b) + c;
			a = b;
			b = c;
			c = currentValue;
			if (i != 1)
				System.out.println(currentValue);
			i++;
		} while (i <= 31);
	}

}
