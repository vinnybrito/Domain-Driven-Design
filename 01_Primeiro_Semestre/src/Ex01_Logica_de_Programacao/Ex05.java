package Ex01_Logica_de_Programacao;

import java.util.Scanner;

public class Ex05 {
	
	// 5-) Enter via keyboard the value of a temperature in degrees
	// Celsius, calculate and display its equivalent temperature
	// in Fahrenheit.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the temperature in Celsius: ");
		double celsius = scanner.nextDouble();
		
		double fahrenheit = (celsius * 1.8) + 32;

		System.out.printf("Equivalent temperature in Fahrenheit: %.2f", fahrenheit);
		
		scanner.close();
	}

}
