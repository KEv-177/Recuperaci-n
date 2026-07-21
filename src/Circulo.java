public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void calcularPerimetro() {
        this.Perimetro = Math.PI * this.radio / (double)2.0F;
    }

    public void calcularArea() {
        this.Area = Math.PI * this.radio;
    }

    public String toString() {
        return "Circulo";
    }
}
