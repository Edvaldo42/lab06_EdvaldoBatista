package lab06;

import java.util.HashSet;

public class Luta extends Jogo {

	public Luta(String nome, int valor, int maiorScore, int qtdJogado, int qtdZerado,
			HashSet<Jogabilidade> jogabilidades) {
		super(nome, valor, maiorScore, qtdJogado, qtdZerado, jogabilidades);
	}

	public int registraJogada(int score, boolean zerou) {
		if (score > super.maiorScore) {
			return score / 1000;
		}
		return 0;
	}
}
