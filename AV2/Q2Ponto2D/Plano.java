package AV2.Q2Ponto2D;

public class Plano {
    private double x;
    private double y;

    public Plano(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularDistanciaParaOrigem() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public double calcularDistancia(Plano outroPonto) {
        return Math.sqrt(Math.pow(outroPonto.x - this.x, 2) + Math.pow(outroPonto.y - this.y, 2));
    }
}
