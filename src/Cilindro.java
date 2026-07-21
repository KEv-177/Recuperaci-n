class Cilindro extends Punto {
    private double radio;
    private double altura;

    @Override
    public void LeerDatos(Scanner scanner) {
        super.LeerDatos(scanner);
        System.out.print("Ingrese el radio de la base: ");
        this.radio = scanner.nextDouble();
        System.out.print("Ingrese la altura: ");
        this.altura = scanner.nextDouble();
    }

    @Override
    public double calcularArea() {
        return (2 * Math.PI * radio * altura) + (2 * Math.PI * Math.pow(radio, 2));
    }

    @Override
    public double calcularVolumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    @Override
    public void imprimirAtributos() {
        System.out.println("--- FIGURA: CILINDRO ---");
        super.imprimirAtributos();
        System.out.println("Radio: " + radio + " | Altura: " + altura);
        System.out.println("Área Total: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    }
}
