package AV2.Q4Circulo;

public class Circulo {
    public double raioCirc;
    public double ponto;

    public double getRaioCirc() {
        return raioCirc;
    }

    public void setRaioCirc(double raioCirc) {
        this.raioCirc = raioCirc;
    }

    public double getPonto() {
        return ponto;
    }

    public void setPonto(double ponto) {
        this.ponto = ponto;
    }

    public Circulo(double raioCirc) {
        this.raioCirc = raioCirc;
        this.ponto = ponto;
    }

    public void inflar() {

    }

    public double calcularArea() {
        return Math.PI * Math.pow(this.raioCirc, 2);
    }
}
