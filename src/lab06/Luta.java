package lab06;

import java.util.HashSet;

public class Luta extends Jogo {

	public Luta(String nome, int valor, HashSet<Jogabilidade> jogabilidades) throws Exception {
		super(nome, valor, jogabilidades);
	}

	@Override
	public int registraJogada(int score, boolean zerou) {
		super.aumentaQtdJogado();
		if (zerou) {
			super.aumentaQtdZerado(zerou);
		}
		if (score <= 100000){
			if (score > super.getMaiorScore()) {
				return score / 1000;
			}
		}
		return 0;
	}
}