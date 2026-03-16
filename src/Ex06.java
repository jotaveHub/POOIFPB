package src;

public class Ex06 {
    public static void main (String[] args) {
        String senha_forte = "123456";

        for(int i = 0; i<3; i++) {
            String senha = IO.readln("Informe a senha:");
            if(senha.equals(senha_forte)) {
                IO.println(("Bem-Vindo"));
                break;
            }
        }
        IO.println("Senha Incorreta, tente novamente");
    }
}
