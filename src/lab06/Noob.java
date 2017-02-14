package lab06;

import java.util.HashSet;

public class Noob extends Usuario {

	public Noob(String nome, String login, HashSet<Jogo> jogosComparados, int qtdDinheiro) {
		super(nome, login, jogosComparados, qtdDinheiro);
		super.x2p = 0;
	}
	
	@Override
	public void ganhaX2pCompra(int precoJogo) {
		super.x2p += (10 * precoJogo);
	}
}
