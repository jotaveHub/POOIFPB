package model;

public class ContaCorrente {
    private String Titular;
    private int Agencia;
    private int numero;
    private double saldo;


    public ContaCorrente(String Titular,int Agencia, int numero, double saldo) {
        this.Titular = Titular;
        this.Agencia = Agencia;
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean Depositar(double valor) {
        if(valor > 5000 || valor <= 0) {
            return false;
        }
        saldo+= valor;
        return true;
    }

    public boolean Sacar(double valor) {
        if(valor>2000 || valor <=0) {
            return false;
        }
        if(valor > saldo) {
            return false;
        }
        saldo -= valor;
        return true;
    }
}
