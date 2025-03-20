package banco;

import modelos.Conta;

public class Banco {

	public static void main(String[] args) {
		
		Conta a = new Conta ("Conta David");
		a.depositar(1000);
		a.sacar(400);
		a.sacar(800);
		System.out.println(a.toString());

	}

}
