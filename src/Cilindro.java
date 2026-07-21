public class Cilindro extends Figura{
    private double radio;
    private  double altura;

    public Cilindro(double radio, double altura){
        this.radio = radio;
        this.altura = altura;

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        this.Area = ((double)2.0F * this.radio * Math.PI * this.altura) + ((double)2.0F * Math.PI * this.radio);
    }

    @Override
    public void calcularvolumen() {
        this.Volumen = Math.PI * this.radio * this.altura;
    }
}
