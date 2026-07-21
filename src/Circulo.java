
class Circulo extends Punto {
    private double radio;

    @Override
    public void LeerDatos(Scanner scanner) {
        super.LeerDatos(scanner);
        System.out.print("Ingrese el radio: ");
        this.radio = scanner.nextDouble();
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public void imprimirAtributos() {
        System.out.println("--- FIGURA: CÍRCULO ---");
        super.imprimirAtributos();
        System.out.println("Radio: " + radio);
        System.out.println("Perímetro (Longitud): " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
    }
}


