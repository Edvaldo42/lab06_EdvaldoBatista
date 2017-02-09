package lab06;

import java.util.HashSet;

public abstract class Jogo {

	private String nome;
	private int valor;
	private int maiorScore = 0;
	private int qtdJogado = 0;
	private int qtdZerado = 0;
	private HashSet<Jogabilidade> jogabilidades;

	public Jogo(String nome, int valor, int maiorScore, int qtdJogado, int qtdZerado,
			HashSet<Jogabilidade> jogabilidades) {
		this.nome = nome;
		this.valor = valor;
		this.maiorScore = maiorScore;
		this.qtdJogado = qtdJogado;
		this.qtdZerado = qtdZerado;
		this.jogabilidades = jogabilidades;
	}

	public abstract int registraJogada(int score, boolean zerou);

	public String getNome() {
		return nome;
	}

	public int getValor() {
		return valor;
	}

	public int getMaiorScore() {
		return maiorScore;
	}

	public void setMaiorScore(int maiorScore) {
		this.maiorScore = maiorScore;
	}

	public int getQtdJogado() {
		return qtdJogado;
	}

	public void aumentaQtdJogado(int qtdJogado) {
		this.qtdJogado += qtdJogado;
	}

	public int getQtdZerado() {
		return qtdZerado;
	}

	public void aumentaQtdZerado(int qtdZerado) {
		this.qtdZerado += qtdZerado;
	}

	public HashSet<Jogabilidade> getJogabilidades() {
		return jogabilidades;
	}

}
