package AV2Interfaces.Q1GerenciadorDepos;

public class ImpostoTEste {
    public static void main(String[] args) {
        PessoaFisica pessoa1 = new PessoaFisica("Davi", 10000);

        double resultado = pessoa1.GerenciadorDeImpostoDeRenda();
        System.out.println("Você deverá paga o imposto de renda: " + resultado);
    }
}
