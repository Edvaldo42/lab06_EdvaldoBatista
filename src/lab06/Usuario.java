package lab06;

import java.util.HashSet;

public class Usuario {

	private String nome;
	private String login;
	private HashSet<Jogo> jogosComparados;
	private int saldo;
	protected int x2p;

	public Usuario(String nome, String login, HashSet<Jogo> jogosComparados, int saldo) {
		this.nome = nome;
		this.login = login;
		this.jogosComparados = jogosComparados;
		this.saldo = saldo;
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
	
	public int getSaldo() {
		return saldo;
	}

	public void compraJogo(Jogo jogo) {
		if (!this.jogosComparados.contains(jogo)) {
			this.saldo -= jogo.getValor();
			this.jogosComparados.add(jogo);
			this.ganhaX2pCompra(jogo.getValor());
		}			
	}
	
	public abstract void ganhaX2pCompra(int precoJogo);

	public void addSaldo(int dinheiro) {
		this.saldo += dinheiro;
	}
	public int getX2p() {
		return x2p;
	}

	public void setX2p(int x2p) {
		this.x2p = x2p;
	}

}
