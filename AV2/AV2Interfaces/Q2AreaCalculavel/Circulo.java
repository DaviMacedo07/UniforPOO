package AV2.AV2Interfaces.Q2AreaCalculavel;

public class Circulo implements AreaCalculavel{
    private double raio;

    public double getLado() {
        return raio;
    }

    public void setLado(double lado) {
        this.raio = lado;
    }

    public Circulo(double lado) {
        this.raio = lado;
    }

    @Override
    public double calcularArea() {
        return 3.14 * (raio * raio);
    }
}
