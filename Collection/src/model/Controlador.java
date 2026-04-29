package model;

import java.util.Stack;

public class Controlador {
    private Stack adicionar;
    private Stack desfazer;

    public Controlador(Stack adicionar, Stack desfazer) {
        this.adicionar = adicionar;
        this.desfazer = desfazer;
    }

    public Stack getAdicionar() {
        return adicionar;
    }

    public void setAdicionar(Stack adicionar) {
        this.adicionar = adicionar;
    }

    public Stack getDesfazer() {
        return desfazer;
    }

    public void setDesfazer(Stack desfazer) {
        this.desfazer = desfazer;
    }
}
