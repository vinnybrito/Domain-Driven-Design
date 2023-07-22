package A01_Logica_de_Programacao;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		// 3-) From the base and height values ​​of a triangle, 
		// calculate and display its area.
		
		int base, height, area;
		
		System.out.print("Enter to base of the triangle: ");
		base = read.nextInt();
		
		System.out.print("Enter to height of the triangle: ");
		height = read.nextInt();
		
		area = (base * height) / 2;
		
		System.out.printf("The area of rectangle is %d.", area);

	}

}
