package model;

public class Lampada2 {
        private boolean ligado;
        private String marca;
        private int potencia;
        private String tipo;
        private int brilho;

        public Lampada2(String marca, int potencia, String tipo) {
            this.marca = marca;
            this.potencia = potencia;
            this.tipo = tipo;
            brilho = 50;
        }

    public boolean isLigado() {
        return ligado;
    }

    public void alterarEstado() {
        ligado = !ligado;
    }

    public int getBrilho() {
            return brilho;
    }

    public int AumentarBrilho() {
            if(brilho>=100) {
                System.out.println("O brilho está no máximo.");
                return 0;
            }
            else {
                return brilho+=10;
            }
    }

    public int DiminuirBrilho() {
        if(brilho<=0) {
            System.out.println("O brilho está no mínimo.");
            return 0;
        }
        else {
            return  brilho-=10;
        }
    }
}
