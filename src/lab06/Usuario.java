package lab06;

import java.util.HashSet;

public class Usuario {

	private String nome;
	private String login;
	private HashSet<Jogo> jogosComparados;
	private int saldo;

	public Usuario(String nome, String login, HashSet<Jogo> jogosComparados, int qtdDinheiro) {
		this.nome = nome;
		this.login = login;
		this.jogosComparados = jogosComparados;
		this.saldo = qtdDinheiro;
	}

	public String getNome() {
		return nome;
	}

	public String getLogin() {
		return login;
	}

	public HashSet<Jogo> getJogosComparados() {
		return jogosComparados;
	}

	public void compraJogo(Jogo jogo) {
		if (!this.jogosComparados.contains(jogo)) {
			this.saldo -= jogo.getValor();
			this.jogosComparados.add(jogo);
		}			
	}

	public int getSaldo() {
		return saldo;
	}

	public void addSaldo(int dinheiro) {
		this.saldo += dinheiro;
	}	
}
