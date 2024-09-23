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

    public Circulo(double raioCirc , double ponto) {
        this.raioCirc = raioCirc;
        this.ponto = ponto;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(this.raioCirc, 2);
    }

    public double inflar(double valor) {
        return this.raioCirc += valor;
    }
    public double desinflar(double valor) {
        return this.raioCirc -= valor;


    }
}
