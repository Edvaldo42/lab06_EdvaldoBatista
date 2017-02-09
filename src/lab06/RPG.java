package lab06;

import java.util.HashSet;

public class RPG extends Jogo {

	public RPG(String nome, int valor, int maiorScore, int qtdJogado, int qtdZerado,
			HashSet<Jogabilidade> jogabilidades) {
		super(nome, valor, maiorScore, qtdJogado, qtdZerado, jogabilidades);

	}

	public int registraJogada(int score, boolean zerou) {
		super.aumentaQtdJogado(1);
		if (score > super.getMaiorScore()) {
			super.setMaiorScore(score);
		}
		if (zerou) {
			super.aumentaQtdZerado(1);
		}
		return 10;
	}
}
