import Notas.Notas;
import Alunos.Alunos;

public class Main {
    public static void main(String[] args) {
        Notas NotasAluno = new Notas(7.5F, 8, 5.5F, 9); //ADICIONE AS NOTAS AQUI
        Alunos AlunoA = new Alunos("David", 22, "Masculino"); // ADICIONE OS DADOS DO ALUNO(NOME,IDADE,SEXO
        AlunoA.SincronizaNotas(NotasAluno); //SERVE PARA SINCRONIZAR OS DADOS DAS DUAS CLASSES, JÁ QUE ESTÃO CORRELACIONADAS
        System.out.println(AlunoA.RetornarDadosAluno());

    }
}