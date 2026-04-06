package modelo;
import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String cpf;
    private LocalDate nascimento;
    private String endereco;

    public Pessoa(String nome, String cpf, LocalDate nascimento, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.endereco = endereco;
    }

}
