package entrada_processamento_saida;

import java.util.Scanner;

public class Ex43W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n,i=0;
		double a,b,x=0;
		
		System.out.printf("Digite um valor positivo menor que 50: ");
		n=ler.nextInt();
		while(n<=0 || n>50) {
			System.out.printf("Valor invalido!");
			System.out.printf("\nDigite um valor positivo menor que 50: ");
			n=ler.nextInt();
		}
		
		while(i<=n) {
			if(i==0) {
				a=((i+1)*(i+1))+1;
				b=Math.pow(i+1, 3);
				x=(a/b);
			}else {
				x=x+(((i+1)*(i+1))+1)/Math.pow(i+1, 3);
				System.out.printf("\nO %dº valor é:%f",i,x);
			}
			i++;
		    
		}

	}

}
