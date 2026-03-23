package modelo;

import java.time.LocalDate;

public class Produto {
//nome de atributo sempre começa com minusculo;
//Segunda palavra inicia com Maiuscula;
    private static int quantidade;
    //Por ser final (constante), inicializar em todos os construtores
    private final long codigoBarras;
    public String descricao;
    public double preco;
    public LocalDate validade;
    public boolean ehPerecivel;


    //Sobrecarga do métod4
    public Produto() {
        codigoBarras = 0;
        quantidade++;
    }

    public Produto(long codigoBarras) {
        this.codigoBarras = codigoBarras;
        quantidade++;
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
    //    this.codigoBarras = codigoBarras;
    }

    public boolean ehVencido() {
        return validade.isBefore(LocalDate.now());
    }

public String getDescricao(){
    return descricao;
}

public void setDescricao(String descricao){
    this.descricao = descricao;
}

public LocalDate getValidade() {
    return validade;
}

public void setValidade(LocalDate validade) {
    this.validade = validade;
}

public boolean getEhPerecivel() {
    return ehPerecivel;
}

public void setEhPerecivel(boolean ehPerecivel) {
    this.ehPerecivel = ehPerecivel;
}

public double getPreco() {
    return preco;
}

public void setPreco(double preco) {
    this.preco = preco;
}

    public static int getQuantidade(){
        return quantidade;
    }

//fechamento da classe
}


