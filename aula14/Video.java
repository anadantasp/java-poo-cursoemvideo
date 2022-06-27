package aula14;

public class Video implements AcoesVideo{

	private String titulo;
	private float avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	public Video(String titulo) {
		super();
		this.titulo = titulo;
		this.avaliacao = 1f;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public float getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(float avaliacao) {
		float novaAvaliacao;
		novaAvaliacao = (this.avaliacao + avaliacao) / this.views;
		this.avaliacao = novaAvaliacao;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public boolean getReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	@Override
	public void play() {
		if(this.getReproduzindo()) {
			System.out.println("O v�deo j� est� em reprodu��o");
		} else {
			this.setReproduzindo(true);
			System.out.println("V�deo em reprodu��o");
		}
		
	}

	@Override
	public void pause() {
		if(this.getReproduzindo()) {
			this.setReproduzindo(false);
			System.out.println("V�deo pausado!");
		} else {
			System.out.println("O v�deo n�o est� em reprodu��o");
		}
		
	}

	@Override
	public void like() {
		System.out.println("Curti!");
		this.curtidas++;
		
	}

	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas
				+ ", reproduzindo=" + reproduzindo + "]";
	}
	
	

	
}
