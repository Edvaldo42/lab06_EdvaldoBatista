package lab06;

import java.util.HashSet;

public class Plataforma extends Jogo {

	public Plataforma(String nome, double valor, HashSet<Jogabilidade> jogabilidades) throws Exception {
		super(nome, valor, jogabilidades);
	}

	@Override
	public int registraJogada(int score, boolean zerou) {
		super.aumentaQtdJogado();
		if (score > super.getMaiorScore()) {
			super.setMaiorScore(score);
		}
		if (zerou == true) {
			super.aumentaQtdZerado(zerou);
			return 20;
		}
		return 0;
	}

}