package modelo;

import java.time.LocalDate;

public class Comissionado extends Funcionario {
    private double comissao;
    private double totalVendas;

    public Comissionado(String cpf, String nome, LocalDate nascimento, String matricula, double comissao, double totalVendas) {
        super(cpf, nome, nascimento, matricula);
        this.comissao = comissao;
        this.totalVendas = totalVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public double calcularPagamento(){
        return totalVendas * comissao;
    }
}
