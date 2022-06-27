package aula14;

public class Visualizacao {

	private Gafanhoto espectador;
	private Video filme;
	
	public Visualizacao(Gafanhoto espectador, Video filme) {
		super();
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
		this.filme.setViews(this.filme.getViews() + 1);
		
	}
	
	public Gafanhoto getEspectador() {
		return espectador;
	}
	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}
	public Video getFilme() {
		return filme;
	}
	public void setFilme(Video filme) {
		this.filme = filme;
	}
	
	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}

	public void avaliar() {
		this.filme.setAvaliacao(5f);
	}
	
	public void avaliar(float nota) {
		this.filme.setAvaliacao(nota);
	}
	
	public void avaliar(double porc) {
		float tot = 0f;
		if(porc <= 20) {
			tot = 3f;
		} else if (porc <= 50) {
			tot = 5f;
		} else if (porc <= 90) {
			tot = 8f;
		}else {
			tot = 10f;
		}
		this.filme.setAvaliacao(tot);
	}
	
	
}
