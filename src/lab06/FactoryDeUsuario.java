package lab06;

public class FactoryDeUsuario {
	
	public Usuario criaUsuario(String nomeUsuario, String login, String tipoUsuario) throws Exception {
		Usuario novoUsuario = null;
		if (tipoUsuario.trim().equals("Noob")) {
			novoUsuario = new Noob(nomeUsuario, login);
		}
		else if (tipoUsuario.trim().equals("Veterano")) {
			novoUsuario = new Veterano(nomeUsuario, login);		
		}
		return novoUsuario;
	}
}
