package Alunos;

public class Main {
    public static void main(String[] args) {
    	
        double[] notas = {8.5, 7.0, 9.0, 6.5};

        Alunos aluno = new Alunos("João", notas);

        double media = aluno.CalcularMedia();
        System.out.println("A média de " + aluno.getNome() + " é: " + media);
    }
}
