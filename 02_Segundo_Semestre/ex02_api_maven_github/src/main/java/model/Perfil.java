package model;

public class Perfil {
	private String login;
	private String name;
	private String public_repos;
	private String followers;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublic_repos() {
		return public_repos;
	}
	public void setPublic_repos(String public_repos) {
		this.public_repos = public_repos;
	}
	public String getFollowers() {
		return followers;
	}
	public void setFollowers(String followers) {
		this.followers = followers;
	}
	
}
