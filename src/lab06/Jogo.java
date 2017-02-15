package lab06;

import java.util.HashSet;

public abstract class Jogo {

	private String nome;
	private int valor;
	private int maiorScore;
	private int qtdJogado;
	private int qtdZerado;
	private HashSet<Jogabilidade> jogabilidades;

	public Jogo(String nome, int valor, HashSet<Jogabilidade> jogabilidades) throws Exception {
		if (this.nome.equals(null) || this.nome.trim().equals("")) {
			throw new Exception("Nome de jogo nao pode ser null ou vazio");
		}
		if (this.valor < 0) {
			throw new Exception("Valor nao pode ser menor que zero");
		}
		this.nome = nome;
		this.valor = valor;
		maiorScore = 0;
		qtdJogado = 0;
		qtdZerado = 0;
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

	public boolean setMaiorScore(int score) {
		if (this.maiorScore > score) {
			this.maiorScore = score;
			return true;
		}
		return false;
	}

	public int getQtdJogado() {
		return qtdJogado;
	}

	public void aumentaQtdJogado() {
		this.qtdJogado++;
	}

	public int getQtdZerado() {
		return qtdZerado;
	}

	public boolean aumentaQtdZerado(boolean zerou) {
		if (zerou) {
			this.qtdZerado += qtdZerado;
		}
		return zerou;
	}

	public HashSet<Jogabilidade> getJogabilidades() {
		return jogabilidades;
	}

	@Override
	public String toString () {
		return "+ " + this.nome + " - " + this.getClass().getName() + ":\n"
				+ "==> Jogou " + this.qtdJogado + " vez(es)\n"
				+ "==> Zerou " + this.qtdZerado + " vez(es)\n"
				+ "==> Maior Score: " + this.maiorScore + "\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogo other = (Jogo) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}