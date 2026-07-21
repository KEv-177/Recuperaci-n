public class Triangulo extends Punto {
    private double base;
    private double altura;
    private double ladoA, ladoB, ladoC; // Para perímetro

    @Override
    public void LeerDatos(Scanner scanner) {
        super.LeerDatos(scanner);
        System.out.print("Ingrese el lado A: ");
        this.ladoA = scanner.nextDouble();
        System.out.print("Ingrese el lado B: ");
        this.ladoB = scanner.nextDouble();
        System.out.print("Ingrese la base: ");
        this.base = scanner.nextDouble();
        System.out.print("Ingrese la altura: ");
        this.altura = scanner.nextDouble();
        // Asumiendo triángulo escaleno, si se requiere equilátero se ajusta
        this.ladoC = base; 
    }

    @Override
    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public void imprimirAtributos() {
        System.out.println("--- FIGURA: TRIÁNGULO ---");
        super.imprimirAtributos();
        System.out.println("Lados: A=" + ladoA + ", B=" + ladoB + ", C=" + ladoC);
        System.out.println("Base: " + base + " | Altura: " + altura);
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
    }
    }
