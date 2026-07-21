abstract class Punto implements Figura {
    protected double x;
    protected double y;

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void leerDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese coordenada X: ");
        this.x = scanner.nextDouble();
        System.out.print("Ingrese coordenada Y: ");
        this.y = scanner.nextDouble();
    }

    // Métodos que no corresponden a un punto por sí solo
    @Override
    public double calcularPerimetro() {
        return 0.0;
    }

    @Override
    public double calcularArea() {
        return 0.0;
    }

    @Override
    public double calcularVolumen() {
        return 0.0;
    }

    @Override
    public void imprimirAtributos() {
        System.out.println("--- Coordenadas ---");
        System.out.println("Ubicación en el plano: (" + x + ", " + y + ")");
    }
}
