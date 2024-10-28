package AV2.AV2Interfaces.Q2AreaCalculavel;

public class Quadrado implements AreaCalculavel{
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado* lado;
    }
}
