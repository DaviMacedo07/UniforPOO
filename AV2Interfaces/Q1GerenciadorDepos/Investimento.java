package AV2Interfaces.Q1GerenciadorDepos;

public class Investimento implements Tributável{
    private double rendimento;

    public Investimento(double rendimento) {
        this.rendimento = rendimento;
    }

    @Override
    public double getValorImposto() {
        return rendimento * 0.15;
    }
}
