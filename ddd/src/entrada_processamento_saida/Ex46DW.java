package entrada_processamento_saida;

import java.util.Scanner;

public class Ex46DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		char r;
		
		do{
			int i=1,num,a=0,b=0,c=0,n,p=0,p2=0;
			double x=0,x2=0;
			
			System.out.printf("Digite quantos valores(positivos e menor que 20) seram solicitados: ");
			n=ler.nextInt();
			while(n<=0 || n>20) {
				System.out.printf("Valor invalido!");
				System.out.printf("\nDigite quantos valores(positivos e menor que 20) seram solicitados: ");
				n=ler.nextInt();
			}
			
			do{
				System.out.printf("Digite um valor positivo(n%d): ",i);
				num=ler.nextInt();
				
			    if(i==1) {
			    	a=num;
			    }else if(num>a){
			    	a=num;
			    }
			    
			    if(i==1) {
			    	b=num;
			    }else{
			    	b=b+num;
			    }
			    
			    if(num>0) {
			    	p=p+1;
			    }
			    x=(p*100)/n;
			    
			    if(num<0) {
			    	p2=p2+1;
			    }
			    x2=(p2*100)/n;
			    
			    if(i==1) {
			    	c=num;
			    }else if(num<c){
		            c=num;
			    }
			    i++;
			}while (i<=n);
			System.out.printf("O maior valor é:%d\nO menor valor é:%d\nA soma dos valores é:%d\nA media aritimetica é:%d\nPorcentagem de valores positivos é:%.2f\nPorcentagem de valores negativos:%.2f",a,c,b,b/10,x,x2);
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
