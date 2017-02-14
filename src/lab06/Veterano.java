package lab06;

import java.util.HashSet;

public class Veterano extends Usuario {

<<<<<<< HEAD
	public Veterano(String nome, String login, HashSet<Jogo> jogosComparados, int saldo) {
		super(nome, login, jogosComparados, saldo);
	}

	@Override
	public void ganhaX2pCompra(int precoJogo) {
		super.x2p += 15 * precoJogo;
	}
=======
	public Veterano(String nome, String login) {
		super(nome, login);
		
	}

	
>>>>>>> 27002c0d2a1ae604f70cb741db04d296076c0db8

}
