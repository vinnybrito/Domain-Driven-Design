package Ex31_Ex47_Lacos_de_Repeticao;

public class Ex39F {
	
	// 39 - Crie um programa que calcule e exiba os primeiros 30 números
	// da sequência de Fibonacci, começando com os valores: 1, 1, 2, 3, 5
	// (Use o FOR)

	public static void main(String[] args) {
		int a = -1, b = 1, currentValue;
		
		for (int i = 1; i <= 31; i++) {
			currentValue = a + b;
			a = b;
			b = currentValue;
			
			if (i != 1)
				System.out.println(currentValue);
		}
	}

}
