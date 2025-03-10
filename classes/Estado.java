package classes;


public interface Estado { 

    public void addNota (AlunoTurma alunoTurma, Nota nota){
        alunoTurma.setNota(nota);
        System.out.print(x: "Aluno atribuida!");
    }
}