package entrada_processamento_saida;

import java.util.Scanner;

public class Ex47DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
char r;
		
		do{
			int n=0,i=n,f=0;
			
			System.out.printf("Digite um valor positivo: ");
			n=ler.nextInt();
			while(n<=0) {
				System.out.printf("Valor invalido!");
				System.out.printf("\nDigite um valor positivo: ");
				n=ler.nextInt();
			}
			i=n;
			
			do{
				if(i==n) {
					f=i;
				}else {
					f=f*i;
				}
				i--;
			}while(i>=1);
			System.out.printf("%d!=%d",n,f);
			System.out.printf("\nDeseja uma nova execução? (S) ou (N):");
			r=ler.next().charAt(0);
			while((r!='S')&&(r!='N')) {
				System.out.printf("Invalido! Apenas (S) ou (N).");
				System.out.printf("\nDeseja uma nova execução? (S) ou (N):");
				r=ler.next().charAt(0);
			}
		}while(r!='N');

	}

}
