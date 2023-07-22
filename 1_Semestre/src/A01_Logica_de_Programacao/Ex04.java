package A01_Logica_de_Programacao;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		// 4-) Calculate and display the arithmetic mean 
		// of any four values ​​that will be entered.
		
		System.out.print("Enter the 1º value: ");
		double v1 = read.nextDouble();
		
		System.out.print("Enter the 2º value: ");
		double v2 = read.nextDouble();
		
		System.out.print("Enter the 3º value: ");
		double v3 = read.nextDouble();
		
		System.out.print("Enter the 4º value: ");
		double v4 = read.nextDouble();
		
		double average = (v1 + v2 + v3 + v4) / 4;
		
		System.out.printf("The arithmetic average is: %.2f", average);
		
	}

}
