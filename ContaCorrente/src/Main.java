import model.ContaCorrente;

void main() {
    ContaCorrente ContaCorrente = new ContaCorrente("Joao",345,12345,0);
    ContaCorrente.Depositar(200);
    System.out.println("Saldo atual: " + ContaCorrente.getSaldo());
    ContaCorrente.Sacar(100);
    System.out.println("Saldo atual: " + ContaCorrente.getSaldo());
}
