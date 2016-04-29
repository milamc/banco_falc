package br.falc.modelo;

public abstract class Conta {

	private String nome;
	private int numero;
	private double saldo;
	
	public Conta() {
		saldo = 0;
	}
	
	public boolean sacar(double valor){
		if(valor <= saldo){
			saldo -= valor;
			return true;
		}else{
			return false;
		}
	}
	
	public void depositar(double valor){
		saldo += valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Cliente: "+ nome+" Saldo: "+saldo;
	}
	
	public abstract void atualizarValor();
	
}
