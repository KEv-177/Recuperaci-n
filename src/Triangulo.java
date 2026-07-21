public class Triangulo extends Figura {
    private double altura;
    private double base;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
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
        this.Perimetro = (double)2.0F * this.altura + this.base;
    }

    public void calcularArea() {
        this.Area = this.base * this.altura / (double)2.0F;
    }

    public String toString() {
        return "Triangulo";
    }
}