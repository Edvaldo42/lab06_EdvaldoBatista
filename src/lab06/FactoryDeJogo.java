package lab06;

import java.util.HashSet;

public class FactoryDeJogo {
	
	public Jogo criaJogo(String nomeJogo, double valor, String tipoJogo, HashSet<Jogabilidade> listaEstilo) throws Exception {
		Jogo novoJogo = null;
		if (tipoJogo.equals("RPG")) {
			novoJogo = new RPG(nomeJogo, valor, listaEstilo);
		}
		else if (tipoJogo.equals("Luta")) {
			novoJogo = new Luta(nomeJogo, valor, listaEstilo);
		}
		else if (tipoJogo.equals("Plataforma")) {
			novoJogo = new Plataforma(nomeJogo, valor, listaEstilo);
		}
		return novoJogo;
	}
}
	


