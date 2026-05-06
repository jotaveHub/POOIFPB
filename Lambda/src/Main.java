import model.Pessoa;

void main() {
    List<Pessoa> pessoas = new ArrayList<>();
    pessoas.add((new Pessoa("João",LocalDate.of(2003,10,4))));
    pessoas.add(new Pessoa("José",LocalDate.of(2004,8,5)));
    pessoas.add(new Pessoa("Maria",LocalDate.of(2000,6,24)));

    class ComparadorPessoaNome implements Comparator<Pessoa>{
        @Override
        public int compare(Pessoa o1, Pessoa o2) {
            return o1.getNome().compareTo(o2.getNome());
        }
    }
}