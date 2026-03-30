package modelo;

public class Matricula {
    private String aluno;
    private Disciplina disciplina;
    private float notas[];

    public Matricula(String aluno, Disciplina disciplina, float[] notas) {
        this.aluno = aluno;
        disciplina = disciplina;
        this.notas = notas;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        disciplina = disciplina;
    }
}
