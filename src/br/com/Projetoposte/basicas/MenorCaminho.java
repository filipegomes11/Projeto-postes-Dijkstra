package br.com.Projetoposte.basicas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class MenorCaminho {

	public static List<Poste> encontrarMenorCaminho(Grafo grafo, Poste origem, Poste destino) {
		Map<Poste, Double> distancias = new HashMap<>(); // Mapa de distâncias para cada poste
		Map<Poste, Poste> anteriores = new HashMap<>(); // Mapa de postes anteriores no caminho mais curto
		PriorityQueue<PosteDistancia> heap = new PriorityQueue<>(); // Heap para encontrar o próximo poste com menor
		// distância

		// Inicialização
		for (Poste poste : grafo.getPostes()) {
			if (poste.equals(origem)) {
				distancias.put(poste, 0.0);
				heap.offer(new PosteDistancia(poste, 0));
			} else {
				distancias.put(poste, Double.POSITIVE_INFINITY);
			}
			anteriores.put(poste, null);
		}

		// Relaxamento
		while (!heap.isEmpty()) {
			PosteDistancia atual = heap.poll();
			if (atual.poste.equals(destino)) {
				break;
			}
			for (Aresta aresta : atual.poste.getArestas()) {
				Poste vizinho = aresta.getDestino();
				double distancia = distancias.get(atual.poste) + aresta.getDistancia();
				if (distancia < distancias.get(vizinho)) {
					distancias.put(vizinho, distancia);
					anteriores.put(vizinho, atual.poste);
					heap.offer(new PosteDistancia(vizinho, distancia));
				}
			}
		}

		// Reconstroi o caminho
		List<Poste> caminho = new ArrayList<>();
		Poste poste = destino;
		while (poste != null) {
			caminho.add(poste);
			poste = anteriores.get(poste);
		}
		Collections.reverse(caminho);
		return caminho;
	}

	private static class PosteDistancia implements Comparable<PosteDistancia> {
		Poste poste;
		double distancia;

		public PosteDistancia(Poste poste, double distancia) {
			this.poste = poste;
			this.distancia = distancia;
		}

		@Override
		public int compareTo(PosteDistancia o) {
			return Double.compare(distancia, o.distancia);
		}
	}
}
