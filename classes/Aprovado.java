package classes;

public class Aprovado implements Estado {
    @Override
    public String verificarSituacao(AlunoTurma alunoTurma) {
        return "Aprovado"; // Se está nesse estado, já está aprovado
    }

    @Override
    public void addNota(AlunoTurma alunoTurma, double nota1, double nota2, double nota3) {
        // Atualiza as notas
        Nota nota = alunoTurma.getNota();
        nota.setNota1(nota1);
        nota.setNota2(nota2);
        nota.setNota3(nota3);

        // Calcula a nova média e ajusta o estado
        double media = nota.calcularMedia();
        if (media < 2.5) {
            alunoTurma.setEstado(new Reprovado());
            System.out.println("Aluno passou para Reprovado.");
        } else if (media < 7) {
            alunoTurma.setEstado(new Recuperacao());
            System.out.println("Aluno passou para Recuperação.");
        }
    }

    @Override
    public void addNotaRecuperacao(AlunoTurma alunoTurma, double notaRecuperacao) {
        System.out.println("Aluno já está aprovado, não precisa de nota de recuperação!");
    }
}
