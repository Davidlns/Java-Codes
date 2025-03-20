package projetotutorial;

import Cadastro.Pessoa;

public class ProjetoTutorial {
	
	public static void main(String[] args) {
		
		Pessoa novaPessoa = new Pessoa ("David", 22, 5700, 481967018);
		System.out.println(novaPessoa.getNome());
		novaPessoa.setNome("David Lins");
		System.out.println(novaPessoa.getNome());
	}
}
