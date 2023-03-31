package br.com.Projetoposte.basicas;

import java.util.ArrayList;
import java.util.List;

public class Poste {
    private int id;
    private int conexoesDisponiveis;
    private int conexoesMaximas;
    private List<Aresta> arestas;

    public Poste(int id, int conexoesDisponiveis, int conexoesMaximas) {
        this.id = id;
        this.conexoesDisponiveis = conexoesDisponiveis;
        this.conexoesMaximas = conexoesMaximas;
        this.arestas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public int getConexoesDisponiveis() {
        return conexoesDisponiveis;
    }

    public int getConexoesMaximas() {
        return conexoesMaximas;
    }

    public List<Aresta> getArestas() {
        return arestas;
    }

    public void addAresta(Aresta aresta) {
        arestas.add(aresta);
    }
    @Override
    public String toString() {
        return "Poste " + id;
    }
}