package AV2.AV2Interfaces.Q3Tributos;

public class SeguroVida implements Tributavel {

    public double Taxa = 42.0;

    @Override
    public double calculaTributos() {
        return Taxa;
    }
}
