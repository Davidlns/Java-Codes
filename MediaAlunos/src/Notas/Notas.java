package Notas;

public class Notas {
    private float[] notas;
    private float MediaAluno;

    public Notas(float nota1, float nota2, float nota3, float nota4) {
        this.notas = new float[]{nota1, nota2, nota3, nota4};
        calcularMedia();
    }

    public void calcularMedia() {
        float soma = this.notas[0] + this.notas[1] + this.notas[2] + this.notas[3];
        float media = soma / this.notas.length;
        this.MediaAluno = media;
    }

    public float getMedia() {
        return MediaAluno;
    }

    public float[] getNotas(){
        return notas;
    }

    public void setNotas(float nota1, float nota2, float nota3, float nota4) {
        this.notas = new float[]{nota1, nota2, nota3, nota4};
        calcularMedia();
    }


}
