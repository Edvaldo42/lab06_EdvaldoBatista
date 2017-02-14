package lab06;

import java.util.HashSet;

public class Noob extends Usuario {

	public Noob(String nome, String login) {
		super(nome, login);
		super.x2p = 0;
	}

	@Override
	public void ganhaX2pCompra(double precoJogo) {
			super.x2p += (10 * precoJogo.parseInt());
			
		}

	@Override
	public void registraJogada(String nomeDoJogo, int score, boolean zerou) throws Exception{
		for (Jogo jogo : super.getJogosComparados()) {
			if (jogo.getNome().equals(nomeDoJogo)) {
				jogo.registraJogada(score, zerou);
			} else {
				throw new Exception("Jogo nao foi comprado");
			}
		}
		
	}
		
}