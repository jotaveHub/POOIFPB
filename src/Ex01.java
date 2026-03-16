//Crie um programa que imprime todos os números múltiplos de 7 entre 0 e 1000.

public class Ex01 {
    public static void main(String[] args) {
        int acumulador = 0;

        for(int k = 7; k <= 1000; k++) {
            if(k % 7 == 0) {
                System.out.println(k);
            }
        }
    }
}