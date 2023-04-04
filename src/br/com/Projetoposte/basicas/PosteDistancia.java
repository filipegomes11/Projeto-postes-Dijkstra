package br.com.Projetoposte.basicas;

public class PosteDistancia implements Comparable<PosteDistancia> {
	private Poste poste;
	private double distancia;

	public PosteDistancia(Poste poste, double distancia) {
		this.poste = poste;
		this.distancia = distancia;
	}

	@Override
	public int compareTo(PosteDistancia o) {
		return Double.compare(distancia, o.distancia);
	}

	public Poste getPoste() {
		return poste;
	}

	public void setPoste(Poste poste) {
		this.poste = poste;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	
}
