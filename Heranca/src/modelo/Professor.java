package modelo;
import java.time.LocalDate;

public class Professor extends Pessoa {
    private int matricula;
    private float salario;

    public Professor(String nome, String cpf, LocalDate nascimento, int matricula, String endereco, float salário) {
        super(nome,cpf,nascimento,endereco);
        this.matricula = matricula;
        this.salario = salário;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getsalario() {
        return salario;
    }

    public void setSalário(float salario) {
        this.salario = salario;
    }
}
