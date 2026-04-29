void main() {
    List<String> lista = new ArrayList<>();
    lista.add("João");
    lista.add("Maria");
    lista.add("Pedro");
    //add Adiciona deslocando as posições correspondente
    lista.add(1,"Ana");
    //set Substitui na posição
    lista.set(0, "Teste");

    lista.add(4,"Joaquim");
    System.out.println(lista);
    System.out.println("Tamanho:" + lista.size());

    lista.remove("Teste");
    System.out.println(lista);
    System.out.println("Tamanho:" + lista.size());

    System.out.println("Posição 0?" + lista.get(0));
    System.out.println("Lista contém João?" + lista.contains("João"));

    for(String s: lista) {
        System.out.println(s);
    }
}
