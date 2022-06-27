package exercicioaula5;

public class ContaBanco {
	//ATRIBUTOS
	public int numConta;
	protected String tipo;
	private String cliente;
	private double saldo;
	private boolean status;
	//MÉTODOS ESPECIAIS
	public ContaBanco() {
		this.status = false;
		this.saldo = 0;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	//MÉTODOS PERSONALIZADOS
	public void abrirConta(String tipo) {
		//this.status = true;
		this.setTipo(tipo);
		this.setStatus(true);
		if(tipo.equals("cc")) {
			//saldo += 50;
			this.setSaldo(50);
		}else if (tipo.equals("cp")){
			//saldo += 150;
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso!");
	}
	
	public void depositar(double deposito){
		/*if(status == true) {
			saldo = saldo + deposito;
		}*/
		
		if(this.getStatus() == true) {
			this.setSaldo(this.getSaldo() + deposito);
			System.out.println("Depósito realizado com sucesso na conta de " + this.getCliente());
		} else {
			System.out.println("Não é possível depositar numa conta fechada");
		}
	}
	
	public void sacar(double valor) {
		/*if(status == true && saldo >= valor) {
			saldo -= valor;
		}else {
			System.out.println("ERRO NA OPERAÇÃO");
		}*/
		
		if(this.getStatus() == true) {
			if(this.getSaldo()>=valor)
			{
				this.setSaldo(this.getSaldo()-valor);
				System.out.println("Saque realizado na conta de "+this.getCliente());
			}
			else
			{
				System.out.println("Saldo insuficiente para saque!");
			}
		} else {
			System.out.println("Não é possível sacar de uma conta fechada!");
		}
	}
	
	public void pagarMensalidade() {
		/*if (tipo.equals("cc")) {
			saldo -= 12;
		} else {
			saldo -=20;
		}*/
		int v=0;
		if (this.getTipo() == "cc")
		{
			v=12;
		}
		else if (this.getTipo() == "cp")
		{
			v=20;
		}
		if (this.getStatus())
		{
			this.setSaldo(this.getSaldo()-v);
			System.out.println("Mensalidade paga com sucesso por "+this.getCliente());
		}
		else
		{
			System.out.println("Impossível pagar uma conta fechada!");
		}
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			//System.out.println("Você precisa sacar todo o dinheiro da sua conta para ela ser fechada!");
			System.out.println("Conta não pode ser fechada porque ainda tem saldo");
		} else if (this.getSaldo() < 0) {
			//System.out.println("Sua conta está negativada! Não é possível realizar a operação");
			System.out.println("Conta não pode ser encerrada porque está negativada!");
		}else {
			//status = false;
			this.setStatus(false);
			System.out.println("CONTA ENCERRADA COM SUCESSO!");
		}
	}
	
	public void estadoAtual()
	{
		System.out.println("----------------------------");
		System.out.println("\nConta: "+this.getNumConta());
		System.out.println("Tipo: "+this.getTipo());
		System.out.println("Cliente: "+this.getCliente());
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("Status: "+this.getStatus());
	}
	
	

}
