package lab06;

public class Noob extends Usuario {

	public Noob(String nome, String login) throws Exception {
		super(nome, login);
		super.x2p = 0;
	}

	public void ganhaX2pCompra(double precoJogo) {
		super.x2p += (10 * precoJogo);

	}
	
	@Override
	public boolean compraJogo (Jogo jogo) {
		if (!(super.getJogosComparados().contains(jogo))) {
			if ((jogo.getValor() * 0.9) < super.getSaldo()) {
			super.getJogosComparados().add(jogo);
			ganhaX2pCompra(jogo.getValor());
			return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return getNome() + " - Jogador Noob";
	}	
}