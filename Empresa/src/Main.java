import modelo.*;
import java.time.LocalDate;

void main() {
    Funcionario funcionario = new Horista("222.222.222-22","João",
            LocalDate.of(2000,7,10),"123",20,10);

    Funcionario funcionario1 = new Assalariado("111.111.111-11","João",
            LocalDate.of(2000,7,10),"123",2000);

    System.out.println(funcionario);
    System.out.println(funcionario1);
}