package br.com.bytebanka; 

import br.com.ByteBank.Banco.Modelo.Conta;
import br.com.ByteBank.Banco.Modelo.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {

		Conta c = new ContaCorrente(2, 1);
		c.depositar(100);
		System.out.println(c.getSaldo());

	}
}