package lab06;

import java.util.HashSet;

public class Plataforma extends Jogo {

	public Plataforma(String nome, int valor, int maiorScore, int qtdJogado, int qtdZerado,
			HashSet<Jogabilidade> jogabilidades) {
		super(nome, valor, maiorScore, qtdJogado, qtdZerado, jogabilidades);

	}

	public int registraJogada(int score, boolean zerou) {
		if (zerou == true) {
			return 20;
		}
		return 0;
	}

}
