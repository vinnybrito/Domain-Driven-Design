package A02_Estrutura_de_Decisao;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		// 28. Escreva um algoritmo que leia três valores inteiros e
		// diferentes e mostre-os em ordem crescente.
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int v1 = read.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int v2 = read.nextInt();
		
		System.out.print("Digite o terceiro valor: ");
		int v3 = read.nextInt();
		
		if ((v1 < v2) && (v1 < v3)) {
			if (v2 < v3)
				System.out.printf("1- %d \n2- %d \n3- %d", v1, v2, v3);
			else
				System.out.printf("1- %d \n2- %d \n3- %d", v1, v3, v2);
	   }
		
		else if ((v2 < v1) && (v2 < v3)) {
		   if (v1 < v3) 
			    System.out.printf("1- %d \n2- %d \n3- %d", v2, v1, v3); 
		   else 
			    System.out.printf("1- %d \n2- %d \n3- %d", v2, v3, v1);
           }
		
		else {
    	   if (v1 < v2) 
            System.out.printf("1- %d \n2- %d \n3- %d", v3, v1, v2);   
    	   else 
    	    System.out.printf("1- %d \n2- %d \n3- %d", v3, v2, v1);
       }

	}

}
