package Checkpoint_01;

import java.util.Scanner;

public class Ex50W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a,b,x1,n1;
		
		System.out.printf("Digite um valor qualquer(A): ");
		a = ler.nextInt();
		
		System.out.printf("Digite um valor qualquer(B): ");
		b = ler.nextInt();
		
		while(a==b) {
			System.out.printf("Invalido! Os valores não podem ser iguais.");
			System.out.printf("Digite um valor qualquer(B): ");
			b=ler.nextInt();
		}
		
		if(a>b) {
			x1 = a;
			
		    n1 = b;
		}else {
			n1 = a;
			
		    x1 = b;
		}
		
		for(x1 = n1; n1 <= x1; n1++) {
			if((n1 % 2) == 0 && (n1 > 10)) {
				System.out.println(n1);
			}
		}

	}
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
