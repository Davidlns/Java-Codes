package Alunos;

public class Alunos {
	private String nome;
	private double[] notas;
	
	public Alunos(String nome, double[] notas) {
		
		this.nome = nome;
		this.notas = notas;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double CalcularMedia() {
		double soma = 0;
		
		for(double nota : notas) {
			soma += nota;
		}
		
		return soma / notas.length;
	}
	
}
