public class Cono extends Punto {
    private double radio;
    private double altura;
    private double generatriz;

    @Override
    public void LeerDatos(Scanner scanner) {
        super.LeerDatos(scanner);
        System.out.print("Ingrese el radio de la base: ");
        this.radio = scanner.nextDouble();
        System.out.print("Ingrese la altura: ");
        this.altura = scanner.nextDouble();
        this.generatriz = Math.sqrt(Math.pow(radio, 2) + Math.pow(altura, 2));
    }

    @Override
    public double calcularArea() {
        double areaBase = Math.PI * Math.pow(radio, 2);
        double areaLateral = Math.PI * radio * generatriz;
        return areaBase + areaLateral;
    }

    @Override
    public double calcularVolumen() {
        return (Math.PI * Math.pow(radio, 2) * altura) / 3;
    }

    @Override
    public void imprimirAtributos() {
        System.out.println("--- FIGURA: CONO ---");
        super.imprimirAtributos();
        System.out.println("Radio: " + radio + " | Altura: " + altura + " | Generatriz: " + generatriz);
        System.out.println("Área Total: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    }
}
