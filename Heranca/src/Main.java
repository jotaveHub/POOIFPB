import modelo.*;

void main() {
    /*
    Pessoa pessoa = new Pessoa("João",111.111.111-01,
            LocalDate.of(2000,01,01),"Rua X, 30, Cajazeiras");

    Aluno aluno = new Aluno("Maria","222.222.222-22",LocalDate.of(2000,4,7),
            123, "Rua X, 123, Sousa-PB","ADS");

    Professor professor = new Professor("José","333.333.333-33",LocalDate.of(2002,8,14),
            1234,"Rua Gx, 45, Jardim Oasis",2000f);

    Pessoa pessoa = new Aluno("Maria","222.222.222-22",LocalDate.of(2000,4,7),
            123, "Rua X, 123, Sousa-PB","ADS");

    Pessoa pessoa1 = new Professor("José","333.333.333-33",LocalDate.of(2002,8,14),
            1234,"Rua Gx, 45, Jardim Oasis",2000f); */

    //Implementando com classes abstratas e hierárquicas.
    Funcionario funcionario = new Professor("José","333.333.333-33",LocalDate.of(2002,8,14),
            "Rua X, 234, Jardim Brasilia",12345,2000f,"Mestrado");

    Tecnico funcionario1 = new Tecnico("Maria","222.222.222-22",LocalDate.of(2000,4,7),
            "Rua X, 123, Sousa-PB", 76544,5000f,"Laboratório de Redes");


}
