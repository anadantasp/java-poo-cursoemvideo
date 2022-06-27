package exercicioaula5;

public class Aula05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(1111);
		p1.setCliente("Chewie");
		p1.abrirConta("cc");
		p1.depositar(300);
		p1.sacar(350);
		p1.fecharConta();
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(2222);
		p2.setCliente("Ana");
		p2.abrirConta("cp");
		p2.depositar(500);
		p2.sacar(100);
		
		p1.estadoAtual();
		p2.estadoAtual();
	}

}
