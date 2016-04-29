package br.falc.teste;

import java.util.Scanner;

import br.falc.gerenciador.GerenciadorDeContas;
import br.falc.modelo.ContaCorrente;
import br.falc.modelo.ContaPoupanca;

public class TestaConta {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nome = null;
		int numero = 0;
		double saldo = 0D;
		double limite = 0D;
		GerenciadorDeContas gc = new GerenciadorDeContas(10);
		ContaCorrente c1 = new ContaCorrente(limite);
		ContaPoupanca c2 = new ContaPoupanca();
		
		gc.adicionarConta(c1);
		gc.adicionarConta(c2);
		
		System.out.println("Digite o nome do primeiro cliente:");
		nome = sc.nextLine();
		sc.next();
		
		System.out.println("Digite o número da primeira conta:");
		numero = sc.nextInt();
		
		System.out.println("Digite o valor do primeiro depósito:");
		saldo = sc.nextDouble();

		System.out.println("Digite o valor do limite:");
		limite = sc.nextDouble();

		c1.setNome(nome);
		c1.setNumero(numero);
		c1.depositar(saldo);
		c1.setLimite(limite);
		
		System.out.println("Digite o nome do segundo cliente:");
		nome = sc.nextLine();
		sc.next();
		
		System.out.println("Digite o número da segundo conta:");
		numero = sc.nextInt();
		
		System.out.println("Digite o valor do segundo depósito:");
		saldo = sc.nextDouble();
		
		c2.setNome(nome);
		c2.setNumero(numero);
		c2.depositar(saldo);
		
		gc.imprimir();
		
		sc.close();
	}

}
