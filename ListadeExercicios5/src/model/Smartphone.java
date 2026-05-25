package model;

public class Smartphone implements AparelhoTelefonico,NavegadorInternet,ReprodutorMusical {
    public Smartphone() {
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: "+ numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Ligação...");
    }

    @Override
    public void ExibirPagina(String url) {
        System.out.println("Exibindo página:("+ url +")");
    }

    @Override
    public void AdicionarNovaAba() {
        System.out.println("Criando nova aba...");
    }

    @Override
    public void tocar(String musica) {
        System.out.println("Tocando: " + musica );
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Música...");
    }
}
