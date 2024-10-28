package AV2.AV2Interfaces.Q3Tributos;

public class TesteTributavel {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1500);
        contaCorrente.depositar(2000);
        System.out.println(contaCorrente.obterSaldo());
        contaCorrente.sacar(200);
        System.out.println("Saldo da Conta Corrente: " + contaCorrente.obterSaldo());
        System.out.println("Tributos da Conta Corrente: " + contaCorrente.calculaTributos());



        ContaPoupanca contaPoupanca = new ContaPoupanca(1500);
        contaPoupanca.depositar(200);
        System.out.println("Saldo da Conta Poupança: " + contaPoupanca.obterSaldo());

        SeguroVida seguroVida = new SeguroVida();
        System.out.println("Tributos do Seguro de Vida: " + seguroVida.calculaTributos());
    }
}
