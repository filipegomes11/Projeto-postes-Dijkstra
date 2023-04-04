package br.com.Projetoposte.basicas;

import java.util.ArrayList;
import java.util.List;

public class Poste {
    private int id;
    private int conexoesDisponiveis;
    private int conexoesMaximas;
    private List<Aresta> arestas;
    private boolean distribuicaoCentral;

    

    public Poste(int id, int conexoesDisponiveis, int conexoesMaximas,
			boolean distribuicaoCentral) {
		super();
		this.id = id;
		this.conexoesDisponiveis = conexoesDisponiveis;
		this.conexoesMaximas = conexoesMaximas;
		this.arestas = new ArrayList<>();
		this.distribuicaoCentral = distribuicaoCentral;
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
    
    
    public boolean isDistribuicaoCentral() {
		return distribuicaoCentral;
	}


	public void setDistribuicaoCentral(boolean distribuicaoCentral) {
		this.distribuicaoCentral = distribuicaoCentral;
	}


	@Override
    public String toString() {
        return "Poste " + id;
    }
}