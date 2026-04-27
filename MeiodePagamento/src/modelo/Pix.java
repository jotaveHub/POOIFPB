package modelo;

public class Pix implements Pagamento {
    @Override
    public double processar(double valor) {
        return valor*0.9;
    }
}
