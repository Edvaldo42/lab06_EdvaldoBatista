package lab06;

import java.util.HashSet;

public abstract class Usuario {

	private String nome;
	private String login;
	private HashSet<Jogo> jogosComparados;
	private double saldo;
	protected int x2p;

	public Usuario(String nome, String login) {
		this.nome = nome;
		this.login = login;
		jogosComparados = new HashSet<>();
		saldo = 0;
	}

	public void compraJogo(Jogo jogo) {
		if (!this.jogosComparados.contains(jogo)) {
			this.saldo -= jogo.getValor();
			this.jogosComparados.add(jogo);
			this.ganhaX2pCompra(jogo.getValor());
		}
	}

	public abstract void ganhaX2pCompra(double precoJogo);

<<<<<<< HEAD
	public void addSaldo(int dinheiro) {
		this.saldo += dinheiro;
	}

	public void registraJogada(String nomeDoJogo, int score, boolean zerou) {
		for (Jogo jogo : this.jogosComparados) {
			if (jogo.getNome().equals(nomeDoJogo)) {
				jogo.registraJogada(score, zerou);
			}
		}
	}

=======
	public abstract void registraJogada(String nomeDoJogo, int score, boolean zerou) throws Exception;
	
	public void addSaldo(double dinheiro) {
		this.saldo += dinheiro;
	}

>>>>>>> 27002c0d2a1ae604f70cb741db04d296076c0db8
	public String getNome() {
		return nome;
	}

	public String getLogin() {
		return login;
	}

	public HashSet<Jogo> getJogosComparados() {
		return jogosComparados;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getX2p() {
		return x2p;
	}

	public void setX2p(int x2p) {
		this.x2p = x2p;
	}

}
