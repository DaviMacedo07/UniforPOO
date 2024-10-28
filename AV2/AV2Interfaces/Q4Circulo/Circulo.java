package AV2.AV2Interfaces.Q4Circulo;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double AreaCalc() {
        return Math.PI * (this.raio * this.raio);
    }
}
