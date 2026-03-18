import modelo.Produto;

void main() {
    Produto produto = new Produto(1,"Arroz",4.5f,LocalDate.of(2026,6,3),true);
    Produto produto1 = new Produto(2,"Mortadela",10,LocalDate.now(),true);

    produto.setCodigoBarras(5);
    System.out.println(produto.getCodigoBarras());
}
