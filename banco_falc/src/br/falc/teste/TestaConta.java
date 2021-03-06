package br.falc.teste;

import java.util.Scanner;

import br.falc.gerenciador.GerenciadorDeContas;
import br.falc.modelo.Conta;
import br.falc.modelo.ContaCorrente;
import br.falc.modelo.ContaPoupanca;

public class TestaConta {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nome = "";
		String nome2 = "";
		int numero = 0;
		double saldo = 0D;
		double limite = 0D;
		GerenciadorDeContas gc = new GerenciadorDeContas(10);
		ContaCorrente c1 = new ContaCorrente(limite);
		ContaPoupanca c2 = new ContaPoupanca();
		Conta c3 = new ContaCorrente(limite);
		
		gc.adicionarConta(c1);
		gc.adicionarConta(c2);
		
		System.out.println("Digite o nome do primeiro cliente:");
		nome = sc.nextLine();
		
		System.out.println("Digite o n�mero da primeira conta:");
		numero = sc.nextInt();
		
		System.out.println("Digite o valor do primeiro dep�sito:");
		saldo = sc.nextDouble();

		System.out.println("Digite o valor do limite:");
		limite = sc.nextDouble();

		c1.setNome(nome);
		c1.setNumero(numero);
		c1.depositar(saldo);
		c1.setLimite(limite);
		
		sc.nextLine();
		
		System.out.println("Digite o nome do segundo cliente:");
		nome2 = sc.nextLine();
		
		System.out.println("Digite o n�mero da segundo conta:");
		numero = sc.nextInt();
		
		System.out.println("Digite o valor do segundo dep�sito:");
		saldo = sc.nextDouble();
		
		c2.setNome(nome2);
		c2.setNumero(numero);
		c2.depositar(saldo);
		
		gc.imprimir();
		
		sc.close();
	}

}
