import modelo.Pagamento;
import modelo.Pix;
import modelo.CartaoCredito;

import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe o valor da compra:");
    double valor = scanner.nextDouble();

   Pagamento pagamento = new Pix();
   System.out.printf("valor após desconto: %.2f\n", pagamento.processar(valor));
   Pagamento pagamento2 = new CartaoCredito();
   System.out.printf("valor após a taxa: %.2f\n", pagamento2.processar(valor));

    scanner.close();
}