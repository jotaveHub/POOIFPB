package modelo;

import java.time.LocalDate;

public class Assalariado extends Funcionario{
    private float salario;

    public Assalariado(String cpf, String nome, LocalDate nascimento, String matricula) {
        super(cpf, nome, nascimento, matricula);
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public double calcularPagamento(){
        return salario;
    }
}

