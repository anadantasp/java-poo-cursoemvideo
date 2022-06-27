package aula14;

public class ProjetoYouTube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Video video[] = new Video[3];
		video[0] = new Video("Aula 01 de POO");
		video[1] = new Video("Aula 12 de PHP");
		video[2] = new Video("Aula 10 de HTML5");
		
		Gafanhoto gafanhoto[] = new Gafanhoto[2];
		
		gafanhoto[0] = new Gafanhoto("Ana", 25, "F", "anadantasp");
		gafanhoto[1] = new Gafanhoto("Diego", 29, "M", "diego.luccas");
		
		/*
		 * System.out.println(video[0].toString());
		 * System.out.println(gafanhoto[0].toString());
		 */
		
		Visualizacao v = new Visualizacao(gafanhoto[0], video[2]); 
		System.out.println(v.toString());
		
		
	
	}

}
