
public class Rectangulo extends Punto {
    private double base;
    private double altura;

    @Override
    public void LeerDatos(Scanner scanner) {
        super.LeerDatos(scanner);
        System.out.print("Ingrese la base: ");
        this.base = scanner.nextDouble();
        System.out.print("Ingrese la altura: ");
        this.altura = scanner.nextDouble();
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public void imprimirAtributos() {
        System.out.println("--- FIGURA: RECTÁNGULO ---");
        super.imprimirAtributos();
        System.out.println("Base: " + base + " | Altura: " + altura);
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
    }
}
