import model.Mercado;
import model.Produto;

void main() {
    Mercado mercado = new Mercado("123","Cajazeiras");
    mercado.createProduto(new Produto(1,"Arroz",4.5f));
    mercado.createProduto(new Produto(1,"Arroz",4.5f));
    mercado.createProduto(new Produto(2,"Feijão",8));
    mercado.createProduto((new Produto(3,"Macarrão",3)));
    mercado.createProduto(new Produto(4,"Café",14));

    mercado.atualizar(new Produto(3,"Macarrão Integral",6));
    System.out.println(mercado.readProdutos());
}
