package modelo;
import java.time.LocalDate;

public class Professor {
    private String nome;
    private String cpf;
    private LocalDate nascimento;
    private int matricula;
    private String endereço;
    private float Salário;

    public Professor(String nome, String cpf, LocalDate nascimento, int matricula, String endereço, float salário) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.matricula = matricula;
        this.endereço = endereço;
        Salário = salário;
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

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public float getSalário() {
        return Salário;
    }

    public void setSalário(float salário) {
        Salário = salário;
    }
}
