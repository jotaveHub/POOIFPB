/*import modelo.Produto;

void main() {
    Produto produto = new Produto(1,"Arroz",4.5f,LocalDate.of(2026,2,23),true);
    Produto produto1 = new Produto(2,"Mortadela",10,LocalDate.now(),true);

    produto.setCodigoBarras(5);
    System.out.println(produto.getCodigoBarras());

    System.out.println(produto.ehVencido());
}*/

import modelo.Produto;

void main() {

    LocalDate nascimento = LocalDate.of(2001,3,5);
    System.out.println(Period.between(nascimento, LocalDate.now()).getYears());
}


