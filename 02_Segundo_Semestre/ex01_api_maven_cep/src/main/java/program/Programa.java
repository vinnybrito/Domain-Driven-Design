package program;

import java.io.IOException;
import java.util.Scanner;

import model.Endereco;
import service.ViaCepService;

public class Programa {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ViaCepService viacepservice = new ViaCepService();
		
		try {
			System.out.print("Digite o seu CEP: ");
			String cep = scanner.next();
			
			Endereco endereco = viacepservice.getEndereco(cep);
			
			System.out.println("\nLogradouro: " + endereco.getLogradouro() +
					           "\nBairro: " + endereco.getBairro() +
					           "\nCidade: " + endereco.getLocalidade());
			
		 } catch (IOException e) {
			 e.printStackTrace();
		 } 
		 
	}
	
}
