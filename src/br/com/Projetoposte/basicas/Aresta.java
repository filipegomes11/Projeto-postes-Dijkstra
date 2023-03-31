package br.com.Projetoposte.basicas;

public class Aresta {
    private int id;
    private double distancia;
    private Poste origem;
    private Poste destino;

    public Aresta(int id, double distancia, Poste origem, Poste destino) {
        this.id = id;
        this.distancia = distancia;
        this.origem = origem;
        this.destino = destino;
    }

    public int getId() {
        return id;
    }

    public double getDistancia() {
        return distancia;
    }

    public Poste getOrigem() {
        return origem;
    }

    public Poste getDestino() {
        return destino;
    }
}
