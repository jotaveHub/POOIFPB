package modelo;

public class Circulo extends Figura {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double pi = 3.14;
        return (pi * Math.pow(raio,2));
    }
}
