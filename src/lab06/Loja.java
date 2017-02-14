package lab06;

import java.util.HashSet;

public class Loja {
	
	HashSet<Usuario> ListaUsuarios = new HashSet<>();
	
	public void adicionaUsuario(Usuario usuario) {
		ListaUsuarios.add(usuario);
	}
	
	public void criaUsuario (String nome, String login) {
		Usuario usuario = new Noob(nome, login);
		adicionaUsuario(usuario);
	}
	
	public void adicionaDinheiro (String login, double dinheiro) {
		for (Usuario usuario : ListaUsuarios) {
			if (usuario.getLogin().equals(login)) {
				usuario.addSaldo(dinheiro);
			}
		}
	}
	
	

}
