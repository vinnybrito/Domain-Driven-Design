package Ex01_Ex07_Logica_de_Programacao;

import java.util.Scanner;

public class Ex03 {
	
	// 3-) From the base and height values ​​of a triangle, 
	// calculate and display its area.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter to base of the triangle: ");
		int base = scanner.nextInt();
		
		System.out.print("Enter to height of the triangle: ");
		int height = scanner.nextInt();
		
		int area = (base * height) / 2;
		
		System.out.printf("\nThe area of rectangle is %d.", area);
		
		scanner.close();
	}

}
