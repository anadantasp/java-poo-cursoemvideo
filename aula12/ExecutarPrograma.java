package aula12;

public class ExecutarPrograma {

	public static void main(String[] args) {
		
		//Animal a1 = new Animal();
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru canguru = new Canguru();
		Cachorro cachorro = new Cachorro();
		Cobra cobra = new Cobra();
		Tartaruga tartaruga = new Tartaruga();
		Goldfish goldfish = new Goldfish();
		Arara arara = new Arara();
		
		
		/*
		 * m.setPeso(35.3f); 
		 * m.setCorPelo("Marrom"); 
		 * m.alimentar(); 
		 * m.locomover();
		 * m.emitirSom();
		 * 
		 * a.locomover(); 
		 * p.locomover(); 
		 * r.locomover();
		 */
		
		canguru.locomover();
		canguru.emitirSom();
		cachorro.locomover();
		cachorro.emitirSom();

	}

}
