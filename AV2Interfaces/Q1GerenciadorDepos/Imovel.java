package AV2Interfaces.Q1GerenciadorDepos;

public class Imovel implements Tributável{
    private double valorImovel;

    public Imovel(double valorImovel) {
        this.valorImovel = valorImovel;
    }

    @Override
    public double getValorImposto() {
        return valorImovel * 0.3;
    }
}
