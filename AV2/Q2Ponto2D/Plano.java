package AV2.Q2Ponto2D;

public class Plano {
    public double x;
    public double y;

    public void Ponto2D() {
        this.x = 0.0;
        this.y = 0.0;
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

    public Plano(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void Origem () {
        System.out.println("Você está na Origem");
    }

   public void distance(ponto1, ponto2) {

   }

}
