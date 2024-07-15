package Checkpoint_01;

import java.util.Scanner;

public class Ex50W {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int par = 0, impar = 0;
		
		System.out.printf("Digite um valor qualquer(A): ");
		int a = scanner.nextInt();
		
		System.out.printf("Digite um valor qualquer(B): ");
		int b = scanner.nextInt();
		
		while (a == b) {
			System.out.printf("Invalido! Os valores não podem ser iguais.");
			System.out.printf("Digite um valor qualquer(B): ");
			b = scanner.nextInt();
		}
		
		for (int i = a; i <= b; i++) {
			if (a % 2 == 0) {
				a = impar;
				impar = impar + 1;		
			} else {
				a = par;
				par = par + 1;
			}
		}
		
		System.out.print("\nA quantidade de números pares é: " + par);
		System.out.print("\nA quantidade de números ímpares é: " + impar);

		scanner.close();
	}
	
	
	//------------------------------------------------
	
	/*if (a % 2 == 0) {
		par = a;
		impar = b;
	} else {
		impar = a;
		par = b;
	}
	
	for (par = impar; impar <= par; impar++) {
		if((impar % 2) == 0 && (impar > 10)) {
			System.out.println(impar);
		}
	}*/
	
	/*
	 inteiro = int(input('Digite o intervalo que será solicitado dos valores: '))
	n = 1
	p = 0
	i = 0

	while (n <= inteiro):
    	a = int(input('Digite o valor: '))
    	while (a < 10):
        print('O valor deve ser maior que 10.')
        a = int(input('Digite o valor: '))
    n = n + 1 
    if (a % 2 == 0):
        a = p
        p = p + 1
    else:
        a = i
        i = i + 1

print('A quantidade de números pares é: ', p)
print('A quantidade de números ímpares é: ', i)
	 */

}
