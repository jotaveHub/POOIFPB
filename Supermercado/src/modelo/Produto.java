package modelo;

import java.time.LocalDate;

public class Produto {
//nome de atributo sempre começa com minusculo;
//Segunda palavra inicia com Maiuscula;
    private long codigoBarras;
    private String descricao;
    private double preco;
    private LocalDate validade;
    private boolean ehPerecivel;


    //Sobrecarga do operador
    public Produto() {
    }

    public Produto(long codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    //construtor
    public Produto(long codigoBarras, String descricao, double preco, LocalDate validade, boolean ehPerecivel) {
        this.codigoBarras = codigoBarras;
        this.descricao = descricao;
        this.preco = preco;
        this.validade = validade;
        this.ehPerecivel = ehPerecivel;
    }

    //GET - permite acesso
    public long getCodigoBarras() {
        return codigoBarras;
    }

    //SET - permite modificação
    public void setCodigoBarras(long codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

}

