package modelo;

public class CartaoCredito implements Pagamento{
    @Override
    public double processar(double valor) {
        return valor*1.02;
    }
}
