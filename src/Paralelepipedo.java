public class Paralelepipedo extends Figura3D{
    private double base;
    private double altura;

    public Paralelepipedo(double base , double altura){
        this.base = base ;
        this.altura= altura;
    }



    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {

    }
}
