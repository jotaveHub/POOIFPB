import modelo.Aluno;
import modelo.Disciplina;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Maria Souza", "111.222.333-44", LocalDate.of(2004, 9, 12));

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Nascimento: " + aluno.getNascimento());
    }
}
