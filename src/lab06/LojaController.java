package lab06;

import java.util.HashSet;
import java.util.Scanner;

public class LojaController {

	private HashSet<Usuario> listaUsuarios = new HashSet<>();
	private  FactoryDeUsuario fabricaUsuario = new FactoryDeUsuario(); 
	private  FactoryDeJogo fabricaJogo = new FactoryDeJogo();
	
	public void criaUsuario(String nome, String login) throws Exception {
		Usuario novoUsuario = fabricaUsuario.criaUsuario(nome, login, "Noob");
		if (!(listaUsuarios.contains(novoUsuario))) {
			listaUsuarios.add(novoUsuario);
		}
		throw new Exception();
	}

	public Usuario procuraUsuario(String login) {
		for (Usuario usuario : listaUsuarios) {
			if (usuario.getLogin().equals(login)) {
				return usuario;
			}
		}
		return null;
	}

	public void adicionaDinheiro(String login, double dinheiro) {
		if (procuraUsuario(login) != null) {
			procuraUsuario(login).addSaldo(dinheiro);
		}
	}

	public void vendeJogo(String login, String nomeJogo, double valor, String tipoJogo, HashSet<Jogabilidade> listaEstilo) throws Exception {
			if (procuraUsuario(login) != null) {
				Usuario usuario = procuraUsuario(login);
				Jogo novoJogo = fabricaJogo.criaJogo(nomeJogo, valor, tipoJogo, listaEstilo);
				if (!(usuario.getJogosComparados().contains(novoJogo))) {
					usuario.getJogosComparados().add(novoJogo);
				}
				throw new Exception("Jogo ja comprado");
		}
			throw new Exception("Usuario nao existe");
	}
	
	
	public void Upgrade (String login) throws Exception {
		if (procuraUsuario(login) != null && !(procuraUsuario(login) instanceof Noob)) {
			if (procuraUsuario(login).getX2p() >= 1000) {
				Usuario noobao = procuraUsuario(login);
				Usuario prosao = new Veterano(noobao.getNome(), login);
				prosao.addSaldo(noobao.getSaldo());
				prosao.setJogosComparados(noobao.getJogosComparados());
				prosao.setX2p(noobao.getX2p());
				listaUsuarios.remove(noobao);
				listaUsuarios.add(prosao);
			} else {
				throw new Exception("Usuario possui pontos insuficientes");
			}
		} else {
			throw new Exception ("Usuario ja e Veterano ou null");
		}
	}

	public void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("=== Central P2-CG ===\n");

		String login = entrada.nextLine();
		if (procuraUsuario(login) != null) {
			Usuario usuario = procuraUsuario(login);
			System.out.println(usuario.toString());

			System.out.println("Lista de Jogos:");
			int precoTotal = 0;
			for (Jogo jogo : usuario.getJogosComparados()) {
				System.out.println(jogo.toString());
				precoTotal += jogo.getValor();
			}
			System.out.println("Total de preço dos jogos: R$ " + precoTotal + "\n");
			System.out.println("--------------------------------------------");
		}
		entrada.close();
	}

}
