
package src;
/*Crie um métod4 que recebe um número inteiro e verifica se ele é um número perfeito;
Número perfeito é aquele cujo valor é igual à soma de todos seus divisores próprios.*/


public class Ex03 {
    public static void main(String[] args) {
        int numero = 6;
        int divisores = 0;

        for (int k = 1; k < numero; k++) {
            if (numero % k == 0) {
                divisores += k;
            }
        }

        if(divisores == numero) {
            System.out.println("O número é perfeito!");
        }
        else {
            System.out.println("O número não é perfeito.");
        }
    }
}

