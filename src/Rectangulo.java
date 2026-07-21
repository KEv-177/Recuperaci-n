public class Rectangulo extends Figura {
    private double altura;
    private double base;

    public Rectangulo(double altura, double base) {
        this.base = base;
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void calcularPerimetro() {
        this.Perimetro = (double)2.0F * this.base + (double)2.0F * this.altura;
    }

    public void calcularArea() {
        this.Area = this.base * this.altura;
    }

    public String toString() {
        return "Rectangulo";
    }
}
