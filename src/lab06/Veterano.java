package lab06;

import java.util.HashSet;

public class Veterano extends Usuario {

	public Veterano(String nome, String login, HashSet<Jogo> jogosComparados, int saldo) {
		super(nome, login, jogosComparados, saldo);
	}

	@Override
	public void ganhaX2pCompra(int precoJogo) {
		super.x2p += 15 * precoJogo;
	}

}
