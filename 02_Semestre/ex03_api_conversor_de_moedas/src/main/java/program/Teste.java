package program;

import java.io.IOException;
import java.util.Scanner;

import model.Cash;
import model.CashDetails;
import service.ConversaoService;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ConversaoService conversaoservice = new ConversaoService();
		int opcao;

		try {
			
			System.out.print("<----- CONVERSOR DE MOEDAS ----->");
			
			System.out.print("\n\nInsira o valor em R$: ");
			String cashValue = scanner.next();
			
			System.out.print("\nDeseja converter para: ");
			System.out.print("\n ( 1 ) - Dolar." +
			                 "\n ( 2 ) - Euro." +
					         "\n ( 3 ) - Bitcoin.");
			System.out.print("\nOpção Escolhida: ");
			opcao = scanner.nextInt();

			
			if (opcao == 1) {
				
				Cash cash = conversaoservice.getConversao("USD-BRL");
				double dolarValue = Double.parseDouble(cash.getUSDBRL().getHigh()) * Double.parseDouble(cashValue);
			
				System.out.printf("\nOpção escolhida: Dolar" + 
				                 "\nValor: R$" + cashValue +
				                 "\nCONVERSÃO: $%.2f", dolarValue);
				
			} else if (opcao == 2) {
				
				Cash cash = conversaoservice.getConversao("EUR-BRL");
				double euroValue = Double.parseDouble(cash.getEURBRL().getHigh()) * Double.parseDouble(cashValue);
				
				System.out.printf("\nOpção escolhida: Euro" + 
						         "\nValor: R$" + cashValue +
				                 "\nCONVERSÃO: €%.2f", euroValue);
				
			} else if (opcao == 3) {	
				
				Cash cash = conversaoservice.getConversao("BTC-BRL");
				double bitcoinValue = Double.parseDouble(cash.getBTCBRL().getHigh()) * Double.parseDouble(cashValue);
				
				System.out.print("\nOpção escolhida: Bitcoin" + 
						         "\nValor: R$" + cashValue +
				                 "\nCONVERSÃO: " + bitcoinValue);
			} else {
				System.out.print("\nOpção Inválida");
			}
			
		 } catch (IOException e) {
			 e.printStackTrace();
		 } 

	}

}
