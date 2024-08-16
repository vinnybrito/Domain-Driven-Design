package program;

import java.io.IOException;
import java.util.Scanner;

import model.Perfil;
import service.GitHubService;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		GitHubService gitHubServer = new GitHubService();
		
		try {	
			System.out.print("Digite o nome de usuário no GitHub: ");
			String login = scanner.next();
			
			Perfil perfil = gitHubServer.getPerfil(login);
			
			System.out.print("\nNome: " + perfil.getName() +
							 "\nQuantidade de Repositórios: " + perfil.getPublic_repos() +
					         "\nSeguidores: " + perfil.getFollowers());
			
		} catch (IOException e) {
			 e.printStackTrace();
		 } 

	}

}
