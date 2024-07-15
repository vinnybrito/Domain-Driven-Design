package Checkpoint_01;

import java.util.Scanner;

public class Ex50F {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int b;
		
		System.out.print("Digite o valor de A: ");
		int a = scanner.nextInt();
		
		System.out.print("Digite o valor de B: ");
		b = scanner.nextInt();
		
		while (a == b) {
			System.out.print("os valores sao iguais, digite novamente: ");
			b = scanner.nextInt();
		}
		
		if (a > b) {
			
		}

	}
	
	/*
	 	a = int(input("Digite o valor de A: "))
		b = int(input("Digite o valor de B: "))
		
		while(a == b):
		    print("os valores sao iguais, digite novamente: ")
		    b = int(input("Digite o valor de B: "))
		
		if(a > b):
		    x1 = a
		    n1 = b
		else:
		    n1 = a
		    x1 = b
		
		for n1 in range(n1,x1+1,1):
		    if((n1%2) == 0 and (n1>10)):
		        print(n1)
		        
		        
print('A quantidade de números pares é: ', p)
print('A quantidade de números ímpares é: ', i)
	 */

}
