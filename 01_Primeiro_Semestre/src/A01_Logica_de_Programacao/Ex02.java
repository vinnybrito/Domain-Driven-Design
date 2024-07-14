package A01_Logica_de_Programacao;

import java.util.Scanner;

public class Ex02 {
	
	// 2-) Calculate and display the area of ​​a square, 
	// based on the value of its edge that will be entered.

	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the edge length of the square: ");
		int edge = scanner.nextInt();
		
		int area = edge * edge;
		
		System.out.printf("The area of square is %d.", area);
		
		scanner.close();
	}

}
