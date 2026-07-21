public class Cono extends Figura{
    private double radio;
    private double altura;
    private double generatriz;

    public Cono(double radio, double altura, double generatriz){
        this.radio= radio;
        this.altura= altura;
        this.generatriz= generatriz;
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

    public double getGeneratriz() {
        return generatriz;
    }

    public void setGeneratriz(double generatriz) {
        this.generatriz = generatriz;
    }

    @Override
    public void calcularArea() {
        this.Area = (this.radio * Math.PI * this.generatriz) + (Math.PI * this.radio);
    }

    @Override
    public void calcularvolumen(){
      this.Volumen = (double) 1/3.0F * Math.PI * this.radio * this.altura;
    }
}
