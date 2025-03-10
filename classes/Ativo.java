package classes;

public class Ativo implements Estado{

    public void addNota(AlunoTurma alunoTurma, Nota nota){
        alunoTurma.setNota(nota);
        System.out.println(x: "Aluno atribuida!");
    }
}