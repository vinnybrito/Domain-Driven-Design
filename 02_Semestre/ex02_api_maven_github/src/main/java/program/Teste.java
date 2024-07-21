package program;

import java.io.IOException;
import java.util.Scanner;

import model.Perfil;
import service.GitHubService;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		GitHubService githubservice = new GitHubService();

		try {
			System.out.print("Digite o seu nome de usuário do GitHub: ");
			String gitHubUser = scanner.next();
			
			Perfil perfil = githubservice.getPerfil(gitHubUser);
			
			System.out.println("Nome: " + perfil.getName() +
					           "\nQuantidade de Repositórios: " + perfil.getPublic_repos() +
					           "\nQuantidade de Seguidores: " + perfil.getFollowers());
			
		 } catch (IOException e) {
			 e.printStackTrace();
		 } 

	}

}
