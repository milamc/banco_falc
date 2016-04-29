package br.falc.modelo;

public class ContaCorrente extends Conta{
	
	private double limite;

	public ContaCorrente(double limite) {
		super();
		this.limite = limite;
	}
	
	@Override
	public boolean sacar(double valor) {
		
		if(valor <= (getSaldo() + limite)){
			setSaldo(getSaldo() - valor);
			return true;
		}else{
			return false;
		}
		
	}
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Limite: "+limite;
	}
}
