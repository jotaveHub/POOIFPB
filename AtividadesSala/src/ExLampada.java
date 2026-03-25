import model.Lampada2;

void main() {
    Lampada2 lampada = new Lampada2("Phillips",60,"lED");
    System.out.println(lampada.isLigado());
    lampada.alterarEstado();
    System.out.println(lampada.isLigado());

    lampada.AumentarBrilho();
    lampada.AumentarBrilho();
    lampada.AumentarBrilho();

    System.out.println(lampada.getBrilho());

}
