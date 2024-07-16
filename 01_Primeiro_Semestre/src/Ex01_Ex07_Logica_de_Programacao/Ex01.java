package Ex01_Ex07_Logica_de_Programacao;

import java.util.Scanner;

public class Ex01 {
	
	// 1-) Enter via keyboard the base and height of a rectangle, 
	// calculate and display its area.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the base of the rectangle: ");
		int base = scanner.nextInt();
		
		System.out.print("Enter the height of the rectangle: ");
		int height = scanner.nextInt();
		
		int area = base * height;
		
		System.out.printf("The area of rectangle is %d.", area);
		
		scanner.close();
	}

}
