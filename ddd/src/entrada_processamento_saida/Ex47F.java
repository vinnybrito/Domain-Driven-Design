package entrada_processamento_saida;

import java.util.Scanner;

public class Ex47F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		char r=('d');
		
		while(r!='N') {
			int n,i=0,f=0;
			
			System.out.printf("Digite um valor positivo: ");
			n=ler.nextInt();
			while(n<=0) {
				System.out.printf("Valor invalido!");
				System.out.printf("\nDigite um valor positivo: ");
				n=ler.nextInt();
			}
			
			for(i=n;i>=1;i--) {
				if(i==n) {
					f=i;
				}else {
					f=f*i;
				}
			}
			System.out.printf("%d!=%d",n,f);
			System.out.printf("\nDeseja uma nova execução? (S) ou (N):");
			r=ler.next().charAt(0);
			while((r!='S')&&(r!='N')) {
				System.out.printf("Invalido! Apenas (S) ou (N).");
				System.out.printf("\nDeseja uma nova execução? (S) ou (N):");
				r=ler.next().charAt(0);
			}
		}

	}

}
