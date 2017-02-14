package lab06;

import java.util.HashSet;

public class Loja {
	
<<<<<<< HEAD
	private HashSet<Usuario> Usuarios;

	public Loja(HashSet<Usuario> usuarios) {
		Usuarios = usuarios;
	}
	
	public void adicionaUsuario(Usuario usuario) {
		Usuarios.add(usuario);
	}
	
	
=======
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
	
	

>>>>>>> 27002c0d2a1ae604f70cb741db04d296076c0db8
}
