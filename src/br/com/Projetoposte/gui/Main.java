package br.com.Projetoposte.gui;

import java.util.List;

import br.com.Projetoposte.basicas.Aresta;
import br.com.Projetoposte.basicas.Grafo;
import br.com.Projetoposte.basicas.Poste;
import br.com.Projetoposte.negocios.MenorCaminho;

public class Main {
	public static void main(String[] args) {
//Neste teste, iremos criar postes, arestas e o grafo. Depois iremos testar de fato o algoritmo		
		Poste poste1 = new Poste(1, 2, 2, true);
		Poste poste2 = new Poste(2, 2, 2, false);
		Poste poste3 = new Poste(3, 2, 2, false);
		Poste poste4 = new Poste(4, 2, 2, false);
		Poste poste5 = new Poste(5, 2, 2, false);

		Aresta aresta1 = new Aresta(1, 10, poste1, poste2);
		Aresta aresta2 = new Aresta(2, 5, poste2, poste3);
		Aresta aresta3 = new Aresta(3, 7, poste3, poste4);
		Aresta aresta4 = new Aresta(4, 12, poste4, poste5);
		Aresta aresta5 = new Aresta(5, 3, poste2, poste4);
		Aresta aresta6 = new Aresta(6, 8, poste3, poste5);

		poste1.addAresta(aresta1);
		poste2.addAresta(aresta1);
		poste2.addAresta(aresta2);
		poste2.addAresta(aresta5);
		poste3.addAresta(aresta2);
		poste3.addAresta(aresta3);
		poste3.addAresta(aresta6);
		poste4.addAresta(aresta3);
		poste4.addAresta(aresta4);
		poste4.addAresta(aresta5);
		poste5.addAresta(aresta4);
		poste5.addAresta(aresta6);

		// Criação do grafo
		Grafo grafo = new Grafo();
		grafo.addPoste(poste1);
		grafo.addPoste(poste2);
		grafo.addPoste(poste3);
		grafo.addPoste(poste4);
		grafo.addPoste(poste5);
		grafo.addAresta(aresta1);
		grafo.addAresta(aresta2);
		grafo.addAresta(aresta3);
		grafo.addAresta(aresta4);
		grafo.addAresta(aresta5);
		grafo.addAresta(aresta6);

		List<Poste> caminho = MenorCaminho.encontrarMenorCaminho(grafo,poste1, poste5);

		if (caminho != null) {
			System.out.println(caminho);
		}

	}

}
