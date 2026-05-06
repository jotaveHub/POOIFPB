import model.Pessoa;

void main() {
    List<Pessoa> pessoas = new ArrayList<>();
    pessoas.add((new Pessoa("João", LocalDate.of(2003, 10, 4))));
    pessoas.add(new Pessoa("José", LocalDate.of(2004, 8, 5)));
    pessoas.add(new Pessoa("Maria", LocalDate.of(2000, 6, 24)));
    pessoas.add(new Pessoa("Ana", LocalDate.of(1999, 9, 8)));

    ComparadorPessoaNome comparador = new ComparadorPessoaNome();
    Collections.sort(pessoas, comparador);
    System.out.println(pessoas);

    Collections.sort(pessoas, new Comparator<Pessoa>() {
        @Override
        public int compare(Pessoa o1, Pessoa o2) {
            return o1.getNome().compareTo(o2.getNome());
        }
    });

    //com lambda
    Collections.sort(pessoas, (o1, o2) -> o1.getNome().compareTo(o2.getNome()));
    System.out.println(pessoas);
    //com method reference
    Collections.sort(pessoas, Comparator.comparing(Pessoa::getNascimento));
    System.out.println(pessoas);

    Set<Pessoa> conjunto = new HashSet<>();
    for(Pessoa pessoa: pessoas) {
        conjunto.add(pessoa);
    }
    System.out.println(conjunto.size());
    System.out.println(pessoas.stream().distinct().count());

    pessoas.stream().forEach(o-> System.out.println(o));

    pessoas.stream()
            .distinct()
            .filter(o->Period.between(o.getNascimento(),LocalDate.now())
                    .getYears()>=18)
            .forEach(o-> System.out.println(o));
}


    //classe interna
    class ComparadorPessoaNome implements Comparator<Pessoa>{
        @Override
        public int compare(Pessoa o1, Pessoa o2) {
            return o1.getNome().compareTo(o2.getNome());
        }
}