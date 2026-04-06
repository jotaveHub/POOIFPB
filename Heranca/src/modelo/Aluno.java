package modelo;
import java.time.LocalDate;

public class Aluno {

    private String nome;
    private String cpf;
    private LocalDate nascimento;
    private String matricula;
    private String endereço;
    private String curso;

    public Aluno(String nome, String cpf, LocalDate nascimento, String matricula, String endereço, String curso) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.matricula = matricula;
        this.endereço = endereço;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
