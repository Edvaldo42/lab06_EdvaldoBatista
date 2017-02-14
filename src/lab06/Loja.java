package lab06;

import java.util.HashSet;

public class Loja {
	
	private HashSet<Usuario> Usuarios;

	public Loja(HashSet<Usuario> usuarios) {
		Usuarios = usuarios;
	}
	
	public void adicionaUsuario(Usuario usuario) {
		Usuarios.add(usuario);
	}
	
	
}
