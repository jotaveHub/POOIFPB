package modelo;

public class Coordenador extends Pessoa implements Autenticar {
    private String senha;

    public Coordenador(String cpf, String nome, String email, String senha) {
        super(cpf, nome, email);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String email, String senha) {
        return this.getEmail().equals(email) && this.senha.equals(senha);
    }
}
