package br.falc.modelo;

public class ContaPoupanca extends Conta{

	public ContaPoupanca() {
		super();
	}
	
	public void atualizar(double taxa){
		setSaldo(getSaldo() * (1 + taxa));
	}

	@Override
	public void atualizarValor() {
		System.out.println("Valor: "+getSaldo());
	}
}
