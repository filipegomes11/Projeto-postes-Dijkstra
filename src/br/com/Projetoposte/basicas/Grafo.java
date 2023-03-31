package br.com.Projetoposte.basicas;

import java.util.ArrayList;
import java.util.List;

public class Grafo {
    private List<Poste> postes;
    private List<Aresta> arestas;

    public Grafo() {
        this.postes = new ArrayList<>();
        this.arestas = new ArrayList<>();
    }

    public void addPoste(Poste poste) {
        postes.add(poste);
    }

    public void addAresta(Aresta aresta) {
        arestas.add(aresta);
        aresta.getOrigem().addAresta(aresta);
    }

    public List<Poste> getPostes() {
        return postes;
    }

    public List<Aresta> getArestas() {
        return arestas;
    }
}