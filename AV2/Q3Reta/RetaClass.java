package AV2.Q3Reta;

public class RetaClass {
    // reta y = ax + b
    public double cA;
    public double cL;

    public double getcA() {
        return cA;
    }

    public void setcA(double cA) {
        this.cA = cA;
    }

    public double getcL() {
        return cL;
    }

    public void setcL(double cL) {
        this.cL = cL;
    }

    public RetaClass(int coeficienteAngular, int coeficienteLinear) {
        this.cA = coeficienteAngular;
        this.cL = coeficienteLinear;
    }

    public String getEquacao() {
        return "y = " + cA + "x + " + cL;
    }

    public  boolean perteceReta(double x , double y) {
        return  y == (this.cA * x  + this.cL );
    }
}