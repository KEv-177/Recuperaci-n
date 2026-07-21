class Tetraedro extends Punto {
    private double arista;

    @Override
    public void LeerDatos(Scanner scanner) {
        super.LeerDatos(scanner);
        System.out.print("Ingrese la longitud de la arista: ");
        this.arista = scanner.nextDouble();
    }

    @Override
    public double calcularPerimetro() {
        return 6 * arista; // Un tetraedro tiene 6 aristas iguales
    }

    @Override
    public double calcularArea() {
        return Math.pow(arista, 2) * Math.sqrt(3);
    }

    @Override
    public double calcularVolumen() {
        return (Math.pow(arista, 3) * Math.sqrt(2)) / 12;
    }

    @Override
    public void imprimirAtributos() {
        System.out.println("--- FIGURA: TETRAEDRO ---");
        super.imprimirAtributos();
        System.out.println("Arista: " + arista);
        System.out.println("Perímetro (Total de aristas): " + calcularPerimetro());
        System.out.println("Área Total: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    }
}

