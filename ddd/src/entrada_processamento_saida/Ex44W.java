package entrada_processamento_saida;

import java.util.Scanner;

public class Ex44W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int i=1,num,a=0,b=0;
		
		while (i<=10) {
			System.out.printf("Digite um valor positivo(n%d): ",i);
			num=ler.nextInt();
			while(num<=0) {
				System.out.printf("Valor invalido!");
				System.out.printf("\nDigite um valor positivo(n%d): ",i);
				num=ler.nextInt();
			}
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
		    i++;
		}
		System.out.printf("O maior valor é:%d\nA soma dos valores é:%d\nA media aritimetica é:%d",a,b,b/10);

	}

}
