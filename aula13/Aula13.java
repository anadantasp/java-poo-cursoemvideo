package aula13;

public class Aula13 {

	public static void main(String[] args) {
		//Animal x = new Animal();
		Lobo lobo = new Lobo();
		Cachorro cachorro = new Cachorro();
		
		/*
		 * lobo.emitirSom(); 
		 * cachorro.emitirSom();
		 */
		
		cachorro.reagir("Olá");
		cachorro.reagir("Vai apanhar");
		cachorro.reagir(11, 45);
		cachorro.reagir(21, 00);
		cachorro.reagir(true);
		cachorro.reagir(false);
		cachorro.reagir(2, 12.5f);
		cachorro.reagir(17, 4.5f);
		
	}

}
