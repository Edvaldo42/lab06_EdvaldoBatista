package lab06;

import java.util.HashSet;

public abstract class Usuario {

	private String nome;
	private String login;
	private HashSet<Jogo> jogosComparados;
	private double saldo;
	protected int x2p;

	public Usuario(String nome, String login) throws Exception {
		if (this.nome.equals(null) || this.nome.trim().equals("")) {
			throw new Exception("Nome de usuario nao pode ser null ou vazio");
		}
		if (this.login.equals(null) || this.login.trim().equals("")) {
			throw new Exception("Login nao pode ser null ou vazio");
		}
		this.nome = nome;
		this.login = login;
		jogosComparados = new HashSet<>();
		saldo = 0;
	}

	public abstract boolean compraJogo(Jogo jogo);

	public abstract void ganhaX2pCompra(double precoJogo);

	public boolean registraJogada(String nomeDoJogo, int score, boolean zerou) throws Exception {
		if (score < 0) {
			throw new Exception("Score nao pode ser menor que zero");
		}
		for (Jogo jogo : this.jogosComparados) {
			if (jogo.getNome().equals(nomeDoJogo)) {
				jogo.registraJogada(score, zerou);
				return true;
			} 
		} 
		return false; 
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
	
	public void setJogosComparados(HashSet<Jogo> jogosComparados) {
		this.jogosComparados = jogosComparados;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void addSaldo(double dinheiro) {
		this.saldo += dinheiro;
	}
	
	public void rmSaldo(double dinheiro) {
		this.saldo -= dinheiro;
	}	

	public int getX2p() {
		return x2p;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
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
		Usuario other = (Usuario) obj;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		return true;
	}

	public void setX2p(int x2p) {
		this.x2p = x2p;
	}
}