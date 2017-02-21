package lab06;

import java.util.HashSet;

public class RPG extends Jogo {

	public RPG(String nome, int valor, HashSet<Jogabilidade> jogabilidades) throws Exception {
		super(nome, valor, jogabilidades);
	}

	@Override
	public int registraJogada(int score, boolean zerou) {
		super.aumentaQtdJogado();
		if (score > super.getMaiorScore()) {
			super.setMaiorScore(score);
		}
		if (zerou) {
			super.aumentaQtdZerado(zerou);
		}
		return 10;
	}
}