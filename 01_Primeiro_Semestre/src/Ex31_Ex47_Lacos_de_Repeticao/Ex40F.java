package Ex31_Ex47_Lacos_de_Repeticao;

public class Ex40F {
	
	// 40 - Crie um programa que calcule e exiba os primeiros 30 números
	// da sequência de Tribonacci, começando com os valores: 1, 1, 2, 4, 7, 13, 24, 44
	// (Use o FOR)

	public static void main(String[] args) {
		int a = -1, b = 1, c = 0, currentValue;
		
		for (int i = 1; i <= 31; i++) {
			currentValue = (a + b) + c;
			a = b;
			b = c;
			c = currentValue;
			if (i != 1)
				System.out.println(currentValue);
		}
	}

}
