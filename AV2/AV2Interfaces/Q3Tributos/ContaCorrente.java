package AV2.AV2Interfaces.Q3Tributos;

public class ContaCorrente extends Conta implements Tributavel  {

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public double calculaTributos() {
        return this.saldo * 0.01;
    }
}
