package entrada_processamento_saida;

import java.util.Scanner;

public class Ex42F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n,i;
		double a=1,b=2,x=(a/b);
		
		System.out.printf("Digite um valor positivo menor que 50: ");
		n=ler.nextInt();
		while(n<=0 || n>50) {
			System.out.printf("Valor invalido!");
			System.out.printf("Digite um valor positivo menor que 50: ");
			n=ler.nextInt();
		}
		
		for(i=1;i<=n;i++) {
			a=a+1;
		    b=b+1;
		    x=x+(a/b);
		    System.out.printf("\nO %dº valor é:%f",i,x);
		}
	}

}
