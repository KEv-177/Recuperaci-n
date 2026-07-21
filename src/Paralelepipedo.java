public class Paralelepido extends Punto {
    private double largo;
    private double ancho;
    private double altura;

    @Override
    public void LeerDatos(Scanner scanner) {
        super.LeerDatos(scanner);
        System.out.print("Ingrese el largo: ");
        this.largo = scanner.nextDouble();
        System.out.print("Ingrese el ancho: ");
        this.ancho = scanner.nextDouble();
        System.out.print("Ingrese la altura: ");
        this.altura = scanner.nextDouble();
    }

    @Override
    public double calcularPerimetro() {
        return 4 * (largo + ancho + altura);
    }

    @Override
    public double calcularArea() {
        return 2 * ((largo * ancho) + (largo * altura) + (ancho * altura));
    }

    @Override
    public double calcularVolumen() {
        return largo * ancho * altura;
    }

    @Override
    public void imprimirAtributos() {
        System.out.println("--- FIGURA: PARALELEPÍPEDO ---");
        super.imprimirAtributos();
        System.out.println("Largo: " + largo + " | Ancho: " + ancho + " | Altura: " + altura);
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área Total: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    }
}

