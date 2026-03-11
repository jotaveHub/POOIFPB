void main() {
    double a = 4.0;
    double b = 2.0;
    double c = 1.0;

    double Delta = Math.pow(b,2) - 4*a*c;
    double x1 = ((b * -1) + Math.sqrt(Delta)) / (2 * a);
    double x2 = ((b * -1) - Math.sqrt(Delta)) / (2 * a);

    if(Delta < 0) {
        System.out.println("Não possui raízes reais.");
    }
    if(Delta == 0) {
        System.out.println("Só possui uma raiz: %.2f"+(-b) / (2*a));
    }
    if(Delta > 0) {
    System.out.println(Delta);
    System.out.println(x1);
    System.out.println(x2);
    }

}
