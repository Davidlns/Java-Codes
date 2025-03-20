package Alunos;
import Notas.Notas;

public class Alunos {

    private String nome;
    private int idade;
    private String sexo;
    private float[] notasAluno;
    private float media;

    public Alunos(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.notasAluno = new float[4];
    }

    public void SincronizaNotas(Notas notas) {
        this.notasAluno = notas.getNotas();
        this.media = notas.getMedia();
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNotasAluno() {
        return "Nota 1:"+notasAluno[0]
                +"\nNota 2:"+notasAluno[1]
                +"\nNota 3:"+notasAluno[2]
                +"\nNota 4:"+notasAluno[3];
    }

    public String RetornarDadosAluno() {

        return "Nome: "+this.nome
                +"\nIdade: "+this.idade
                +"\nSexo: "+this.sexo
                +"\nNotas Aluno: "+this.notasAluno[0]+"\nNotas Aluno: "+this.notasAluno[1]+"\nNotas Aluno: "+this.notasAluno[2]+"\nNotas Aluno: "+this.notasAluno[3]
                +"\nMedia: "+this.media;
    }

}
