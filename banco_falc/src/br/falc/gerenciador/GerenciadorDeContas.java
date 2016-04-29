package br.falc.gerenciador;

import br.falc.modelo.Conta;

public class GerenciadorDeContas {

	Conta[] contas;
	int pos;
	
	public GerenciadorDeContas(int quantidade) {
		contas = new Conta[quantidade];
		pos = 0;
	}
	
	public boolean adicionarConta(Conta c){
		if(pos < contas.length){
			contas[pos] = c;
			pos++;
			return true;
		}else{
			return false;
		}
	}
	
	public void imprimir(){
		for(int i = 0; i < pos; i++){
			System.out.println(contas);
			System.out.println("---------------");
		}
	}
}
