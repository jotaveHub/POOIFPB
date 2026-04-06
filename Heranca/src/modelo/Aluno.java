package modelo;
import java.time.LocalDate;

public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    public Aluno(String nome, String cpf, LocalDate nascimento, int matricula, String endereco, String curso) {
        super(nome,cpf, nascimento,endereco);
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
