package modelos;

public class Conta {
	
	float saldo;
	String conta;
	
	public Conta (String conta) {
		saldo = 0;
		this.conta = conta;
	}
	
	public void depositar (float deposito) {
		saldo += deposito;
		System.out.println("R$"+deposito+" -> Depósito");
	}
	
	public void sacar (float sacar) {
		
		if(sacar > saldo) {
			System.out.println("Saque("+sacar+") Erro! Saldo insuficiente!");
		} else {
			saldo -= sacar;
			System.out.println("R$"+sacar+" -> Saque");
		}
	}
	
	public String toString () {
		return "saldo: "+ saldo;
	}
	
}
