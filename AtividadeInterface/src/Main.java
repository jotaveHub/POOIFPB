import modelo.*;

void main() {
    Aluno aluno = new Aluno("111.111.111-11", "Joao", "joao@email.com", "123");
    Coordenador coordenador = new Coordenador("222.222.222-22", "Maria", "maria@email.com", "456");

    System.out.println("Resultado: " + aluno.autenticar("joao@email.com", "123"));

    System.out.println("Resultado: " + aluno.autenticar("joao@email.com", "456"));

    System.out.println("Resultado: " + coordenador.autenticar("maria@email.com", "456"));

    System.out.println("Resultado: " + coordenador.autenticar("outro@email.com", "456"));
}